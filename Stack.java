// Name: Rashmi Wagde
// Class: CS 3305/Section 04
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Replit
public class Stack<E> {
//Node class
    public class Node<E> {
        E data;
        Node<E> next;
        //Node constructor
        public Node(E e) {
            data = e;
        }
    }
    //end Node class
        Node head, tail;
        int size;
        //stack constructor
        public Stack() {
            size = 0;
            head = null;
            tail = null;
        }
        //create new element and place into stack
    public void push(E e) {
        Node<E> newNode = new Node<E>(e);
        //if stack is empty, object is placed 1st. else every object is placed at the tail
        if(head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++; //increase stack size
    }
    //remove top element from stack
    public void pop() {
            //if size is 1, 1st element is popped and stack is empty
        if(size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0; //stack is now empty
        }
        //for loop finds the tail of the stack and pops last element
        else {
            Node curr = head;
            for(int i = 0; i < size-2; i++) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
            size--; //decrease stack size
        }
    }
    //return top element
    public Object top() {
        return tail.data;
    }
    //return size of stack
    public int size() {
        return size;
    }
    //checks if stack is empty by seeing if size = 0
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    //prints stack elements
    public void printStack() {
            Node temp;
            temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
    }
}