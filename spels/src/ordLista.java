import java.util.ArrayList;
import java.util.Random;

public class ordLista {
    private ArrayList<String> ordLista;
    private String valtOrd;

    public ordLista() {
        ordLista = new ArrayList<String>();
        ordLista.add("katt");
        ordLista.add("hund");
        ordLista.add("apa");
        valtOrd = randomOrd();

    }

    public static void laggTillOrd(String nyttOrd) {
    }

    public void addOrd(String ord) {
        ordLista.add(ord);
    }

    public void removeOrd(String ord) {
        ordLista.remove(ord);
    }

    public String getOrd() {
        return valtOrd;
    }

    public void valjOrd() {
        valtOrd = randomOrd();
    }
    public String randomOrd() {
        Random rand = new Random();
        int index = rand.nextInt(ordLista.size());
        return ordLista.get(index);
    }
}

