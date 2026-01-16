import java.util.LinkedList;

public static class LearnLinkedList{

    public static void learnLinkedList(){
        /***singly linkedlist or doubly linkedlist
         * nodes are stored in non consecutive memory locations
         * can be stack (push and pop)
        can be queue (offer and poll)
        node with data and address (to the next element),elements are linked using pointers
         insertion and deletion are O(1) where fetching is O(n)
         ** dynamic data structure allocates needed memory while running
         * uses
         * implement stacks/queues
         * GPS navigation
         * music playlist***/
    LinkedList<String> linkedList = new LinkedList<String>();
    //act as stack
        linkedList.push("B");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");

        linkedList.pop();
        System.out.println(linkedList);
        linkedList.add(4,"A");
        linkedList.remove("A")

        //linked list as queue
        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.offer("B");
        linkedList1.offer("D");
        linkedList1.offer("E");
        linkedList1.offer("F");

        linkedList1.poll();
        System.out.println(linkedList1);

    }
}