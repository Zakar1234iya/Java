public class Test {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();
        myGorilla.throwSomething();
        myGorilla.eatBananas();
        myGorilla.eatBananas();
        myGorilla.climb();
        System.out.println(myGorilla.getEnergy());

        Bat myBat = new Bat();
        myBat.attackTown();
        myBat.attackTown();
        myBat.attackTown();
        myBat.eatHumans();
        myBat.eatHumans();
        myBat.fly();
        System.out.println(myBat.getEnergy());
    }
}