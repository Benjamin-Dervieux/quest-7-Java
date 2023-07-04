public class Boat extends Vehicule {
    
    public Boat (String brand, int kilometres){
        super(brand, kilometres);
    }

       @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais Glou Glou !";
    }
}
