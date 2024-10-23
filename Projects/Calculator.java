public class Calculator{
    public Calculator(){
  
    }
    public int add(int a,int b){
      return (a+b);
  
    }
     public int sub(int a,int b){
      return (a-b);
  
    }
     public int mul(int a,int b){
      return (a*b);
  
    }
    public double div(double a,double  b){
      return (a/b);
  
    }
    public double mod(double a,double  b){
      return (a%b);
  
    }
    
  
  
  
  
  
    public static void main(String[] args){
      Calculator cal=new Calculator();
      System.out.println(cal.add(4,5));
      System.out.println(cal.sub(4,5));
      System.out.println(cal.mul(4,5));
      System.out.println(cal.div(4,5));
          System.out.println(cal.mod(4,5));
  
    }
  }
  