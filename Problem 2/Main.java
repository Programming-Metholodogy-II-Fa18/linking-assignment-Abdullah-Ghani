public class Main {

    public static void main(String[] args){
        ArbitraryQueueArray list = new ArbitraryQueueArray();//instantiates the dynamic array with 10 slots
        list.pop();
      for (int i=0;i<12;i++){ //doubles the slots when needed
          list.push(i);
      }
        list.printer(); //prints the array
    }


}
