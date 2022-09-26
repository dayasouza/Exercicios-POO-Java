package ADS;

public class Principal {

	public static void main(String[] args) {
		Avaliacao luigi = new Avaliacao();
		Avaliacao mario = new Avaliacao(7,4,10);
		luigi.n1 = 8;
		luigi.n2 = 3;
		luigi.n3 = 7.5;
		
		System.out.println("Média Aritmetica do Mario: " + mario.mediaAritmetica());
		System.out.println("Media Ponderada do Mario: " + mario.mediaPonderada());
		
		System.out.println("Média Aritmetica do Luigi: " + luigi.mediaAritmetica());
		System.out.println("Media Ponderada do Luigi: " + luigi.mediaPonderada());

	}

}
