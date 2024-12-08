package Puzzle;
import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
    public ArrayList<Integer> addRandomDigit(){
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i=0 ; i<10 ; i++){
            array.add(random.nextInt(20)+1);
        }
        return array ; 
    }
     public char getRandomLetter() {
            // Create an array with all 26 letters of the alphabet
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            
            // Generate a random index between 0 and 25
            Random rand = new Random();
            int randomIndex = rand.nextInt(26);
            
            // Return the random letter from the array
            return alphabet[randomIndex];
        }
    
    }
