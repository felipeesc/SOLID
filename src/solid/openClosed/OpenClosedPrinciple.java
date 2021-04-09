package solid.openClosed;

public class OpenClosedPrinciple {
    // TODO    Classe que viola o OCP;
    class Contrato {
    }

    class ContratoClt extends Contrato {
        int salario() {
            return 10;
        }
    }

    class Estagio extends Contrato {
        int bolsaAuxilio() {
            return 5;
        }
    }

    class FolhaDePagamento<saldo> {
        protected int saldo;

        void calcular(Contrato contrato) {
            if (contrato instanceof ContratoClt) {
                this.saldo = ((ContratoClt) contrato).salario();
            } else if (contrato instanceof Estagio) {
                this.saldo = ((Estagio) contrato).bolsaAuxilio();
            }
        }
    }

    // TODO aplicando conceito OCP
    interface Remuneravel {
        int salario = 0;

        static int remuneracao() {
            return salario;
        }
    }

    class ContratosClt implements Remuneravel {
        public int remuneracao() {
            return salario;
        }
    }

    class ContratosPj implements Remuneravel {
        public int remuneracao() {
            return salario;
        }
    }

    class Estagios implements Remuneravel {
        public int remuneracao() {
            return salario;
        }
    }

    class FolhasDePagamento {
        protected int saldo;

        int calcular(Remuneravel remuneravel) {
            return this.saldo = remuneravel.salario;
        }

    }


}
