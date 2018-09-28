import java.util.Scanner;

public class ThriceTurn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dice1 = 1;
        int dice2 = 2;
        int dice3 = 3;
        int roll = 0;
        int rollnumber = 1;
        int score = 0;
        int exponent = 0;
        int x = 0;
        int addthis = 1;
        int rolltotal;
        int tripletworth;
        int initialtriplet;
        int finaltriplet;
        int decision;
        String confirmation = "12345";
        boolean retire = false;
        boolean triplet = false;

        System.out.println("\r");
        System.out.println("---------------------------");
        System.out.println("R O U N D  1  S T A R T");
        System.out.println("A D D I T I O N  R O U N D");
        System.out.println("---------------------------");
        System.out.println("\r");

        while(dice1 != dice2 || dice2 != dice3) {
            dice1 = (int)(Math.random() * 6 + 1); 
            dice2 = (int)(Math.random() * 6 + 1); 
            dice3 = (int)(Math.random() * 6 + 1); 
    
            System.out.println("-------------------------");
            
            System.out.println("Roll Number: " + rollnumber);

            System.out.println("\r");
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Dice 3: " + dice3);
            System.out.println("\r");

            rolltotal = dice1 + dice2 + dice3;


            if(roll % 3 != 2) {
                score = score + rolltotal;
                roll++;
                System.out.println("Score: " + score);
            }
            else {
                score = score - rolltotal;
                roll = 0;
                System.out.println("Score: " + score);
            }
            rollnumber++;
        }
        
        initialtriplet = dice1;
        tripletworth = dice1 + dice2 + dice3;
        System.out.println("Triplet Worth: " + tripletworth);

        System.out.println("\r");
        System.out.println("----------------------------------------");
        System.out.println("R O U N D  2  S T A R T");
        System.out.println("M U L T I P L I C A T I O N  R O U N D");
        System.out.println("----------------------------------------");
        System.out.println("\r");

        rollnumber = 1;

        for(int i = 1; i <= tripletworth; i++) {
            dice1 = (int)(Math.random() * 6 + 1); 
            dice2 = (int)(Math.random() * 6 + 1); 
            dice3 = (int)(Math.random() * 6 + 1); 

            System.out.println("-------------------------");
            System.out.println("Roll Number: " + rollnumber);
            System.out.println("\r");
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Dice 3: " + dice3);
            System.out.println("\r");

            score = score + (dice1 * dice2 * dice3);
            System.out.println("Score: " + score);

            rollnumber++;
        }

        System.out.println("\r");
        System.out.println("---------------------------");
        System.out.println("R O U N D  3  S T A R T");
        System.out.println("R E T I R I N G  R O U N D");
        System.out.println("---------------------------");
        System.out.println("\r");

        rollnumber = 1;

        System.out.println("Your score is currently " + score + ". Would you like to (1)Retire, or (2)Roll for Triple " + initialtriplet + "s?");
        decision = scan.nextInt();
        
        if(decision == 1) {
            retire = true;
        }
        
        if(!retire) {
            while(!triplet) {
                dice1 = (int)(Math.random() * 6 + 1); 
                dice2 = (int)(Math.random() * 6 + 1); 
                dice3 = (int)(Math.random() * 6 + 1); 

                System.out.println("-------------------------");
                System.out.println("Roll Number: " + rollnumber);
                System.out.println("\r");
                System.out.println("Dice 1: " + dice1);
                System.out.println("Dice 2: " + dice2);
                System.out.println("Dice 3: " + dice3);
                System.out.println("\r");

                rollnumber++;
                
                if(dice1 == dice2 && dice2 == dice3) {
                    triplet = true;
                    finaltriplet = dice1;
                    
                    if(finaltriplet == initialtriplet) {
                        score = score * 3;
                        System.out.println("TRIPLET MATCH! SCORE MULTIPLIED BY 3!");
                    }
                    else {
                        score = finaltriplet * 3;
                        System.out.println("--------------------------------------------");
                        System.out.println("TRIPLETS DONT MATCH! SCORE IS CURRENTLY " + score);
                        System.out.println("PRESS ENTER TO CONFIRM!");
                        System.out.println("--------------------------------------------");
                        rollnumber = 1;

                        confirmation = scan.nextLine();
                        confirmation = scan.nextLine();
                        
                        if(confirmation.length() == 0) {
                            triplet = false;
                            while(!triplet) {
                                dice1 = (int)(Math.random() * 6 + 1); 
                                dice2 = (int)(Math.random() * 6 + 1); 
                                dice3 = (int)(Math.random() * 6 + 1); 

                                while(x < exponent) {
                                    addthis = addthis * 3;
                                    x++;
                                }

                                score = score + addthis;

                                System.out.println("-------------------------");
                                System.out.println("Roll Number: " + rollnumber);
                                System.out.println("\r");
                                System.out.println("Dice 1: " + dice1);
                                System.out.println("Dice 2: " + dice2);
                                System.out.println("Dice 3: " + dice3);
                                System.out.println("\r");
                                System.out.println("Score: " + score); 

                                exponent++;
                                rollnumber++;

                                if(dice1 == dice2 && dice2 == dice3) {
                                    triplet = true;
                                }
                            }
                        }    
                    }
                }
            }
        }
        System.out.println("Game Complete! Your Final Score: " + score);   
    }
}