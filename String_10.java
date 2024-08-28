// Find length of string without using string method
import java.util.Scanner;
public class String_10 {
    public static void main(String args[]){
        int i=0;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(char c:ch){
            i++;
        }
        System.out.println("length of string"+i);
    }
}
