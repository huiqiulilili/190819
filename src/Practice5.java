import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Person{}
class Bird{}
public class Practice5 {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Person> list2 = new ArrayList<>();
//        ArrayList<Bird> list3 = new ArrayList<>();
//
//        System.out.println(list1 instanceof ArrayList);
//        System.out.println(list2 instanceof ArrayList);
//        System.out.println(list3 instanceof ArrayList);
//
//        System.out.println(list1.getClass());


        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(100);

        Set<String> set = new HashSet<>();

        set.add("你好");
        set.add("世界");

        List<String> list3 = new ArrayList<>(set);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}
