package Methods;

class Calculator{

    void add(int a,int b){
        System.out.println((a+b));
    }
    void add(float a, float b,float c){
        System.out.println((a+b+c));
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1,1);
        c.add(2.3f,3.4f,23.4f);    }
    
}
