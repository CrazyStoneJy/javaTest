package com.crazystone.datastructure.tree;

/**
 * Created by crazystone on 2016/3/30.
 */
public class BinaryTree<E extends Comparable<E>> extends AbstractTree<E> {

    private TreeNode<E> root;
    private int size = 0;

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
            return true;
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (current.element.compareTo(e) < 0) {
                    parent = current;
                    current = current.left;
                } else if (current.element.compareTo(e) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }

//if(e.compareTo())
            }

        }

        return false;
    }

    @Override
    public boolean search(E e) {
        return false;
    }

    @Override
    public boolean delete(E e) {
        return false;
    }

    @Override
    public void preOrder() {

    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOrder() {

    }

    @Override
    public int size() {
        return size;
    }


    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<E>(e);
    }


    class TreeNode<E extends Comparable<E>> {
        TreeNode<E> left;
        TreeNode<E> right;
        E element;

        public TreeNode(E e) {
            this.element = e;
        }
    }
}
