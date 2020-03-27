//              DS  ASSIGNMENT 2        NAME-SHASHANK AGRAWAL  J SEC 56

// Q2.Write a program to check & justify the given statement.
// .Pre order and post order traversal of Binary Search Tree shows following properties:
//  a)-Root element is placed at opposite end, i.e. in pre order root is the first element where as in post order root is the last element.
//  b)-They have common mid point, i.e. both the traversal will give same element at the mid position for odd number of nodes.
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();
        Methods mthds=new Methods();

        //setting up the root
        m.setRoot();
        System.out.println("Root set Successfully value :"+m.getRoot().getData());


        //Setting up the bst
        for (int i = 0; i <4; i++)
        {
            m.insert(m.getRoot());
        }

        // Verification of statement "root element occours first in pre-order and last in post-order  "

        mthds.verify_A(m.getRoot());

        //verification of statement "Both the traversal will give same  element at the mid position for odd number of nodes."
        System.out.println(mthds.verify_B(m.getRoot()));

    }

}
