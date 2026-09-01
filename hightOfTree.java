public class hightOfTree{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }
    

    // height of tree------------<>

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int ans =  Math.max(rh, rh) + 1;
        return ans;
    }


    // diameter of treee

    public static int diameter2(Node root){    // tc -->  O(N^2)
        if(root == null){
            return 0;
        }

        int leftDiam = diameter2(root.left);
        int leftHigh = height(root.left);

        int rightDiam = diameter2(root.right);
        int rightHigh = height(root.right);

        int selfDiam = leftHigh + rightHigh + 1;

        int ans = Math.max(selfDiam , Math.max(leftDiam,rightDiam));
        return ans;


    }


    



    public static void main(String[] args) {

        /*
                        1
                     /   \
                     2     3
                    / \   / \
                    4   5 6   7

        */

 
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("diameter of tree : ");
        System.out.println(diameter2(root));
    }
}