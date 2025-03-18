import javax.xml.crypto.Data;
import java.util.*;

import static java.lang.System.out;
import static java.io.IO.print;
import static java.io.IO.println;


public class Collections {
    public static void main(String[] args){
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Zhenya");
        listNames.add("Sasha");
        println(listNames);
        listNames.remove("Sasha");
        println(listNames);
        listNames.add("Sasha");
        listNames.remove(1);
        println(listNames);
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Valera");
        linkedList1.add("Katya");
        println(linkedList1);
        linkedList1.add(0, "Mike");
        println(linkedList1);
        for(String name: linkedList1) {println(name);}
        ArrayList<Integer> numberList = new ArrayList();
        numberList.add(25);
        numberList.add(58);
        println(numberList);
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        numbers.push(10);
        println(numbers);
        listNames.add("Sasha");
        println(listNames);
        println(numbers.search(10));
        Set<String> set = new HashSet<>();
        set.add("Sibinski");
        set.add("Mayorov");
        println(set);
        for(String name:set){println(name);};
        Set set2 = new LinkedHashSet();
        for (int i=30; i >=0; i--){
            set2.add(String.valueOf(i));
        }
        println(set2);

        class Data<K,V>{
            private K key;
            private V value;

            public Data(V value, K key) {
                this.value = value;
                this.key = key;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "key=" + key +
                        ", value=" + value +
                        '}';
            }


        }

    }


}
