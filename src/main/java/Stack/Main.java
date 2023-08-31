package Stack;

import doublylinkedlist.DoublyLinkedList;
import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        myLinkedList.append(1);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//        myLinkedList.remove(2);
        //myLinkedList.set(0, 0);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
        //System.out.println(myLinkedList.get(2).value + "\n");
       // myLinkedList.prepend(1);
//        myLinkedList.reverse();
//        myLinkedList.printList();

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.printMyList();


    }
}
