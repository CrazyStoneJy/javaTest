package com.crazystone.datastructure.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by crazystone on 2016/3/30.
 */
public class BinaryTree<E extends Comparable<E>> extends AbstractTree<E> {

    private TreeNode<E> root;
    private int size = 0;

    public BinaryTree(E[] array) {
        for (E e : array) {
            insert(e);
        }
    }

    public BinaryTree(List<E> list) {
        this((E[]) list.toArray());
    }

    public BinaryTree() {
    }

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
                    current = current.right;
                } else if (current.element.compareTo(e) > 0) {
                    parent = current;
                    current = current.left;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else if (e.compareTo(parent.element) > 0) {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean search(E e) {

        if (isEmpty()) return false;

        while (root != null) {
            if (root.element.compareTo(e) < 0) {
                root = root.left;
            } else if (root.element.compareTo(e) > 0) {
                root = root.right;
            } else {
                return true;
            }
        }
        return false;
    }


    //i didn't konw this
    @Override
    public boolean delete(E e) {
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
                break;//找到了该元素element当前tree的位置
            }
        }

        if (current == null) return false;  //该tree中没有该元素

        //case1：current has no left child
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            //case2:the current node has a left child
            //Locate the rightmost node in the left subtree of
            //the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;//keep going to the right
            }

            current.element = rightMost.element;

            //Eliminate rightmost node
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                //Special case: parentOfRightMost=current
                parentOfRightMost.left = rightMost.left;
            }
        }

        size--;
        return true;
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }

    protected void preOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.element + " ");
        inOrder(root.right);
    }


    @Override
    public void postOrder() {
        postOrder(root);
    }

    protected void postOrder(TreeNode<E> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element + " ");
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    /*  获取tree的所有叶子节点*/
    public int getNumberOfLeaves() {

        

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


    class InorderIterator implements Iterator<E> {

        private List<E> list = new ArrayList<E>();

        private int index = 0;

        public InorderIterator() {

        }

        public void inorder() {
            inOrder(root);
        }

        public void inorder(TreeNode<E> root) {
            if (root == null) return;
            inOrder(root.left);
            list.add(root.element);
            inOrder(root.right);
        }


        @Override
        public boolean hasNext() {
            if (index < list.size()) return true;
            return false;
        }

        @Override
        public E next() {
            return list.get(index++);
        }

        /**
         * Remove the current element and refresh the list
         */
        @Override
        public void remove() {
            delete(list.get(index));
            list.clear();
            inorder();
        }
    }

}
