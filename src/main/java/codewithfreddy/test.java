package codewithfreddy;

public class test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create an empty linked list

        // Insert elements at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        // Insert elements at the end
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        // Print the linked list
        list.printList();
    }
}
// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the list
class LinkedList {
    private Node head; // Head of the list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert an element at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update the head to the new node
    }

    // Method to insert an element at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Insert the new node at the end
        current.next = newNode;
    }

    // Method to print the contents of the list
    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }
    }

