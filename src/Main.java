import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Правильно создать два списка. Один ArrayList, один LinkedList (тип данных String). Добавить в каждый из них по 3 элемента.
        //Центральный элемент в ArrayList заменить на первый элемент. Удалить последний элемент.
        //к LinkedList добавить весь ArrayList.
        //* - найти самую длинную строку в вашем получившемся листе.

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        System.out.println(arrayList);

        arrayList.set(1, arrayList.get(0));
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println();

        linkedList.add("Lorem ipsum");
        linkedList.add("dolor sit amet");
        linkedList.add("consectetur adipiscing elit");
        System.out.println(linkedList);

        linkedList.addAll(arrayList);
        System.out.println(linkedList);

        int length = 0;
        for (String s : linkedList) {
            if (s.length() > length) {
                length = s.length();
            }
        }
        System.out.println("Longest string length is " + length);
    }
}