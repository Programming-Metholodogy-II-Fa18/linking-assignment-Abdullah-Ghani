import java.util.NoSuchElementException;

class Node<T>{
    T data;
    Node<T> next;

    Node (T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public String toString() {
        return data.toString();
    }
}
public class ArbitraryQueue<T> {

    Node<T> front;// points to the first item in the LL
    Node<T> last;//points to the last item in the LL
        int size;

        ArbitraryQueue() {
            front = null;
            last =null;
            size = 0;
        }
     public void Push(T data){//inserts at the head of the queue
        Node<T> temp = new Node(data, null);
            if(size==0){
                front =temp;
                last=temp;
                size+=1; }
                else{
                temp.next=front;
            front=temp;
            size+=1; }}

    public void printer() {
        for (Node<T> ptr = front; ptr != null; ptr = ptr.next) {
            System.out.print(ptr.data + " -> ");
        }
        System.out.println("\\");}

    public void Enqueue(T data){//inserts at the end of the queue
        Node temp = new Node(data, null);
        if(size==0){
            front =temp;
            last=temp;
            size+=1; }
            else{
        last.next=temp;
        last=temp;
        size+=1; }}


    public T Pop(){
            try{
            T frontData = front.data; // save data
            front = front.next; // removed first node
            size -= 1;
            return frontData;
            }catch (Exception e){
                System.out.print(e);
                System.out.println(" :You can't pop from an empty list");
                return null;}}

    public T Dequeue(){
        try{
        Node ptr=front;
        while (ptr.next.next!=null){ //ptr points to the 2nd last node
            ptr=ptr.next;
            }
        T lastData=last.data;
        last=ptr;
        last.next=null;
        size-=1;
        return lastData;}
        catch (Exception e){
            System.out.print(e);
            System.out.println(" :You can't dequeue from an empty list");
            return null;
        }
    }
   public T Traverse(int index){
       if (front == null) {
           // list is empty
           throw new NoSuchElementException("List is empty");}
            int i =0;
            Node<T> ptr=front;
            while(i!=index){
                ptr=ptr.next;
                i+=1;

            }
            T ptrData=ptr.data;
            return ptrData; }


    }



