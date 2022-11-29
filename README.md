# NotablePerson
Задача1.  
Перед вами класс, описывающий человека:
```java
public class Person {
    private String name;
    private String surname;
    private int age;
    
    // создайте конструктор на все поля
    
    // создайте геттеры и сеттеры
    
    // создайте toString
}
```
Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:

У кого больше слов в фамилии, тот более знатен
Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше
Продемонстрируйте работу этого компаратора, создав в Main.main() список из нескольких людей и отсортировав его с помощью компаратора: Collections.sort(СПИСОК, КОМПАРАТОР). После чего выведите список на экран.

Задача2.  
Отведите ветку lambda. Удалите класс компаратора и в методе main замените объект этого удалённого класса на лямбду с той же логикой. Т.е. по сути мы дадим имплементацию компаратору на лету с помощью лямбды.

Если вы делали вторую задачу, то параметра не будет (их у лямбд не бывает) - вместо этого просто используйте напрямую в коде лямбды то значение, которое раньше передавали в конструктор компаратора.

Сделайте коммит и пуш в ветку lambda, создайте PR и не сливая скиньте ссылку на него в качестве решения этой задачи.
  
Задача 3.  
Отведите ветку eraser от main.

Нашей целью будет удалить в списке людей в main тех людей, которые младше 18 лет (если сейчас в демонстрации нет таких людей - добавьте, чтобы их было как минимум 2). Но мы не будем для этого сами проходиться по списку, мы воспользуемся его готовым методом removeIf. Вызовите его у списка и передайте туда предикат (Predicate<Person>), метод которого отвечал бы true тогда и только тогда, когда человеку из его параметра меньше 18 лет. Таким образом список сам пройдётся по своим элементам и оттестирует каждый вашим предикатом, на ком покажет true - тот и будет удалён.

Реализацию нужно сделать с помощью лямбды.

Сделайте коммит и пуш в ветку eraser, создайте PR и не сливая скиньте ссылку на него в качестве решения этой задачи.
