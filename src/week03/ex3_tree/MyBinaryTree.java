package week03.ex3_tree;

public class MyBinaryTree implements IBinaryTree{
    private TreeNode root;
    private int count;

    public MyBinaryTree() {
        this.root = null;
        this.count = 0;
    }

    @Override
    public void addElement(Student student) {
        TreeNode newNode = new TreeNode(student);
        TreeNode temp = root;
        if(root == null) {
            root = newNode;
            return ;
        }

        while(true) {
            if(newNode.getStudent().getNumber() > temp.getStudent().getNumber()) {
                if(temp.right == null) {
                    temp.right = newNode;
                    break;
                }
                temp = temp.right;
            }
            else {
                if(temp.left == null) {
                    temp.left = newNode;
                    break;
                }
                temp = temp.left;
            }
        }
        count++;
    }



    @Override
    public void searchElement(int number) {
        if(root == null) {
            System.out.println("트리가 비어 있습니다.");
            return ;
        }

        TreeNode temp = root;
        while(number != temp.getStudent().getNumber()) {
            if(number > temp.getStudent().getNumber()) {
                temp = temp.right;
            }
            else {
                temp = temp.left;
            }

            if(temp == null) {
                System.out.println("학번이 "+number+"인 학생은 없습니다.");
                return ;
            }
        }
        temp.getStudent().showInfo();
    }

    @Override
    public String removeElement(int number) {
        TreeNode temp = root;
        TreeNode pre = null;
        while(number != temp.getStudent().getNumber()) {
            if(number > temp.getStudent().getNumber()) {
                pre = temp;
                temp = temp.right;
            }
            else {
                pre = temp;
                temp = temp.left;
            }

            if(temp == null) {
                System.out.println("학번이 "+number+"인 학생은 없습니다.");
                return null;
            }
        }

        //삭제 노드의 자식이 없을 때
        if(temp.left == null && temp.right == null) {
            if(temp == root) {
                root = null;
            }
            else if(pre.right == temp) {
                pre.right = null;
            }
            else {
                pre.left = null;
            }
            return temp.getStudent().getName();
        }
        //삭제 노드의 오른쪽 자식만 있을 때
        else if(temp.left == null) {
            if(temp == root) {
                root = temp.right;
            }
            else if(pre.right == temp) {
                pre.right = temp.right;
            }
            else {
                pre.left = temp.right;
            }
        }
        //삭제 노드의 왼쪽 자식만 있을 때
        else if(temp.right == null) {
            if(temp == root) {
                root = temp.left;
            }
            else if(pre.right == temp) {
                pre.right = temp.left;
            }
            else {
                pre.left = temp.left;
            }
        }
        //삭제 노드의 자식이 둘 다 있을 때, 왼쪽 중 가장 큰 노드 올리자
        else {
            TreeNode replacePre = temp;
            TreeNode replaceTemp = replacePre.left;

            while(replaceTemp.right != null) {
                replacePre = replaceTemp;
                replaceTemp = replaceTemp.right;
            }
            replacePre.right = replaceTemp.left;
            replaceTemp.left = temp.left;

            if(temp == root) {
                root = replaceTemp;
            }
            else if(temp == pre.left) {
                pre.left = replaceTemp;
            }
            else {
                pre.right = replaceTemp;
            }
            replaceTemp.right = temp.right;
        }

        return temp.getStudent().getName();
    }

    @Override
    public TreeNode getRoot() {
        return root;
    }

    @Override
    public void preOrder(TreeNode node) {
        if(node != null) {
            node.getStudent().showInfo();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    @Override
    public void inOrder(TreeNode node) {
        if(node != null) {
            inOrder(node.left);
            node.getStudent().showInfo();
            inOrder(node.right);
        }
    }

    @Override
    public void postOrder(TreeNode node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            node.getStudent().showInfo();
        }
    }

    public int getCount() {
        return count;
    }
}
