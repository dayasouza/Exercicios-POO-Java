package empresa;

import java.util.Scanner; //atalho ctrl + shift + o

public class Principal {

	public static void main(String[] args) {
		
		int peso;
		double altura;
		
		System.out.println("Digite Peso seguido de altura: ");
		Scanner teclado = new Scanner(System.in);
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("IMC: %.2f", imc);
		
		//%d para número inteiro, %s para string, %f para float, %c para caracter

	}

}
