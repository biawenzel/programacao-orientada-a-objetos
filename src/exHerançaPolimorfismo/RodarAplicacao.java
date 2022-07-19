package exHerançaPolimorfismo;

public class RodarAplicacao {

    public static void main(String[] args) {

        //vetor do tipo ClasseMae de nome classes:
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //polimorfismo com sobrescrita:
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        //apenas sobrescrita:
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }


}
