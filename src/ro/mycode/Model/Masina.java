package ro.mycode.Model;

public class Masina implements Comparable<Masina>{

    private String model;
    private String firma;
    private int an;
    private boolean geamuriElectrice;
    private String combustibil;
    private double motor;

    public Masina(String model, String firma, int an, boolean geamuriElectrice, String combustibil, double motor) {
        this.model = model;
        this.firma = firma;
        this.an = an;
        this.geamuriElectrice = geamuriElectrice;
        this.combustibil = combustibil;
        this.motor = motor;
    }

    public Masina(String text){
        String [] prop = text.split(",");
        this.model = prop[1];
        this.firma = prop[2];
        this.an = Integer.parseInt(prop[3]);
        this.geamuriElectrice = Boolean.parseBoolean(prop[4]);
        this.combustibil = prop[5];
        this.motor = Double.parseDouble(prop[6]);
    }

    public String toSave(){
        return this.model+","+this.firma+","+this.an+","+this.geamuriElectrice+","+this.combustibil+","+this.motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isGeamuriElectrice() {
        return geamuriElectrice;
    }

    public void setGeamuriElectrice(boolean geamuriElectrice) {
        this.geamuriElectrice = geamuriElectrice;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return this.model+","+this.firma+","+this.an+","+this.geamuriElectrice+","+this.combustibil+","+this.motor;

    }

    public void afisare() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o){
        Masina masina = (Masina) o;
        return masina.model.equals(model);
    }


    @Override
    public int compareTo(Masina o) {
        if (this.an > o.an){
            return 1;
        }
        if (this.an < o.an){
            return -1;
        }else{
            return 0;
        }
    }
}
