// "Droid" refers to a robot with human-like features, often shortened from "android."
public class Droid{
    String name;
    int batteryLevel;
    public Droid(String droidName){
      name=droidName;
      batteryLevel=100;
    }
    public String toString(){
      return ("Hello, I’m the droid: "+ this.name);
    }
    public void performTask(String task){
      System.out.println("Codey is performing task: "+ task);
      this.batteryLevel-=10;
      System.out.println("Current battery:- "+this.batteryLevel);
  
  
    }
  public static void main(String[] args){
    Droid obj1=new Droid("Codey");
    System.out.println(obj1.toString());
    obj1.performTask("dancing");
    obj1.performTask("speaking");
     
  }
  }