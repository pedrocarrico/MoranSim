package pt.moransim;

public class MoranSimulator implements Simulator{

    private Population population;

    public MoranSimulator() {
        population = new Population(1000);
    }

    public void run(int numberOfIterations) {

        for (int i = 0; i < numberOfIterations; i++)
            population.evolve();
    }

}
