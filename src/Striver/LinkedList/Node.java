package Striver.LinkedList;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    static void main() {
        Node first = new Node(10);
        Node second = new Node(20);

        first.next = second;

        Node temp = first;

//      Printing data
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
//      find the length
        Node temp1 = first;
        int count = 0;
        while (temp1 != null){
            count++;
            temp1 = temp1.next;
        }
        System.out.println(count);
//        searching
        while (temp1 != null){
            if (temp1.data == 10)
                System.out.println("true");
            temp1 = temp1.next;
        }

    }
}
