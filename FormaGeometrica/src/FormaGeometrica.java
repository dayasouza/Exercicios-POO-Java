import java.util.Scanner;
import java.io.IOException;

public abstract class FormaGeometrica {
    public double area;
    public abstract void calculaArea();
}

class Quadrado extends FormaGeometrica{
    @Override
    public void calculaArea() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a medida do lado");
        double lado = teclado.nextDouble();
        area = lado * lado;
    }
}

class Circulo extends FormaGeometrica{
    double raio;
    double area;
    final double PI = 3.1416;
    @Override
    public void calculaArea() {
        System.out.println("Escreva o valor do raio");
        Scanner teclado = new Scanner(System.in);
        raio = scan.nextFloat();
        area = scan.nextFloat();
        
        area = PI * (raio * raio);
                
        
    }
}
