package pt.moransim;

import org.apache.log4j.Logger;

class Individual {
    private static Logger logger = Logger.getLogger(Individual.class);

    public static final int NO_PARENT = -1;
 
    public enum Status {
        ALIVE, DEAD
    }
    
    private int id;
    private int age;
    private int parentId;

    private Status status;

    public Individual(int id) {
        this.id = id;
        this.age = 0;
        this.parentId = NO_PARENT;
        this.status = Status.ALIVE;
    }

    public Individual(int id, int parentId) {
        this.id = id;
        this.age = 0;
        this.parentId = parentId;
    }

    public void die() {
        if (logger.isDebugEnabled())
            logger.debug("I'm dying: " + this.id );
        this.status = Status.DEAD;
    }

    public Individual duplicate(int id) {
        if (logger.isDebugEnabled())
            logger.debug("I'm duplicating: " + this.id );
        return new Individual(id, this.parentId);
    }

    public int getId(){
        return this.id;
    }

    public Status getStatus(){
        return this.status;
    }

    public int getAge() {
        return this.age;
    }

    public int parentId(){
        return this.parentId;
    }

    public void incrementAge() {
        this.age++;
    }
}
