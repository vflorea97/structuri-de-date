package ro.mycode.Model;

public class Persoane {

    private String nume;
    private int varsta;

    public Persoane(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Nume: " + this.nume + "\n";
        text += "Varsta: " + this.varsta + "\n";
        return text;
    }

    public void afisare() {
        System.out.println(this);
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

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
