package SV1;

public class SearchSet {
    private int mElements = 0;
    private BinaryTreeNode mHead = null;

    SearchSet() {

    }

    public void insert(int val) {
        mElements++;

        BinaryTreeNode node = new BinaryTreeNode(val);
        if (mHead == null) {
            mHead = node;
            return;
        }

        BinaryTreeNode current = mHead;

        while (current != null) {
            int currentVal = current.getValue();

            if (val < currentVal) {
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    current = null;
                } else {
                    current = current.getLeft();
                }
            } else if (current.getRight() == null) {
                current.setRight(node);
                current = null;
            } else {
                current = current.getRight();
            }
        }
    }

    public int getNumberElements() {
        return mElements;
    }

    public boolean contains(int val) {
        if (mHead == null) {
            return false;
        }

        BinaryTreeNode current = mHead;

        while (current != null) {
            int currentVal = current.getValue();

            if (val < currentVal) {
                current = current.getLeft();
            } else if (val > currentVal) {
                current = current.getRight();
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "<" + (mHead == null ? "" : mHead.toString()) + ">";
    }
}
