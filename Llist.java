public class Llist {
    Node root;

    Llist(){
        root = null;
    }


    void insert(int num) {
        if (root == null) {
            root = new Node();
            root.data = num;
        } else {
            Node nodePtr = root;
            while (nodePtr.next != null) {
                nodePtr = nodePtr.next;
            }
            nodePtr.next = new Node();
            nodePtr.next.data = num;
        }
    }

    Boolean contains(int num) {
        if (root == null) {
            return false;
        }

        Node nodePtr = root;
        while (nodePtr != null) {
            if (nodePtr.data == num) {
                return true;
            } else{
                nodePtr = nodePtr.next;
            }
        }

        return false;
    }
}
