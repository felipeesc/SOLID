package solid.dependecyInversion;

public class DependecyInversionPrinciple {
    //modulo de alto nivel não devem depender de modulos de baixos niveis.. ambos devem depender da abstração..

    // todo INICIO codigo com alto nivel de acoplamento
    class MySQLConnection {

    }
    class LembrarSenha {
        private MySQLConnection dbConnection;

        public LembrarSenha() {
            this.dbConnection = new MySQLConnection();
            // responsabilidade de criar uma instancia,
            // tivesse que reaproveitar em outro sistema, seria obrigado levar a classe
        }
    }
    // todo FIM

    // todo INICIO, DESACOPLANDO MAS VIOLANDO OUTROS PRINCIPLE...

    class LembrarSenhaS {
        private MySQLConnection dbConnection;
// todo, mysql deixa de ser responsabilidade da classe e virou uma depedencia, deve ser injetada
//        via metodo construtor.. usando injeção depedencia
        public LembrarSenhaS(MySQLConnection dbConnection) {
            this.dbConnection = dbConnection;

        }
    }
    //MAS ESTAMOS VIOLANDO PRINCIPLE DA INVERSÃO DA DEPENDENCIA E OPEN CLOSED...

    // todo FIM, DESACOPLANDO MAS VIOLANDO OUTROS PRINCIPLE...


    //TODO FORMA CORRETA

    interface DBConnectionInterface {
        void connect();
    }

    class MysqlConnection implements DBConnectionInterface {

        @Override
        public void connect() {

        }
    }

    class OracleConnection implements DBConnectionInterface {

        @Override
        public void connect() {

        }
    }

    class SQLServer implements DBConnectionInterface {

        @Override
        public void connect() {

        }
    }

    class LembretSenha {
        private DBConnectionInterface dbConnection;

        public LembretSenha(DBConnectionInterface dbConnection) {
            this.dbConnection = dbConnection;
        }
    }

    // todo agora sim, desacoplando e código lindo...
    // todo class  senha não tem acoplamento, e facilitando a reasubilidade do codigo
}
