

public class NestedFor{
    public static void main(String[] args) {
        int n=5;
        char a=65;
        int s;
        for(int i=n+1;i>1;i--){
            for (int j=i;j>1;j--){

                s=a+(n-(j+1));
                System.out.print((char)s+"  ");
                
            }System.out.println("\n");
            
        }
    }
    
}
