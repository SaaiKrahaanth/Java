package Methods;
import java.util.Scanner;

public class Rectangle {
    int a;
    int b;
    static public int area(int a,int b){
        return (a*b);
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length");
        int a=s.nextInt();
        System.out.println("enter breadth");
        int b=s.nextInt();

        System.out.println("Area of rectangle : "+area(a,b));



    }
    
}
