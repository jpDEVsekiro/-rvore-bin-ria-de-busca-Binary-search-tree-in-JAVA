package binarytree;

public class Binarytree {

    private static class Node {

        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }

        public void insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public boolean finder(int value) {
            if (value == data) {
                return true;
            } else if (value < data) {
                if (left == null) {
                    return false;
                } else {
                    return left.finder(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.finder(value);
                }

            }
        }

        public void printInorder() {
            if (left != null) {
                left.printInorder();
            }
            System.out.println(data);
            if (right != null) {
                right.printInorder();
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node(34);
        a.insert(50);
        a.insert(-10);
        a.insert(-5);
        a.insert(10);
        a.insert(110);
        a.insert(1);
        a.insert(6);
        a.insert(9);
        a.insert(923);
        a.insert(23);
        a.insert(90);
        System.out.println("" + a.finder(0));
        a.printInorder();
    }
}
