package pt.moransim;

import org.junit.Test;
import static org.junit.Assert.*;

public class IndividualTest {

    public IndividualTest() {
    }

    @Test
    public void testDie() {
        System.out.println("die");
        Individual individual = new Individual(1);
        assertEquals(individual.getStatus(), Individual.Status.ALIVE);
        individual.die();
        assertEquals(individual.getStatus(), Individual.Status.DEAD);
    }

    @Test
    public void testDuplicate() {
        System.out.println("duplicate");
        int id = 3;
        Individual individual1 = new Individual(2,1);
        Individual individual2 = individual1.duplicate(id);

        assertEquals(individual1.parentId(), individual2.parentId());
        assertEquals(individual2.getId(), id);
    }

}