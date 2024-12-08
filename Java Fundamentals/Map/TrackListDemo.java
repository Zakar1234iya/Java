import java.util.HashMap;
import java.util.Map;

public class TrackListDemo {
    public static void main(String[] args) {
        // Create a HashMap to store track titles and lyrics
        HashMap<String, String> trackList = new HashMap<>();

        // Add songs to the trackList
        trackList.put("Uprising", "Paranoia is in bloom, The PR transmissions will resume...");
        trackList.put("Starlight", "Far away, this ship is taking me far away...");
        trackList.put("Supermassive Black Hole", "Oh baby, don't you know I suffer? Oh baby, can you hear me moan?");
        trackList.put("Knights of Cydonia", "Come ride with me through the veins of history...");

        // print songs
        String songTitle = "Starlight";
        String lyrics = trackList.get(songTitle);
        System.out.println("Lyrics for " + songTitle + ": " + lyrics);

        // Print all 
        System.out.println("Track List:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println("Track: " + entry.getKey() + " - Lyrics: " + entry.getValue());
        }
    }
}
