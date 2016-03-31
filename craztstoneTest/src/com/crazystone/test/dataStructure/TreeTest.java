package com.crazystone.test.dataStructure;

import com.crazystone.datastructure.tree.BinaryTree;
import com.crazystone.datastructure.tree.Tree;

import java.util.Random;

/**
 * Created by crazystone on 2016/3/30.
 */
public class TreeTest {

    public static void main(String[] args) {

        Tree<Integer> tree = new BinaryTree<Integer>();
        tree.insert(5);
        tree.insert(7);
        tree.insert(3);
        tree.insert(2);
        tree.insert(8);

        tree.postOrder();
    }

}
