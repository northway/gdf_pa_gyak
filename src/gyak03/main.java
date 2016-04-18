package gyak03;

import java.util.Random;

/**
 * Véletlenszám, for ciklus, tömbök, ciklusok
 *
 * @author northway
 */
public class main {

    public static void main(String[] args) {

        // <editor-fold defaultstate="collapsed" desc="Random numbers">    
        // 1
        Random rand = new Random();

        System.out.print("Random boolean: ");
        System.out.println(rand.nextBoolean());

        System.out.print("Random integer: ");
        System.out.println(rand.nextInt());

        System.out.print("Random long: ");
        System.out.println(rand.nextLong());

        System.out.print("Random real ");
        System.out.println(rand.nextFloat());

        System.out.print("Random doule: ");
        System.out.println(rand.nextDouble());

        // 2
        System.out.print("Random number between 0 .. 99: ");
        System.out.println(rand.nextInt((99 - 0) + 1));

        // 3
        System.out.print("Random number between 1 .. 99: ");
        System.out.println(rand.nextInt((99 - 1) + 1) + 1);

        // 4
        System.out.print("Random number between 10 .. 99: ");
        System.out.println(rand.nextInt((99 - 10) + 1) + 10);

        // 5
        System.out.print("Random number between 13 .. 130: ");
        System.out.println(rand.nextInt((130 - 13) + 1) + 13);

        // 6
        System.out.print("Fej vagy írás: ");
        if (rand.nextBoolean()) {
            System.out.println("Fej!");
        } else {
            System.out.println("Írás!");
        }

        // 7
        System.out.print("Random 3 digit even number: ");

        int evenRandom;

        do {
            evenRandom = rand.nextInt((999 - 100) + 1) + 100;
        } while (evenRandom % 2 != 0);

        System.out.println(evenRandom);

        // 8
        System.out.print("Hatos lottó szám: ");
        System.out.println(rand.nextInt((45 - 1) + 1) + 1);

        // 9
        System.out.print("Roll the dice: ");
        System.out.println(rand.nextInt((6 - 1) + 1) + 1);

        // 10
        System.out.print("Rolling two dices: ");
        int dice1 = rand.nextInt((6 - 1) + 1) + 1;
        int dice2 = rand.nextInt((6 - 1) + 1) + 1;
        System.out.println(dice1 + " <-> " + dice2);
        System.out.println("SUM of the dices: " + (dice1 + dice2));

        // 11
        System.out.print("Random number between -10 .. -20: ");
        System.out.println((rand.nextInt((20 - 10) + 1) + 10) * -1);

        // 12
        // 13
//        System.out.println("Random number between your limits.");
//        
//        System.out.print("Limit 1: ");
//        int limit1 = extra.Console.readInt();
//        
//        System.out.print("Limit 2: ");
//        int limit2 = extra.Console.readInt();
//        
//        if (limit1 > limit2) {
//            int tmp = limit2;
//            limit2 = limit1;
//            limit1 = tmp;
//        }
//        
//        System.out.println(rand.nextInt((limit2 - limit1) + 1) + limit1);
        // 14
//        for (int i = 0; i < 15; i++) {
//            
//            int totoRand = rand.nextInt((3 - 1) + 1) + 1;
//            
//            String toto;
//            
//            if(totoRand == 3) {
//                toto = "X";
//            } else {
//                toto = String.valueOf(totoRand);
//            } 
//            
//            System.out.println("Totó " + i + ": " + toto);
//        }
        // </editor-fold>        
    }

}
