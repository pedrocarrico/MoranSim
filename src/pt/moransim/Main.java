package pt.moransim;

public class Main {

    public static void main(String[] args) {
        System.out.println("Running");

        Simulator moransim = new MoranSimulator();

        moransim.run(5);

        System.out.println("Done");
    }
}
