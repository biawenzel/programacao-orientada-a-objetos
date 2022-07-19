package exEstruturaBasica;

public class RodarAplicacao {

    public static void main(String[] args) {
        //1a opção: cria um obj vazio e depois add os valores (usa set e get)
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //2a opção: cria o obj ja com os valores (não precisa do set)
        Carro carro2 = new Carro("Cinza", "Mercedez-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.39));

    }
}
