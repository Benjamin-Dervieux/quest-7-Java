public class Car extends Vehicule {
    
    public Car(String brand, int kilometres){
        super(brand, kilometres);
    }

           @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais Vroum Vroum !";
    }
}
