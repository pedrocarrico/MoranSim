package pt.moransim;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoranSimulatorTest{

    @Test
    public void testSimulator(){
        int numberOfIndividualsInPopulation = 1000;

        Simulator moransim = new MoranSimulator(numberOfIndividualsInPopulation);
        moransim.run(5);

        Population pop = moransim.getPopulation();
        assertNull(pop.getIndividuals()[pop.getFreeSlot()]);
    }
}
