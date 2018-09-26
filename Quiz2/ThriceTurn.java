import java.util.Scanner;

public class ThriceTurn {
    public static void main(String[] args) {

        int dice1 = 1;
        int dice2 = 2;
        int dice3 = 3;
        int roll = 0;
        int score = 0;
        int rolltotal;
        int tripletworth;
        boolean retire = false;
        String decision;

        System.out.println("\r");
        System.out.println("R O U N D  1  S T A R T");
        System.out.println("A D D I T I O N  R O U N D");
        System.out.println("\r");

        while(dice1 != dice2 || dice2 != dice3) {
            dice1 = (int)(Math.random() * 6 + 1); 
            dice2 = (int)(Math.random() * 6 + 1); 
            dice3 = (int)(Math.random() * 6 + 1); 
    
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Dice 3: " + dice3);
            System.out.println("\r");

            rolltotal = dice1 + dice2 + dice3;

            if(roll % 3 != 2) {
                score = score + rolltotal;
                roll++;
                System.out.println("Score: " + score);
                System.out.println("\r");
            }
            else {
                score = score - rolltotal;
                roll = 0;
                System.out.println("Score: " + score);
                System.out.println("\r");
            }
        }
        tripletworth = dice1 + dice2 + dice3;
        System.out.println("Triplet Worth: " + tripletworth);

        System.out.println("\r");
        System.out.println("R O U N D  2  S T A R T");
        System.out.println("M U L T I P L I C A T I O N  R O U N D");
        System.out.println("\r");

        for(int i = 1; i <= tripletworth; i++) {
            dice1 = (int)(Math.random() * 6 + 1); 
            dice2 = (int)(Math.random() * 6 + 1); 
            dice3 = (int)(Math.random() * 6 + 1); 

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Dice 3: " + dice3);
            System.out.println("\r");

            score = score + (dice1 * dice2 * dice3);
            System.out.println("Score: " + score);
            System.out.println("\r");
        }

        System.out.println("\r");
        System.out.println("R O U N D  3  S T A R T");
        System.out.println("R E T I R I N G  R O U N D");
        System.out.println("\r");

        while(!retire) {
            System.out.println("Would you like to retire, or go for triple(Y or N)?");
            decision = scan.nextLine();
            if(decision == "Y" || decision == "y") {
                retire = true;
            } 
        }
    }
}