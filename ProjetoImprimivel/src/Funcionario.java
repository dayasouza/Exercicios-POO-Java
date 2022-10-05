public class Funcionario implements Imprimivel{
    String nome;
    String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("---------------------------");
    }
}
