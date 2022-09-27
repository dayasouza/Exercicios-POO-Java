import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList(); // Integer representa os numeros inteiros
        HashSet <Integer> conjunto = new HashSet<>();
        HashMap <String, Integer> mapa = new HashMap<>();

        int soma;
        soma = 0;
        for (int i=0; i < lista.size(); i++){
            soma += lista.get(i);
        }

        soma = 0;
        for (int item : lista) {
            soma += item;
        }

        soma = 0;
        //Iterator it = mapa.entrySet().iterator();
        //Iterator it = conjunto.iterator();
        Iterator it = lista.iterator();

        while(it.hasNext()) {
            soma += (int)it.next();
        }
    }
}