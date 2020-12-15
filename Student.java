public class Student {

    private String nume;
    private int varsta;
    private int[] note;

    public Student(String nume, int varsta, int[] note) {
        this.nume = nume;
        this.varsta = varsta;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) throws Exception {
        if (varsta < 18 || varsta >60) throw new Exception("Persoana nu poate fi student.");
        this.varsta = varsta;
    }

    public int[] getNote() {
        return note;
    }

    public void setNote(int[] note) {
        this.note = note;
    }
}
