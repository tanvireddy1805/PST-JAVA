import java.util.Map;
import java.util.TreeMap;

public class WEEK10_TASK10_PhoneContactDirectory {
    public static void main(String[] args) {
        Map<String, String> contacts = new TreeMap<>();
        contacts.put("Amina Yusuf", "555-0101");
        contacts.put("David Chen", "555-0134");
        contacts.put("Lina Patel", "555-0178");

        contacts.put("David Chen", "555-0199");
        contacts.put("Omar Ali", "555-0162");

        System.out.println("Phone Contact Directory:");
        for (Map.Entry<String, String> contact : contacts.entrySet()) {
            System.out.printf("%s: %s%n", contact.getKey(), contact.getValue());
        }

        String nameToFind = "Lina Patel";
        String phoneNumber = contacts.get(nameToFind);
        System.out.println(nameToFind + "'s phone number: "
                + (phoneNumber == null ? "Not found" : phoneNumber));
    }
}
