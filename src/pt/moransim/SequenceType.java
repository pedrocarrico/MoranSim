package pt.moransim;

public class SequenceType {
    private Gene[] genes;
    private static final int NUMBEROFGENES = 7;
    private int id;
    private String archiveId;

    private SequenceType() {
        genes = new Gene[NUMBEROFGENES];

        this.id=0;

        StringBuilder sb = new StringBuilder();

        sb.append(id);

        for (int i=0;i<NUMBEROFGENES;i++){
            genes[i]=new Gene(i, 0);
            sb.append(genes[i].getName());
        }

        archiveId = sb.toString();
   }

    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public static SequenceType getInitialSequenceType() {
        return new SequenceType();
    }
}
