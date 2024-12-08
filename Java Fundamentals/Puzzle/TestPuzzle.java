package Puzzle;
import java.util.Random;
import java.util.ArrayList;

public class TestPuzzle {
    
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();
        ArrayList<Integer> array = puzzle.addRandomDigit();
        System.out.println(array);

        Puzzle generator = new Puzzle ();
        System.out.println("Random Letter: " + generator.getRandomLetter());
        
    }

}
