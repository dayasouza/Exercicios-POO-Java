import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor entre 0 e 10: ");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        try {
            if (valor > 10 && valor <0) {
                throw new ValorInvalidoException("Valor Inválido");
            }
        }



    }
}