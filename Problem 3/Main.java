
public class Main {

    public static void main(String[] args)
    {
        StackLL list = new StackLL();

        list.push(5);
        list.push(20);
        list.push(4);
        list.push(3);
        list.push(30);

        System.out.println("Linked List before Sorting..");
        list.printlist();

        list.insertionSort();
        System.out.println("\nLinkedList After sorting");
        list.printlist();
        System.out.println("\n"+list.pastPeek());
    }




}
