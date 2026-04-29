import java.util.LinkedList;

public class Pr32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println("Roll found: " + searchElement(rollNumbers, 102));

        LinkedList<String> names = new LinkedList<>();
        names.add("Manav");
        names.add("Rahul");
        names.add("Amit");

        System.out.println("Name found: " + searchElement(names, "Rahul"));
    }
}