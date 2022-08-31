import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Аня", "Петрова", 20));
        list.add(new Person("Иван", "Фролов", 30));
        list.add(new Person("Геннадий", "Иванов", 18));
        list.add(new Person("Аня", "Цветкова Петрова Сидорова", 17));
        list.add(new Person("Дмитрий", "Иванов Полянский", 20));
        Comparator<Person> comparator;
        comparator=(o1, o2)->{
        int last = Integer.compare(o1.getSurname().split(" ").length, o2.getSurname().split(" ").length);
        return last == 0 ? o1.compareTo(o2) : last;
        };

        Collections.sort(list, comparator);
        System.out.println(list);

    }
}
