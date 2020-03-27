package problem1.mybst;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;
import problem4.myqueue.Node;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode newnode, root, tmp;   //PRIVATELY DEFINNED VARIABLES TO IMPLEMENT GETTER SETTER METHODS..
    private static int count;
    private MyQueue pre;
    private MyQueue post;

    public MyBinarySearchTree()    // DEFAULT CONSTRUCTOR
        {   tmp = null;
        root = null;
        MyBinarySearchTree.count = 0;
        post=new MyQueue();
        pre=new MyQueue();
    }

                                        //seeting root node
    public void setRoot()
    {
        newnode=new TreeNode();
        if(root==null)
        {
            root=newnode;
            tmp=root;
            newnode=null;
        }
    }
    public TreeNode getRoot()       // GETTER METHOD FOR ROOT VARIABLE
    {
        return root;
    }
    public TreeNode getNewnode()     //GETTER METHOD FOR NEWNODE VARIABLE
    {
        return newnode;
    }



    public void setRoot(TreeNode root)     //SETTER METHOD FOR ROOT VARIABLE
    {
        this.root = root;
    }

    public void setNewnode(TreeNode newnode)     //SETTER METHOD FOR NEWNODE VARIABLE
    {
        this.newnode = newnode;
    }

    public TreeNode getTmp()                  //GETTER METHOD OF TMP VARIABLE
    {
        return tmp;
    }

    public void setTmp(TreeNode tmp)      // SETTER METHOD OF TMP VARIABLE
    {
        this.tmp = tmp;
    }
    public int getCount()         //GETTER OF COUNT VARIABLE
    {
        return count;
    }

    public void setCount(int ctr)    //SETTER OF COUNT VARIABLE
    {
        MyBinarySearchTree.count = ctr;
    }

    public MyQueue getPre()    //GETTER
    {
        return pre;
    }

    public void setPre(MyQueue pre)  //SETTER
    {
        this.pre = pre;
    }

    public MyQueue getPost()
    {
        return post;
    }

    public void setPost(MyQueue post)
    {
        this.post = post;
    }

    public void insert(TreeNode tmproot)     // Setting the binary tree
    {
        if(newnode==null)
        {
            newnode=new TreeNode();
        }

        try {                                                // try catch given as null pointer exception can occur
                if (newnode.getData() <= tmproot.getData())
                {
                    System.out.println("TRAVERSAL OF THE LEFT SIDE");
                    if (tmproot.getLeft() == null)
                    {
                        tmproot.setLeft(newnode);
                        System.out.println("left node inserted ");
                        pre.enqueue(new Node(newnode));               //only left insertion
                        newnode=null;
                        return;
                    }
                    else
                        {
                            System.out.println("left not empty changing tmproot ");
                            insert(tmproot.getLeft());
                        }
                }
            } catch(NullPointerException ignore){}


        try {
                if (newnode.getData() > tmproot.getData())
                {
                    System.out.println("TRAVERSAL OF THE LEFT SIDE");
                    if (tmproot.getRight() == null)
                    {
                        tmproot.setRight(newnode);
                        System.out.println("Node inserted right");
                        newnode = null;
                    }
                    else
                        {
                            System.out.println("Right not empty changing tmproot");
                            insert(tmproot.getRight());
                        }
                }
            } catch (NullPointerException ignore) {}

    }

    public void countNotLeft(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        countNotLeft(node.getLeft());
        if(node.getLeft()!=null)
        {
            ++count;
        }
        countNotLeft(node.getRight());

    }

    public void preOrder(TreeNode node)   ////preorder
        { if (node == null)
            {
                return;
            }
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }


    public void postOrder(TreeNode node)       ////postorder
    {
        if(node==null)
        {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
    }
}


