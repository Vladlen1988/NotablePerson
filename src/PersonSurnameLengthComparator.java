import java.util.Comparator;

public class PersonSurnameLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int last = Integer.compare(o1.getSurname().split(" ").length, o2.getSurname().split(" ").length);
        return last == 0 ? o1.compareTo(o2) : last;
    }
}
