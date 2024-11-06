package Methods;
//subclass provide specific implementaion to 
//the method already provided in super class

    
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    
    public class Method_Override {
        public static void main(String[] args) {
            Animal myAnimal = new Animal(); // Animal object
            Animal myDog = new Dog();       // Dog object (upcast to Animal)
            
            myAnimal.sound(); // Calls Animal's sound method
            myDog.sound();    // Calls Dog's overridden sound method
        }
    }
    


    

