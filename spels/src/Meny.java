import java.util.Scanner;

public class Meny {
    public void visaMeny() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till Hänga Gubbe!");
        System.out.println("Vad vill du göra?");
        System.out.println("1.Spela");
        System.out.println("2.Lägg till ord i ordlistan");
        System.out.println("3.Avsluta");

        int val = scanner.nextInt();


        switch (val) {
            case 1:
                 //startHangman;
                break;
            case 2:
                System.out.println("Skriv in ett nytt ord att lägga till: ");
                String nyttOrd = scanner.nextLine();
                ordLista.laggTillOrd(nyttOrd);
                System.out.println(nyttOrd + " har lagts till i ordlistan.");
                break;
            case 3:
                System.out.println("Hej då!");
                System.exit(0);
                break;
            default:
                System.out.println("Felaktigt val, försök igen.");
                break;
        }
    }
}

