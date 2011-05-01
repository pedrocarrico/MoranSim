package pt.moransim;

import org.apache.log4j.Logger;

public class MoranSimulator implements Simulator{

    private static Logger logger = Logger.getLogger(MoranSimulator.class);

    private Population population;

    public MoranSimulator(int numberOfIndividualsInPopulation) {
        population = new Population(numberOfIndividualsInPopulation);
    }

    public void run(int numberOfIterations) {
        if (logger.isDebugEnabled())
            logger.debug(">run");

        for (int i = 0; i < numberOfIterations; i++)
            population.evolve();

        population.report();

        if (logger.isDebugEnabled())
            logger.debug("<run");
    }

    public Population getPopulation() {
        return population;
    }
}
