import java.util.*;
public class CallByValue {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
     int num2=sc.nextInt();
     sc.close();
     String str=call(num1,num2);
     System.out.println(num1 + " " + num2);
     System.out.println(str);
    }
    public static String call(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1 + " " + num2);
        String res=num1 + " " +num2;
        return res;
    }

}
