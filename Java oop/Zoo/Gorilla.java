public class Gorilla extends Mammal{
    public void throwSomething() {
        this.reduceEnergy(5);
        System.out.println("The gorilla has thrown an object.");
    }

    public void eatBananas() {
        this.increaseEnergy(10);
        System.out.println("Energy increased by 10.");
    }

    public void climb() {
        this.reduceEnergy(10);
        System.out.println("The gorilla has climbed a tree");
    }

}