package solid.singleResponsibility;

public class SingleReponsibilityPrinciple {

// TODO    Classe que viola o SRP, verbosa e realiza 3 tipos distintos de tarefa
// TODO    faz manipulação, exibição e informações sobbre pedidos...
// TODO    auto acoplamento, dificuldade para testes e reaproveitamento de codigo

    class Pedidos {
        void calcularSomaTotal(){}
        void obterItens(){}
        void adicionarItens(){}
        void deletarItens(){}

        void solicitarImpressao(){}
        void mostrarOrdem(){}

        void carregar(){}
        void salvar(){}
        void atualizar(){}
        void deletar(){}
    }


// TODO    Refatorando, com cada classe cuidando de sua unica responsabilidade;
// TODO     responsabilidade unica não se limita só as classes, tudo que é responsavel
// TODO     por executar uma ação deve ser responsavel ao que se porpoe a fazer;


    class Pedido {
        // TODO    classe pedido é responsavel por gerir os itens e calcular total
        void calcularSomaTotal(){}
        void obterItens(){}
        void adicionarItens(){}
        void deletarItens(){}
    }

    class PedidoRepositorio {
        // TODO    classe PedidoRepositorio controla o pedido em si carregando, salvando e removendo
        void carregar(){}
        void salvar(){}
        void atualizar(){}
        void deletar(){}
    }

    class VisualizarPedido {
        // TODO    classe VisualizarPedido é responsavel por mostrar e imprirmir o pedido
        void solicitarImpressao(){}
        void mostrarOrdem(){}
    }

}
