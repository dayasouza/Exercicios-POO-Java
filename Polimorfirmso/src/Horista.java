public class Horista extends Funcionario{
    int horas;
    float valorHora;

    public Horista(String nome,int horas, float valorHora){
        super(nome);
        this.horas=horas;
        this.valorHora=valorHora;
    }

    @Override
    public float pagamento() {
        return horas * valorHora;
    }
}