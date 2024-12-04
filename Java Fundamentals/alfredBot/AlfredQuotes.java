import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s.", date.toString());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") >= 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") >= 0) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String guestGreeting() {
        Date date = new Date();
        int hours = date.getHours();
        String dayPeriod;

        if (hours >= 5 && hours < 12) {
            dayPeriod = "morning";
        } else if (hours >= 12 && hours < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }

        return String.format("Good %s, lovely to see you.", dayPeriod);
    }
}
