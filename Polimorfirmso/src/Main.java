public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Mario");
        Funcionario f2 = new Funcionario("Mario");

        System.out.println("Nome f1: " + f1.nome);
        System.out.println("Nome f2: " + f2.nome);

        System.out.println();
        f2.nome = "Luigi";

        System.out.println("Nome f1: " + f1.nome);
        System.out.println("Nome f2: " + f2.nome);
    }
}