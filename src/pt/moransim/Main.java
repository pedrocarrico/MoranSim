package pt.moransim;

public class Main {

    public static void main(String[] args) {
        System.out.println("Running");

        int numberOfIndividualsInPopulation = 1000;

        Simulator moransim = new MoranSimulator(numberOfIndividualsInPopulation);

        moransim.run(5);

        System.out.println("Done");
    }
}
