import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Arrays have a fixed size.
        String[] database = {"Java", "Python", "C++"};

        System.out.println("ARRAY EXAMPLE");
        System.out.println("Array: " + Arrays.toString(database));
        System.out.println("Array size: " + database.length);

        // Array elements can be changed using their index.
        database[1] = "JavaScript";

        System.out.println("Updated Array: "
                + Arrays.toString(database));

        // ArrayLists can grow or shrink dynamically.
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("\nARRAYLIST EXAMPLE");
        System.out.println("ArrayList: " + languages);
        System.out.println("ArrayList size: " + languages.size());

        // ArrayLists allow new elements to be added.
        languages.add("JavaScript");

        System.out.println("After adding: " + languages);

        // ArrayLists allow elements to be removed.
        languages.remove("Python");

        System.out.println("After removing: " + languages);

        // ArrayLists use set() to update an element.
        languages.set(0, "Swift");

        System.out.println("Updated ArrayList: " + languages);

        System.out.println("\nMAIN DIFFERENCES");
        System.out.println("Arrays have a fixed size.");
        System.out.println("ArrayLists have a dynamic size.");
        System.out.println("Arrays use length.");
        System.out.println("ArrayLists use size().");
    }
}
