package DNA_Sequencing;


public class DNA {
    // DNA Sequencing



    public static boolean isDna(String dna){
      int len=dna.length();
      if (dna.substring(0,3).equals("ATG") && dna.substring(len-3,len).equals("TGA") && (len%3==0)){
        return true;
      }
      return false;
    }
    
    public static void main(String[] args) {
  
      String[] dna={"ATGCGATACGCTTGA","ATGCGATACGTGA","ATTAATATGTACTGA"};       
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
      // String dna1= "ATGCGATACGCTTGA";
      // String dna2= "ATGCGATACGTGA";
      // String dna3= "ATTAATATGTACTGA";
    for (String s:dna){
      if (isDna(s)){
        System.out.println(s+"is a protein");
      }
      else{
        System.out.println(s+"is not a protein");
      }
    }
  
  
      
    }
    
  }
  
    

