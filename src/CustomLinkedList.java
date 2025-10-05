class Node<E> {
    E data;
    Node<E> next;

    Node(E data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList<E> {
    private Node<E> head;
    private int s = 0;

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
        s++;
    }

    public E get(int index) {
        if (index < 0 || index >= s) throw new IndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= s) throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) current = current.next;
            current.next = current.next.next;
        }
        s--;
    }

    public int size() {
        return s;
    }

    public void display() {
        Node<E> current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        try{
            CustomLinkedList<String> l = new CustomLinkedList<>();
            l.add("1");
            l.add("2");
            l.add("3");
            l.add("4");
            l.add("5");

            l.display();
            System.out.println("Element at index 2: " + l.get(2));

            l.remove(2);
            l.display();

            System.out.println("number of elements in list: " + l.size());
        } catch (Exception e) {
            System.out.println("Invalid index");;
        }

    }
}
