package ro.mycode.Model;

public class Persoane implements Comparable<Persoane> {

    private String nume;
    private int varsta;

    public Persoane(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoane(String text){
        String [] prop = text.split(",");
        this.nume = prop[0];
        this.varsta = Integer.parseInt(prop[1]);
    }

    public String toSave(){
        return this.nume+","+this.varsta;
    }

    @Override
    public String toString() {
        return this.nume+","+this.varsta;
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

    @Override
    public int compareTo(Persoane o) {
        if (this.nume.compareTo(o.nume) > 0){
            return 1;
        }
        if (this.nume.compareTo(o.nume) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
