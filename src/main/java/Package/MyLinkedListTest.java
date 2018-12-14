package Package;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("--_TEst_--");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
//        ll.add(1,11);
        ll.get(2);
        ll.getData(1);



        ll.printList();

    }
}
