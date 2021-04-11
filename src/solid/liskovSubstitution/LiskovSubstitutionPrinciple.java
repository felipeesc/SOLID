package solid.liskovSubstitution;

public class LiskovSubstitutionPrinciple {
    // uma classe derivada deve ser substituivel por sua classe base...
    static class A {
       public String buscaNome() {
            return "Meu nome é A";
        }
    }

    static class B extends A {
        //essa classe extende a classe A o método buscaNome

        public String buscaNome() {
            return "Meu nome é B";
        }
    }

    // estamos passando como parametro classe pai quanto a classe derivada.
    static String imprimeNome(A obj1) {
        return obj1.buscaNome();
    }

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        imprimeNome(obj1);
        imprimeNome(obj2);
    }


}


