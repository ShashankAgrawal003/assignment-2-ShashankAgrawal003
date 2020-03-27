//              DS  ASSIGNMENT 2        NAME-SHASHANK AGRAWAL  J SEC 56
//Q3..Implement an queue which follows some order using Linked list.
// For example create queue of student as per the roll number, in ascending order.
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;


// use problem5.student.Student class to create object of student

public class  MyMain {
    public static void main(String[] args) {
        MyPriorityQueue m = new MyPriorityQueue();
        for (int i = 0; i < 4; i++) {
           Node newNode=new Node();
            m.enqueue(newNode);
        }
        m.dequeue();
    }
}
