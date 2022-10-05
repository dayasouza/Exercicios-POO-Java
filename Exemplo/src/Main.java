public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(111,"Mario","444.555.666-77");
        Usuario u2 = new Usuario(111,"Mario","444.555.666-77");
        Usuario u3 = u1;

        System.out.println(u1 == u2);
        System.out.println(u1 == u3);
        System.out.println();

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));



    }
}