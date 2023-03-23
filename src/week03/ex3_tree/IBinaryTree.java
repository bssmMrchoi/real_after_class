package week03.ex3_tree;

public interface IBinaryTree {
    void addElement(Student student);
    String removeElement(int number);
    void searchElement(int number);
    TreeNode getRoot();

    void preOrder(TreeNode node);
    void inOrder(TreeNode node);
    void postOrder(TreeNode node);
}
