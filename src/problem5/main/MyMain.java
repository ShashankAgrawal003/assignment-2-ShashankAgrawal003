//              DS  ASSIGNMENT 2        NAME-SHASHANK AGRAWAL  J SEC 56
//Q5. Implement a circular queue to process the given list of students as per the following conditions:
//1)-Element will be removed from the queue if its backLog counter value is equal to zero.
//2)-You can only process the front element, processing means "backLog - appearingCount".
//3)-For any element appearing count will not be greater than 2.
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain
{
    public static void main(String[] args)
    {
        MyCircularQueue m=new MyCircularQueue();
        Node node;

        for (int i = 0; i <5 ; i++)
        {
            node=new Node(new Student());
            m.enqueue(node);
        }
        m.printQueue();

        m.remove(new Scanner(System.in).next());
        m.printQueue();

        m.process(new Scanner(System.in).next());








    }
}
