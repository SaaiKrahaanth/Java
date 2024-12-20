// Fizz Buzz

class FizzBuzz{
    public static void main(String[] args){
      for (int i=1;i<=100;i++){
        if ((i%3==0)&&(i%5==0)){
          System.out.println("Fizz");
        }
        else if(i%5==0){
          System.out.println("Buzz");
  
        }
        else if(i%3==0){
        System.out.println("FizzBuzz");
      }
      else{
        System.out.println(i);
      }
  
    }
  }
  }

//   Learn Java
// Fizz Buzz
// Fizz Buzz is a common developer interview question; so common it’s almost cliché!

// The challenge is designed to weed out 99.5% programming job candidates who cannot creatively use their coding knowledge to solve coding problems.

// Want to give it a shot?

// Numbers replaced with Fizz and Buzz as appropriate.
// Write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:

// For multiples of 3, print Fizz instead of the number.
// For the multiples of 5, print Buzz.
// For numbers which are multiples of both 3 and 5, print FizzBuzz.
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz
// 16
// 17
// Fizz
// 19
// Buzz
//     ...
// 97
// 98
// Fizz
// Buzz

// to Clipboard

// Happy coding!

// Tasks
// 5/6 complete
// Mark the tasks as complete by checking them off
// What You'll Be Building
// 1.
// As the inventor of this challenge, Imran Ghory, states:

// “After a fair bit of trial and error I’ve come to discover that people who struggle to code don’t just struggle on big problems, or even smallish problems (i.e. write an implementation of a linked list). They struggle with tiny problems.

// So I set out to develop questions that can identify this kind of developer and came up with a class of questions I call “FizzBuzz Questions” named after a game children often play (or are made to play) in schools in the UK.”

// To learn more: imranghory.org

// Setting Up
// 2.
// Start by creating a skeleton for the program:

// Create a FizzBuzz class.
// Inside FizzBuzz, build an empty main() method.
// class FizzBuzz {

//     public static void main(String[] args) {
        
//         // You'll add code here

//     }

// }

// to Clipboard

// Outputting Numbers from 1 to 100
// 3.
// How do we output all the numbers from 1 to 100?

// Well, we could write System.out.println() 100 times back to back, but that’s no fun. What else can we do?

// That’s right! A for loop!

// Write a for loop that starts at 1 and iterates to 100.

// 4.
// Inside the for loop, output the counter i.

// 5.
// Run your code — does it print every number between 1 and 100?

// java FizzBuzz

// to Clipboard

// 6.
// Now that we have all the numbers, let’s solve the hard part.

// Before coding further, take out a piece of paper and brainstorm.

// How do we check whether or not a number is divisible by 3? What about for the other two conditions?

// When you are ready, try to implement a solution.

// Code Editor
// file navigation

// FizzBuzz.java

// Fullscreen Code Editor
// 1234567891011121314151617181920
// class FizzBuzz{
//   public static void main(String[] args){
//     for (int i=1;i<=100;i++){
//       if ((i%3==0)&&(i%5==0)){
//         System.out.println("Fizz");
//       }
//       else if(i%5==0){
//         System.out.println("Buzz");

//       }

// ctrl + enter
// SaveLoading Complete


// Terminal
// new terminal
// bash session

// Fullscreen Terminal
