package pt.moransim;

import java.util.HashMap;
import java.util.Map;

public class SequenceTypeLibrary {

    private Map<String,SequenceType> sequenceTypes;
    private String initialSTId;

    public SequenceTypeLibrary() {
        sequenceTypes = new HashMap<String, SequenceType>();

        SequenceType initialST = SequenceType.getInitialSequenceType();
        initialSTId = initialST.getArchiveId();
        sequenceTypes.put(initialSTId, initialST);

    }


}
