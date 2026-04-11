package Basics;
class ENCAP{
    private double balance;
    public void deposit(double amount){
        balance+=amount;
    }
    public double getBalance(){
        return balance;
    }
    
    public static void main(String args[]){
        System.out.println("Starting...");
        ENCAP saai=new ENCAP();
        saai.deposit(100);
        System.out.println(saai.getBalance());
    }
}


