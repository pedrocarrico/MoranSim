package pt.moransim;

public interface Simulator {

    public void run(int numberOfIterations);

    public Population getPopulation();
}