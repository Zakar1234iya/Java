import java.util.HashMap;
import java.util.Map;

public class TrackListDemo {
    public static void main(String[] args) {
        // Create a HashMap 
        HashMap<String, String> trackList = new HashMap<>();

        // Add songs
        trackList.put("Haifa", "If only once, If only once, You fell asleep in my tired soul...");
        trackList.put("Qooli", "Tell me, tell me, tell me, tell me, tell me, tell me...");
        trackList.put("Drama", "Drama, drama, drama, drama, drama, drama...");
        trackList.put("Ma Bithoon", "You won't be forgotten, You won't be forgotten...");

        //pring song
        String songTitle = "Qooli";
        String lyrics = trackList.get(songTitle);
        System.out.println("Lyrics for " + songTitle + ": " + lyrics);

        // Print all 
        System.out.println("All Tracks:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println("Track: " + entry.getKey() + " - Lyrics: " + entry.getValue());
        }
    }
}
