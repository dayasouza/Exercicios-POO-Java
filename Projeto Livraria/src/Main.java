public class Main {
    public static void main(String[] args) {
        LivroDigital ld = new LivroDigital("Senhor dos Aneis",
                new Autor("Tolkien", "Britanico","tolkien@email.com"),
                        "Aventura",5, 10000,3500 );
        ld.info();
        System.out.println();
        LivroFisico lf= new LivroFisico("As crônicas de Gelo e Fogo",
                new Autor("George Martin", "Britanico","martin.george@email.com"),
                "Aventura",3, 8000,5000 );
        lf.info();

    }
}