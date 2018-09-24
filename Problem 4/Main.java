import java.util.Scanner;

public class Main {
public static void main(String[]args){

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a string to reverse: ");
    String str="";
    str=reader.nextLine();
    System.out.println(ProblemFourA(str));



}
public static String ProblemFourA(String str){
Stack stak= new Stack(str.length());
char[]arr= str.toCharArray();
for (int i=0;i<arr.length;i++){
    stak.push(arr[i]);
}
String ans="";
while(!stak.isEmpty()){
char a=stak.pop();
ans=ans+a;
    }
    return ans;
}



}


