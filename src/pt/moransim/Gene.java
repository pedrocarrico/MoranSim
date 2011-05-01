package pt.moransim;

class Gene {
    private int name;
    private int allele;

    public Gene(int name, int allele) {
        this.name=name;
        this.allele=allele;
    }

    public int getAllele() {
        return allele;
    }

    public void setAllele(int allele) {
        this.allele = allele;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}

