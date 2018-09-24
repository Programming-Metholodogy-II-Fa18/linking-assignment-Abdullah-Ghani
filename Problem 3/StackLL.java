import java.util.NoSuchElementException;

class Node{
    int data;
    Node next;

public Node(int data){
    this.data=data;
}}


public class StackLL {

      Node front;
    Node sorted;
    Node newer;
    Node past;


    StackLL(){
        front=null;

    }
    void push(int val)
    {
         //allocate node
        Node newnode = new Node(val);
        //link the old list off the new node
        newnode.next = front;
        // move the head to point to the new node
        front = newnode;
        past=front;
    }
    public int pop() {
       if(front==null){
           throw new NoSuchElementException("Stack is Empty");
       }
            int ans=front.data;//saving the data from the first node and then removing it
            front = front.next;
            return ans;
    }

    public int peek(){
        if(front==null){
            throw new NoSuchElementException("Stack is Empty");
        }
       return front.data;

    }

     public void insertionSort()
    {
        // Initialize sorted linked list
        sorted = null;
        Node current = front;
        // Traverse the given linked list and insert every node to sorted
        while (current != null)
        {
            // Store next for next iteration
            Node next = current.next;

            // insert current in sorted linked list
            sortedInsert(current);

            current = next;
        }
        // Update head_ref to point to sorted linked list
        front = sorted;
        System.out.println("\nSort Finished");
    }

    void sortedInsert(Node newnode)
    {
        /* Special case for the head end */
        if (sorted == null || sorted.data >= newnode.data)
        {
            newnode.next = sorted;
            sorted = newnode;

        }
        else
        {
            Node current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.data < newnode.data)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;

        }
    }
    public int pastPeek(){
        if (front==null){
            throw new NoSuchElementException();
        }
        return past.data;
    }

    void printlist()
    {
        Node ptr=front;
        while (ptr != null)
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
    }


}


