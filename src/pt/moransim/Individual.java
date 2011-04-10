package pt.moransim;

class Individual {
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
        System.out.println("I'm dying: " + this.id );
    }

    public Individual duplicate(int id) {
        System.out.println("I'm duplicating: " + this.id );
        return new Individual(id, this.parentId);
    }
}
