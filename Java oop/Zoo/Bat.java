
package ZooKeeper;

public class Bat extends Mammal{
    public Bat() {
        this.setEnergy(300);
    }

    public void fly() {
        this.reduceEnergy(50);
        System.out.println("The bat is now airborne");
    }

    public void eatHumans() {
        this.increaseEnergy(25);
        System.out.println("The bat's satisfaction leve (Energy): " + this.getEnergy());
    }

    public void attackTown() {
        this.reduceEnergy(100);
        System.out.println("The bat's attack!");
    }
}