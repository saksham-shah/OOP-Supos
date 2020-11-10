package SV1;

public class FunctionalArray {
    private BinaryTreeNode mHead = null;
    private int length = 0;

    FunctionalArray(int len) {
        length = len;
        mHead = createNode(len);
    }

    public int get(int index) {
        return get(mHead, index + 1);
    }

    public void set(int index, int value) {
        set(mHead, index + 1, value);
    }

    private static BinaryTreeNode createNode(int len) {
        if (len == 0) return null;

        BinaryTreeNode left = createNode(len / 2);
        len--;
        BinaryTreeNode right = createNode(len / 2);

        BinaryTreeNode head = new BinaryTreeNode(0);
        head.setLeft(left);
        head.setRight(right);

        return head;
    }

    private static int get (BinaryTreeNode node, int index) {
        if (index < 1 || node == null) throw new IndexOutOfBoundsException();

        if (index == 1) {
            return node.getValue();
        }

        if (index % 2 == 0) {
            return get(node.getLeft(), index / 2);
        }

        return get(node.getRight(), index / 2);
    }

    private static void set (BinaryTreeNode node, int index, int value) {
        if (index < 1 || node == null) throw new IndexOutOfBoundsException();

        if (index == 1) {
            node.setValue(value);
        } else if (index % 2 == 0) {
            set(node.getLeft(), index / 2, value);
        } else {
            set(node.getRight(), index / 2, value);
        }
    }

    @Override
    public String toString() {
        return "<" + (mHead == null ? "" : mHead.toString()) + ">";
    }
}
