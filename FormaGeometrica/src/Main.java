public class Main {
    public static void main(String[] args) {
        FormaGeometrica forma;

        //Forma é um círculo
        forma = new Circulo();
        forma.calculaArea();
        System.out.println(forma.area);


        //Forma agora é um quadrado
        forma = new Quadrado();
        forma.calculaArea();
        System.out.println(forma.area);

    }
}