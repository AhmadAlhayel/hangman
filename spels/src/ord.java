public class ord {
    private String ord;
    private String gissning;

    public ord (String ord) {
        this.ord = ord;
        this.gissning = "-".repeat(ord.length());
    }

    public String getOrd() {
        return ord;
    }

    public String getGissa() {
        return gissning;
    }

    public boolean matchGissa(char bokstav) {
        boolean matchade = false;
        char[] ordArray = ord.toCharArray();
        char[] gissningArray = gissning.toCharArray();
        for (int i = 0; i < ordArray.length; i++) {
            if (ordArray[i] == bokstav) {
                gissningArray[i] = bokstav;
                matchade = true;
            }
        }
        gissning = new String(gissningArray);
        return matchade;
    }

    public boolean harVunit() {
        return gissning.equals(ord);
    }

    public void displayLetter(char bokstav) {
    }
}

