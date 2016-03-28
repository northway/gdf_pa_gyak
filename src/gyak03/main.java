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
        System.out.print("Random number between 1 .. 99: ");
        System.out.println(rand.nextInt((99 - 1) + 1) + 1);
        System.out.print("Random number between 10 .. 99: ");
        System.out.println(rand.nextInt((99 - 10) + 1) + 10);
        System.out.print("Random number between 13 .. 130: ");
        System.out.println(rand.nextInt((130 - 13) + 1) + 13);

        // <editor-fold>
    }

}
