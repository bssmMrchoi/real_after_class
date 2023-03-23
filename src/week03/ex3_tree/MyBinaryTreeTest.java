package week03.ex3_tree;

public class MyBinaryTreeTest {
    public static void main(String[] args) {
        MyBinaryTree binaryTree = new MyBinaryTree();

        binaryTree.addElement(new Student(10, "춘향이"));
        binaryTree.addElement(new Student(5, "향단이"));
        binaryTree.addElement(new Student(1, "홍길동"));
        binaryTree.addElement(new Student(12, "심봉사"));
        binaryTree.addElement(new Student(14, "이도령"));
        binaryTree.addElement(new Student(7, "최서방"));

        System.out.println("=============");
        binaryTree.preOrder(binaryTree.getRoot());
        System.out.println("=============");
        binaryTree.inOrder(binaryTree.getRoot());
        System.out.println("=============");
        binaryTree.postOrder(binaryTree.getRoot());
        System.out.println("=============");
        binaryTree.searchElement(1);
        binaryTree.searchElement(0);
        binaryTree.searchElement(12);
        System.out.println("=============");
        System.out.println(binaryTree.removeElement(10) + " 삭제");
        System.out.println(binaryTree.removeElement(1) + " 삭제");
        System.out.println(binaryTree.removeElement(12) + " 삭제");
        System.out.println("=============");
        binaryTree.inOrder(binaryTree.getRoot());
    }
}
