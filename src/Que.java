import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import static java.io.IO.println;

public class Que {
        public static void main(){
//            Queue queue = new LinkedBlockingQueue();
//            queue.add(1);
//            queue.add(2);
//            println(queue);
            Map<Integer, String> map = new HashMap<>();
            map.put(0, "Mayoroff");
            map.put(1, "Sibinski");
            println(map);
            for (int key: map.keySet()){
                println(key + ", " + map.get(key));
            }

            Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
            while(entryIterator.hasNext()){
                Map.Entry<Integer, String> temp = entryIterator.next();
                println("Key is: " + temp.getKey() + ". " + "The value of a key is: " + temp.getValue());
            }
        }
    }


