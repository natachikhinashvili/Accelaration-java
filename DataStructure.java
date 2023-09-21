import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DataStructure<T> {
    // linkedlist ensures O(1) removal of item from the beginning or end of the list
    // When you remove an item it only involves updating a few pointers, which can be done in O(1) time.
    private LinkedList<T> linkedList;
    // hashmap keeps track of indices of elements within the LinkedList
    // we store index of added item, which allows us quickly locate and delete it without having to search through the list linearly
    // hashmap has O(1)  look-up time for finding the index of an item.
    private Map<T, Integer> indexMap;

    public DataStructure(){
        linkedList = new LinkedList<>();
        indexMap = new HashMap<>();
    }

    public void add(T element) {
        if (!indexMap.containsKey(element)) {
            linkedList.add(element);
            indexMap.put(element, linkedList.size() - 1);
        }
    }

    /*
        1. takes item that you want to delete 
        2. replaces it with last element in list
        3. updates mapping
        4. removes the last element
     */
    public void delete(T item){
        if (indexMap.containsKey(item)) {
            int index = indexMap.get(item);
            T last = linkedList.getLast();
            linkedList.set(index, last);
            indexMap.put(last,index);
            linkedList.removeLast();
            indexMap.remove(item);
        }
    }

    public void show() {
        for (T item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        DataStructure<Integer> dataStructure = new DataStructure<>();
        dataStructure.add(7);
        dataStructure.add(1);
        dataStructure.show();
        dataStructure.delete(1);
        dataStructure.show();
    }

}
