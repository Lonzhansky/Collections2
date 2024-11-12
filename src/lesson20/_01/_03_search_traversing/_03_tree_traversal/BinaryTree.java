package lesson20._01._03_search_traversing._03_tree_traversal;

public class BinaryTree {

    // Корінь бінарного дерева
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(8);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }

    BinaryTree() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;

        // Траверс вліво
        postorder(node.left);
        // Траверс вправо
        postorder(node.right);
        // Траверс кореневий
        System.out.print(node.item + " ");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        // Траверс вліво
        inorder(node.left);
        // Траверс кореневий
        System.out.print(node.item + " ");
        // Траверс вправо
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Траверс кореневий
        System.out.print(node.item + " ");
        // Траверс вліво
        preorder(node.left);
        // Траверс вправо
        preorder(node.right);
    }
}
