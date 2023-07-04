public abstract class Vehicule {

    private String brand;
    private int kilometres;

    public Vehicule(String brand, int kilometres){
        this.brand = brand;
        this.kilometres = kilometres;
    }

    public abstract String  doStuff();

    //getters
    public String getBrand(){
        return this.brand;
    }

    public int getKilometres(){
        return this.kilometres;
    }

    //setters

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setKilometres(int kilometres){
        this.kilometres =kilometres;
    }


}