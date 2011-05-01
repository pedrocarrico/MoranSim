package pt.moransim;

import java.util.Random;

public class RandomGeneratorImpl implements RandomGenerator {

    private final static Random generator = new Random();

    public int nextInt(int bound) {
         return generator.nextInt(bound);
    }
}
