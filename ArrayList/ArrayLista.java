package ArrayList;

import java.util.ArrayList;

public class ArrayLista {
    public static void arraylista(){
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        System.out.println(list.add(3));
        System.out.println(list.get(1));
        for(Integer i : list){
            System.out.println("printing ");
            System.out.println(i);
            System.out.println(list.indexOf(2));
            System.out.println(list.remove(2));
        }
    }
}
