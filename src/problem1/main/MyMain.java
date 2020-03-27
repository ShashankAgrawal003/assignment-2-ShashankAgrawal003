//   DS  ASSIGNMENT 2        NAME-SHASHANK AGRAWAL  J SEC 56

// Q1.Define & Implement your own algorithm, to traverse a Binary Search Tree and print all the left children as
// well as also print the count of nodes who doesn't have left child.
                             // MY MAIN CLASS....

package problem1.main;        // IMPORTED THE PACKAGE
import problem1.mybst.MyBinarySearchTree;    // IMPORTED PROBLEM1 MyBinarySearchTree CLASS
import problem4.myqueue.MyQueue;             // IMPORTED PROBLEM4 MYQUEUE CLASS
import java.util.Scanner;
public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue queue=new MyQueue();

        //for setting up the root node
        m.setRoot();
        System.out.println("root set : " + m.getRoot().getData());


        for (int i = 0; i <5; i++)             //To perform the insertion
        {
            m.insert(m.getRoot());
        }

        queue.queuePrint(m.getPre());           //printing left children

        m.countNotLeft(m.getRoot());            //counting nodes Not having left children

        System.out.println(m.getCount());  //PRINTING THE VALUE OF THE COUNT VARIABLE
    }

}
