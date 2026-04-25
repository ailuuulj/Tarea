package lista_circular;

public class ListaCircular<E> {

    private class Node<T> {

        T valor;
        private Node<T> siguiente;
        private Node<T> anterior;

        private Node(T value) {
            this.valor = value;
        }

        private void setNext(Node<T> n) {
            this.siguiente = n;
        }

        private void setPrev(Node<T> p) {
            this.anterior = p;
        }
    }

    int size;
    Node<E> head;
    Node<E> trail;

    public ListaCircular() {
        this.size = 0;
    }

    public void addLast(E e) {
        Node<E> new_node = new Node<>(e);
        if (isEmpty()) {
            new_node.setNext(new_node);
            new_node.setPrev(new_node);
            head = new_node;
        } else {
            new_node.setNext(head);
            new_node.setPrev(trail);
            trail.setNext(new_node);
        }
        trail = new_node;
        size++;
    }

    public void addBetween(int pos, E e) throws IndexOutOfBoundsException {
        //aca inserta mal los punteros al siguiente elemento, el nuevo queda apuntando al anterior causando un bucle
        if (pos > size || pos < 0) {
            throw new IndexOutOfBoundsException("El index está fuera del rango de la lista");
        }
        Node<E> new_node = new Node<>(e);
        if (isEmpty()) {
            new_node.setNext(new_node);
            new_node.setPrev(new_node);
            head = new_node;
            trail = new_node;
        } else {
            Node<E> c = head;
            for (int i = 0; i < pos; i++) {
                c = c.siguiente;
                pos--;
            }
            Node<E> oldPrev = c.anterior;
            new_node.setNext(c);
            new_node.setPrev(oldPrev);
            oldPrev.setNext(new_node);
            c.setPrev(new_node);
        }
        size++;
    }

    public void addFirst(E e) {
        Node<E> new_node = new Node<>(e);
        if (isEmpty()) {
            new_node.setNext(new_node);
            new_node.setPrev(new_node);
            trail = new_node;
        } else {
            new_node.setPrev(trail);
            new_node.setNext(head);
            head.setPrev(new_node);
        }
        head = new_node;
        size++;
    }

    public boolean isEmpty() {
        return size == 0 || trail == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        Node<E> buff = head;
        String[] data = new String[size];
        for (int i = 0; i < size; i++) {
            data[i] = buff.valor.toString();
            buff = buff.siguiente;
        }
        return wrapList(data);
    }

    private String wrapList(String[] data) {
        return switch (trail.valor.getClass().getSimpleName()) {
            case "String"   -> "[\"" + String.join("\",\"", data) + "\"]";
            case "Integer"  -> "[" + String.join(",", data) + "]";
            default         -> "[\"" + String.join("\",\"", data) + "\"]"; //para genericos los trata como strings normales
        };
    }
}
