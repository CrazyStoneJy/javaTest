package com.crazystone.test.dataStructure;

import com.crazystone.datastructure.tree.BinaryTree;
import com.crazystone.datastructure.tree.Tree;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by crazystone on 2016/3/30.
 */
public class TreeTest {

    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.insert(5);
        tree.insert(7);
        tree.insert(3);
        tree.insert(2);
        tree.insert(8);
//        tree.delete(8);
//        tree.delete(2);
//        tree.postOrder();
//System.out.println("constains:"+tree.search(7));
        Iterator iterator = tree.inorderIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("tree height:" + tree.height());
        System.out.println(">>>>>>>>>>>");

        System.out.println("tree child node number is:" + tree.getNumberOfLeaves());
    }

}
