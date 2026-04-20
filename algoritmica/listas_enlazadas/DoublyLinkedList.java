
import java.security.ProtectionDomain;

/** A basic doubly linked list implementation. */
public class DoublyLinkedList<E> {
//nested Node class
    private static class Node<E> {
        //reference to the element stored at this node
        private E element;
        //reference to the previous node in the list 
        private Node<E> prev;
        //reference to the subsequent node in the list
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() { return element; } 
        public Node<E> getPrev() { return prev; } 
        public Node<E> getNext() { return next; } 
        public void setPrev(Node<E> p) { prev = p; } 
        public void setNext(Node<E> n) { next = n; } 
        
    } //end of nested Node class

    // instance variables of the Doubly LinkedList 
    private Node<E> header;//header sentinel. Apunta a la cabeza. Los datos se aniaden en medio de este dato
    private Node<E> trailer;// trailer sentinel
    private int size = 0;// number of elements in the list

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() {return size;}

    public boolean isEmpty() {return size == 0;}

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer );
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> successor){
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    // ** Removes the given node from the list and returns its element */
    private E remove(Node<E> node){
        Node<E> predecessor = node.getPrev();
        Node<E> succesor = node.getNext();

        predecessor.setNext(succesor);
        succesor.setPrev(predecessor);

        size--;
        return node.getElement();
    }
} //------------ end of DoubleLinkedList class ------------
//Algoritmica y Programación II


