import java.util.*;

public class usingCollectionFramework {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("hi");
        list.addFirst("that's right");
        System.out.println(list);

        list.addLast("amazing");
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" -> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
