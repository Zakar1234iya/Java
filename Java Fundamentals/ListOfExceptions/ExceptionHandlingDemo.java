import java.util.ArrayList;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Iterate list
        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted value: " + castedValue);
            } catch (ClassCastException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Index: " + i);
                System.out.println("Value: " + myList.get(i));
            }
        }
    }
}
