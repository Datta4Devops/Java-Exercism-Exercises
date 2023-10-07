import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        Node() {
            next = null;
        }

        Node(T val) {
            data = val;
            next = null;
        }
    }

    public Node head;
    SimpleLinkedList() {
        head = null;
    }

    SimpleLinkedList(T[] values) {
        for (T val : values) {
            push(val);
        }
    }

    void push(T value) {
        if (head == null) {
            head = new Node(value);
            return;
        } else {

            Node newNode = new Node(value);
            Node iterator = head;
            int size = 0;
            while (iterator.next != null) {
                iterator = iterator.next;
                size++;
            }
            iterator.next = newNode;
        }
    }

    T pop(){   //throws Exception
        T value;
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            if (head.next == null) {
                value = head.data;
                head = null;
            } else {
                Node previousToTail = head;
                while (previousToTail.next.next != null ) {
                    previousToTail = previousToTail.next;
                }
                value = previousToTail.next.data;
                previousToTail.next = null;
            }
        }
        return value;
    }

    void reverse() {
        Node currentNode = head;
        Node previousNode = null;
        Node nextNode = null;
        while(currentNode!=null)
        {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }

    T[] asArray(Class<T> clazz) {
        int length = size();
        T[] array = (T[]) Array.newInstance(clazz, length);
        Node iterator = head;
        int index=length-1;
        while (iterator != null && index >= 0) {
            array[index--] = iterator.data;
            iterator = iterator.next;
        }
        return array;
    }

    int size() {
        if (head == null) return 0;
        Node iterator = head;
        int size = 0;
        while (iterator != null) {
            iterator = iterator.next;
            size++;
        }
        return size;
    }
}
