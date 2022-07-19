package exHerançaUpDowncast;

public class rodarAplicacao {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente(); //os 3 são upcasts
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente1 = new Funcionario();
        Vendedor vendedor1 = (Vendedor) new Funcionario(); //downcast deve ser evitado pois dá erro
    }
}
