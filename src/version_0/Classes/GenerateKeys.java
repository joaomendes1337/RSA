package version_0.Classes;

import java.util.*;

public class GenerateKeys {


    private  long p_key;
    private long q_key;

    public GenerateKeys(int seed) {

        generateKeys(seed);
    }

    private void generateKeys(int seed) {
        short n_of_primes = 0;
        while (true) {
            double possible_key = (int ) generateRandom( seed ) - 1;
            if (is_prime( possible_key )) {
                n_of_primes++;
                switch (n_of_primes) {
                    case 1:
                        this.p_key = (long) possible_key;
                        break;
                    case 2:
                        this.q_key = (long) possible_key;
                        return;
                }
            }
        }

    }

    private double generateRandom(int seed) {
        return  Math.abs(Math.random() * Math.pow( 10, seed));
    }



    private static boolean is_prime(double number) {

        if (number < 1) {
            return false;
        } else if (number <= 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;

    }

    public long getP_key() {
        return p_key;
    }

    public long getQ_key() {
        return q_key;
    }
}


