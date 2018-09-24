


public class Main {

    public static void main(String[]args){
        ArbitraryQueue list =new ArbitraryQueue();

        list.Pop();
        list.Dequeue();
        list.Push(3);
        list.Pop();
        list.Pop();
        list.Push("hello");
        list.Push(4);
        list.Push(6);
        list.Push(90);
        list.Enqueue(54);
        list.Enqueue(43);
        list.printer();
        list.Pop();

        list.Dequeue();
        System.out.println(list.Traverse(1));
        list.printer();


    }
}
