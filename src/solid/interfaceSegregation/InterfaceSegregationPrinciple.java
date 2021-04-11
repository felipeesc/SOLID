package solid.interfaceSegregation;

public class InterfaceSegregationPrinciple {
    // TODO INICIO FORMA INCORRETA DO ISP.
    interface Aves {
        public void setLocalizacao();
        public void setAltitude();
        public void renderizar();
    }

    class Papagaio implements Aves {

        @Override
        public void setLocalizacao() {

        }

        @Override
        public void setAltitude() {

        }

        @Override
        public void renderizar() {

        }
    }

    class Pinguim implements Aves {

        @Override
        public void setLocalizacao() {

        }

        @Override
        public void setAltitude() {
// NÃO FAZ NADA, PINGUINS NÃO VOAM!
        }

        @Override
        public void renderizar() {

        }
    }
    // TODO FIM DA FORMA INCORRETA DO ISP

    /////////////////////////////////////////////////////////////////////////////////

    //TODO FORMA CORRETA INICIO isp

interface Aves2 {
    public void setLocalizacao();
    public void renderizar();
}

interface AvesQueVoam extends Aves {
    public void setAltitude();
}
class Papagaio2 implements AvesQueVoam {

    @Override
    public void setLocalizacao() {

    }

    @Override
    public void renderizar() {

    }

    @Override
    public void setAltitude() {

    }

}

    class Pinguim2 implements Aves2 {

        @Override
        public void setLocalizacao() {

        }

        @Override
        public void renderizar() {

        }
    }

    // TODO FIM DA FORMA correta DO ISP



}
