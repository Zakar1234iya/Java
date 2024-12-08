package puzzle.java;
import java.util.ArrayList;
import java.util.Random;

public class Puzzle{
	
	public ArrayList<Integer> gettenRolls(){
		ArrayList<Integer> array = new ArrayList<>();
		Random randNumber = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			int rand = randNumber.nextInt(25)+5;//5->30
			array.add(rand);
		}
		return array;
	}
	
	 public char getRandomLetter() {
        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        // Generate a random index between 0 and 25
        Random rand = new Random();
        int randomIndex = rand.nextInt(26);
        
        // Return the random letter from the array
        return alphabet[randomIndex];
    }

    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        System.out.println("Random Letter: " + puzzle.getRandomLetter());
    }
	}
}