import java.util.NoSuchElementException;

public class ArbitraryQueueArray<T> {

       private Object[] s;
        private int n=0; //number of items
        int original=10;
        Object item;

        public String toString() {
            return item.toString();
        }


        public ArbitraryQueueArray(){
            s= new Object[original]; //initialises the array with 10 slots
        }

        private void resize(int capacity){
            Object[] copy = new Object[capacity]; //doubles the array when it overflows
            for (int i=0;i<n;i++)
                copy[i]=s[i];
            s=copy;}

        public void push(T item){
            if (n==s.length){ //push to the top of the array
                resize(2*s.length);}
                Object[] temp=new Object[s.length];
            for (int i=0;i<n;i++){
                temp[i+1]=s[i];
            }
            temp[0]=item;
            s=temp;
            n+=1;

        }
        public Object pop(){
            try{
                Object item =s[0]; //pops from the top of the array
                if (item==null){
                    throw new NullPointerException();
                }
                Object[] copy = new Object[s.length];
                n--;
                for(int i=1;i<=n;i++){
                    copy[i-1]=s[i];
                }s=copy;
                if(n>0 && n==s.length/4){
                    resize(s.length/2);
                }return item;}
            catch (Exception e){
                System.out.println(e+" :You can not pop from an empty array");
                return null;
            }

        }

        public void Enqueue(T item){
            if (n==s.length){ //push to the end of the array
                resize(2*s.length);}
            s[n++]=item;
        }

        public Object Dequeue(){
try{
            Object item = s[--n]; //returns object at the end of the queue
            if (item==null){
                throw new NullPointerException();
            }
            s[n]=null;
            if(n>0 && n==s.length/4){
                resize(s.length/2);}
            return item;
        }catch(Exception e){
    System.out.println(e+ ": You can not dequeue from an empty array");
    return null;
        }}

        public Object Traverse(int index){
           try{ if(index>n-1){
                throw new NullPointerException();
            }
            Object item= s[index];
            return item;}
            catch(Exception e){
                System.out.println(e+  " : Array does not contain an element at that index");
            return null;
            }
        }

        public void printer(){
            for (int i=0;i<s.length;i++){
                if(s[i]!=null){
                    System.out.print(s[i]+" ->");
                }else{
                    System.out.print("\\"+ " ->");
                }
            }
        }



    }







