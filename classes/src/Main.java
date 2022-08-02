public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.setModelo("Bic Cristal");
        c1.setCor("Azul");
        System.out.println("O modelo da caneta é "+ c1.getModelo());
        System.out.println("A cor da caneta é  "+ c1.getCor());
    }

}