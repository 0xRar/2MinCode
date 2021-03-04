/*
2 Minutes Code Algorithm
- This small algorithm will spit a random 10 digit code every 2 minutes

@author 0xRar
 */

import java.util.Random;

public class Algorithm {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        for (int i = 0; i < 5;) {
            final long digits = 10000000000L;
            final long code = (long) (rand.nextDouble() * digits);

            System.out.println("Code: " +code);

            Thread.sleep(120000);
        }
    }
}
