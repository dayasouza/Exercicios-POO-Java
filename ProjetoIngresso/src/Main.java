public class Main {
    public static void main(String[] args) {
        IngressoVip iv = new IngressoVip("Rock in São Paulo", 500, 150);

        iv.info();
        System.out.println("-------");

        Ingresso i = new Ingresso("Lola Pallozza", 500);

        i.info();
    }
}