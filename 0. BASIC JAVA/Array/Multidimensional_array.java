package Array;

public class Multidimensional_array {
    public static void main(String[] args) {
        
    
        int[][] a={{1,2},{3,4}};
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.println(a[i][j]);
            }
        }

        System.out.println(a[1][1]);
    }
    
}
