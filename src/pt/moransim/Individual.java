package pt.moransim;

import org.apache.log4j.Logger;

class Individual {
    private static Logger logger = Logger.getLogger(Individual.class);

    private static final int NO_PARENT = -1;

    private int id;
    private int age;
    private int parentId;

    public Individual(int id) {
        this.id = id;
        this.age = 0;
        this.parentId = NO_PARENT;
    }

    public Individual(int id, int parentId) {
        this.id = id;
        this.age = 0;
        this.parentId = parentId;
    }

    public void die() {
        if (logger.isDebugEnabled())
            logger.debug("I'm dying: " + this.id );
    }

    public Individual duplicate(int id) {
        if (logger.isDebugEnabled())
            logger.debug("I'm duplicating: " + this.id );
        return new Individual(id, this.parentId);
    }
}
