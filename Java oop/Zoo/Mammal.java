package ZooKeeper;

public class Mammal {

    private int energy;

    public Mammal() {
        this.energy = 100;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void increaseEnergy(int amount) {
        this.energy += amount;
    }

    public void reduceEnergy(int amount) {
        this.energy -= amount;
    }

    public int displayEnergy() {
        System.out.println("Energy: " + this.energy);
        return this.energy;
    }
}