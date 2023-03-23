package week03.ex3_tree;

public class TreeNode {
    Student student;
    TreeNode left;
    TreeNode right;

    public TreeNode(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
