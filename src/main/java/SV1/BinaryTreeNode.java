package SV1;

public class BinaryTreeNode {
    private int mValue;

    private BinaryTreeNode mRight = null;
    private BinaryTreeNode mLeft = null;

    BinaryTreeNode(int val) {
        mValue = val;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int val) {
        mValue = val;
    }

    public BinaryTreeNode getLeft() {
        return mLeft;
    }

    public BinaryTreeNode getRight() {
        return mRight;
    }

    public void setLeft(BinaryTreeNode left) {
        mLeft = left;
    }

    public void setRight(BinaryTreeNode right) {
        mRight = right;
    }

    @Override
    public String toString() {
        if (mLeft == null && mRight == null) {
            return String.valueOf(mValue);
        }

        return "(" + mValue + ", "
                + (mLeft == null ? "-" : mLeft.toString()) + ", "
                + (mRight == null ? "-" : mRight.toString()) + ")";
    }
}
