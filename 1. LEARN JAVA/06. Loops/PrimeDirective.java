// The Prime Directive
// Finding prime numbers is a common technical challenge in programming interviews.

// As it happens, Java loops are a great tool to help you do this!

// A prime number is an integer greater than 1 that is only divisible by 1 and itself.

// For example, 2, 3, 5, and 7 are all prime numbers, but 4, 6, 8, and 9 are not.

// Your prime directive: Build a PrimeDirective.java program that creates an ArrayList of all prime numbers in an array.
// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  public boolean isPrime(int n){
    if (n<2){
      return false;
    }
    else if(n==2){
      return true;
    }
    else{
    for(int i=2;i<n;i++){
      if (n%i==0){
        return false;
      }
      }
      }
      return true;

    }


  
  
  // Add your methods here:
  
}
class Main{

  public static void main(String[] args) {
    ArrayList<Integer> primes=new ArrayList<Integer>();

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    for(int i:numbers){
      System.out.println(i+" is Prime--> "+pd.isPrime(i) );
      if (pd.isPrime(i)){
      primes.add(i);}
    }
    System.out.println("The prime numbers are:- "+primes);

  }  

}

// *********Output*************
// $ javac Prime Directive.java 
// $ java Main 
// 6 is Prime--> false 10.
//  Inside the onlyPrimes() body, create a new empty ArrayList called primes to store all the prime numbers that are found. 36 for(int i:numbers){ 37 38 if (pd.isPrime(i)){ 39 primes.add(i);} 40 } 41 System.out.println("The prime numbers are:- +primes); Hint 42 ArrayList<Integer> primes = new ArrayList<Integer>(); 43 } 44 45 } Save 13/15 complete 29 is Prime--> true 28 is Prime--> false 33 is Prime--> false 11 is Prime--> true 100 is Prime--> false 101 is Prime--> true 43 is Prime--> true 89 is Prime--> true The prime numbers are: [29, 11, 101, 43, 89]



// The Prime Directive
// Finding prime numbers is a common technical challenge in programming interviews.

// As it happens, Java loops are a great tool to help you do this!

// A prime number is an integer greater than 1 that is only divisible by 1 and itself.

// For example, 2, 3, 5, and 7 are all prime numbers, but 4, 6, 8, and 9 are not.

// Your prime directive: Build a PrimeDirective.java program that creates an ArrayList of all prime numbers in an array.

// Tasks
// 15/15 complete
// Mark the tasks as complete by checking them off
// Setting Up
// 1.
// Take a look at PrimeDirective.java:

// There’s a class PrimeDirective where you’ll be creating your program.

// Inside main(), an instance of PrimeDirective (pd) has been instantiated. Below that, you’ll see an int array called numbers that has a series of integers.

// To Do: Import ArrayList from java.util at the very top of your program, above the PrimeDirective class. This will allow you to use ArrayLists.

// Optimus Prime
// 2.
// First, we need a way to determine whether a number is prime or isn’t prime.

// Create an empty public method isPrime() that:

// has one parameter: an int called number
// will return true if number is prime
// will return false if number is not prime
// 3.
// Take a moment to consider what makes a prime number prime:

// greater than 1
// only divisible by 1 and itself
// In fact, every number is divisible by 1, so we don’t really care about being able to divide by 1.

// Imagine we have a number n. If n is prime, then n should not be divisible by any integers between 2 and n-1.

// But how can we check this?

// Before you move on, take out paper and a pencil and write down your ideas about how to check if a number is prime.

// 4.
// Inside isPrime(), create a for loop:

// set a counter i equal to 2
// run the loop while i is less than number
// increment i
// 5.
// As you loop through each i value, you want to check if number is divisible by it.

// Inside the loop:

// Check if number is divisible by i.
// If it is, then number is not prime, so you can return false from the method.
// 6.
// Below the for loop, return true because number isn’t divisible by any two smaller integers.

// 7.
// Wait a second… what about 2 or numbers less than 2? Well, those are our edge cases.

// In isPrime() above the for loop, build an if/else if statement to handle the following edge cases:

// If number is 2, it is the smallest prime number.
// If number is less than 2, it is not prime.
// 8.
// Test out your isPrime() method on pd in main() and see if it works!

// Try it out with a few numbers:

// 7 should return true
// 28 should return false
// 2 should return true
// 0 should return false
// Don’t forget to run your code with the following:

// java PrimeDirective

// to Clipboard

// Only Primes
// 9.
// Nice work! Now, all that’s left is building an ArrayList of the prime numbers in the numbers array.

// You can create another method to handle this. Build an empty method called onlyPrimes() that:

// returns an ArrayList of integers
// has a parameter numbers, which is an array of ints
// 10.
// Inside the onlyPrimes() body, create a new empty ArrayList called primes to store all the prime numbers that are found.

// ArrayList<Integer> primes = new ArrayList<Integer>();

// to Clipboard

// 11.
// So how do you find all of the primes in an array? By using a for-each loop!

// Set up a for-each loop that checks each number in numbers.

// 12.
// Now, if number is prime, you can add it to primes.

// 13.
// At the end of the method below the for-each loop, return primes from onlyPrimes().

// 14.
// Time to put it all together!

// In main(), test out pd.onlyPrimes() on the numbers array.

// Don’t forget to run your code with

// java PrimeDirective

// to Clipboard

// Primed For More
// 15.
// Congrats on completing the Prime Directive!

// Want to do even more? Check the hint for some ideas to expand the project.

// Code Editor
// file navigation

// PrimeDirective.java

// Fullscreen Code Editor
// 282930313233343536373839404142434445
//       primes.add(i);}
//     }
//     System.out.println("The prime numbers are:- "+primes);

//   }  

// }
// ctrl + enter
// SaveLoading Complete


// Terminal
// new terminal
// bash session

// Fullscreen Terminal
// Explain error

