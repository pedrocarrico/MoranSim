package pt.moransim;

import junit.framework.TestCase;

public class MoranSimulatorTest extends TestCase{

    public void testSimulator(){
        int numberOfIndividualsInPopulation = 1000;

        Simulator moransim = new MoranSimulator(numberOfIndividualsInPopulation);
        moransim.run(5);

        Population pop = moransim.getPopulation();

        assertNull(pop.getIndividuals()[pop.getFreeSlot()]);
    }
}
