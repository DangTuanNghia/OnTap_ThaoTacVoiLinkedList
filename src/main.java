import java.util.Iterator;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("cac phan tu trong linkedList:");
        for (int i = 0; i<linkedList.size(); i++){
            System.out.print(i);
            System.out.println(linkedList.get(i));
        }
        for (Integer i: linkedList
             ) {
            System.out.print(i);
        }
        System.out.println();
        Iterator<Integer> integerIterator = linkedList.iterator();
        System.out.println("cac phan tu duyet bang iterator:");
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next()+"\t");
        }

        boolean position = linkedList.contains(1);
        System.out.println(position);
        System.out.println("lay ra phan tu theo chi so (bang 1):");
        System.out.println(linkedList.get(1));
        System.out.println("lay ra phan tu dau tien");
        System.out.println(linkedList.getFirst());
        System.out.println("lay ra phan tu cuoi cung");
        System.out.println(linkedList.getLast());
        // cap nhat linked list
        System.out.println("truoc khi cap nhat:");
        System.out.println(linkedList);
        System.out.println("sau khi cap nhat");
        linkedList.set(2,7);
        System.out.println(linkedList);
        System.out.println("xoa phan tu theo chi so");
        linkedList.remove(2);
        System.out.println(linkedList);

    }
}
