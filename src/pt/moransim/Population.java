package pt.moransim;

import org.apache.log4j.Logger;

class Population {
    private static Logger logger = Logger.getLogger(Population.class);
    
    private static final RandomGenerator generator = new RandomGeneratorImpl();
    private int NOT_INITIALIZED = -1;

    private Individual[] individuals;
    private int freeSlot;

    private int lastId;

    public Population(int numberOfIndividuals) {
        individuals = new Individual[numberOfIndividuals + 1];
        
        for (lastId = 0 ; lastId < numberOfIndividuals ; lastId++) {
            individuals[lastId] = new Individual(lastId);
        }
        freeSlot = numberOfIndividuals;
    }

    public Individual[] getIndividuals() {
        return individuals;
    }

    public int getFreeSlot() {
        return freeSlot;
    }

    public void evolve() {

        int individualToDup = NOT_INITIALIZED;
        boolean found = false;

        while (!found)
        {
            individualToDup = generator.nextInt(individuals.length);
            found = freeSlot != individualToDup;
        }

        individuals[freeSlot] = individuals[individualToDup].duplicate(lastId++);
        
        int individualToDie = generator.nextInt(individuals.length);

        individuals[individualToDie].die();
        individuals[individualToDie] = null;
        freeSlot = individualToDie;

        //adding age of individuals
        for (int ct = 0 ; ct < individuals.length - 1; ct++) {
            if(ct!=individualToDie) {
             individuals[ct].incrementAge();
            }
        }

        if (logger.isDebugEnabled())
            logger.debug(this.toString());
    }

    public String toString() {
        return "Population = {individuals: " + this.individuals + " ,\n" +
               "              lastId:      " + this.lastId      + " ,\n" +
               "              freeSlot:    " + this.freeSlot    + " }\n";
    }

    public void report() {
        System.out.println("Population size:"+this.individuals.length);
        int ct=0;
        for (ct=0;ct<this.individuals.length;ct++){
            if(ct!=freeSlot)
            logger.info("Ind:"+ct+" age:"+individuals[ct].getAge());
        }
    }
}
