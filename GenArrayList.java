import java.util.*;

public class GenArrayList<E extends Comparable <? super E>> {
    private final ArrayList<E> list;

    public GenArrayList() {
        list = new ArrayList<>();
    }

    public void addData(E values) {
        list.add(values);
    }

    public void display(){
        for (int i = 0; i<list.size();i++) {
        System.out.printf(list.get(i) + " ");
        }
        System.out.println();
    }

    public void displaySort(){
        Collections.sort(list);
        for (int i = 0; i<list.size();i++) {
        System.out.printf(list.get(i) + " ");
        }
        System.out.println();
    }

    public void removeData(E entry){
        list.remove(entry);
    }

    public void setData(E object1, E object2){
        int index = list.indexOf(object1);
        list.add(index, object2);
    }
}
