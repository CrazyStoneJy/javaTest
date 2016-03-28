package com.crazystone.datastructure.list;

/**
 * Created by crazystone on 2016/3/28.
 */
public class MyLinkedList<E> extends AbstractList<E> {

    private Node<E> head, tail;

    @Override
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;//获取head的节点
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public void clear() {
        head = tail = null;
    }


    private void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;
        //这个不知道什么意思
        if (tail == null) tail = head;
    }


    private void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }


    private E getFirst() {
        if (size != 0) return head.element;
        return null;
    }


    private E getLast() {
        return null;
    }

    private E removeFirst() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {

        }

        return null;
    }


    private E removeLast() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;//清空链表
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {//获取倒数第二个元素
                current = current.next;
            }

            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }


    static class Node<E> {
        E element;
        Node<E> next;

        public Node(E e) {
            this.element = e;
        }
    }
}
