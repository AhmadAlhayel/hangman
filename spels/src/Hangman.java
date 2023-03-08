
//import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    private ordLista ordLista;
    private ord ord;
    private Spelare spelare;
    private ArrayList<Character> gissadeBokstaver;

    public Hangman() {
        this.ordLista = new ordLista();
        this.spelare = new Spelare("Spelare");
        this.gissadeBokstaver = new ArrayList<>();
    }

    public void start() {
        System.out.println("Välkommen till min spel");
        Scanner input = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String namn = input.nextLine();
        spelare = new Spelare(namn);

        Boolean keepPlaying = true;
        Boolean winner = false;

        while (keepPlaying) {
            gissadeBokstaver = new ArrayList<Character>();
            this.ord = new ord(ordLista.randomOrd());
            System.out.println("Du ska gissa på ett ord som består av " + ord.getOrd().length() + " bokstäver.");

            while (!winner) {
                gissa();
                System.out.println(ord.getGissa());

                winner = winnerCheck();
                if (winner) {
                    System.out.println("Grattis! Du gissade rätt!");
                    System.out.println("Ordet var " + ord.getOrd());
                }
            }
            System.out.println("Vill du spela igen? (j/n)");
            String svar = input.next();

            if (svar.equals("j")) {
                keepPlaying = true;
                winner = false;
            } else {
                keepPlaying = false;
                finishGame();
            }
        }
    }
    private void gissa() {
        System.out.println(spelare);
        System.out.println(ord.getGissa());
        System.out.println("Gissa på en bokstav:");
        Scanner input = new Scanner(System.in);
        String gissa = input.next();
        char letter = gissa.charAt(0);
        spelare.increaseGissningar();

        if (gissadeBokstaver.contains(letter))
        {
            System.out.println("Du har redan gissat på bokstaven " + letter );
            return;
        }
        gissadeBokstaver.add(letter);
        if (!ord.matchGissa(letter)) {
            System.out.println("Tyvärr bokstaven " + letter + " finns inte i ordet.");
            return;
        }
        else
        {
            System.out.println("fel!.");
        }
    }



    private boolean winnerCheck() {
        return ord.getOrd().equals(ord.getGissa());
    }

    private void finishGame() {
        System.out.println("Thanks");
        System.exit(0);
    }
}




