import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Аня", "Петрова", 20));
        list.add(new Person("Иван", "Фролов", 30));
        list.add(new Person("Геннадий", "Иванов", 18));
        list.add(new Person("Аня", "Цветкова Петрова Сидорова", 17));
        list.add(new Person("Дмитрий", "Иванов Полянский", 20));
        list.add(new Person("Юля", "Горшкова", 16));

        Predicate<Person> personPredicate = person -> person.getAge() < 18;
        list.removeIf(personPredicate);

        Collections.sort(list, new PersonSurnameLengthComparator());
        System.out.println(list);

    }
}
