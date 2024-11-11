// Desert Island Playlist
// Suppose you’re heading to a desert island, cut off from the world, for the next few days. Luckily, you can bring a playlist of your favorite music ♪♪.

// Also, this is a chance to put your hard-earned Java skills to the test.

// You will build Playlist.java, to store the best possible music playlist using Java Arrays and ArrayList.

// fYou’ll add your favorite songs and use different functions on ArrayList and Arrays to customize the playlist.
// hi am saai
import java.util.ArrayList;
import java.util.Arrays;

class Playlist {

  public static void main(String[] args){
    String[] favoriteSongs=new String[10];
    favoriteSongs=new String[]{"Blinding Lights – The Weeknd",
"Levitating – Dua Lipa (featuring DaBaby)",
"Shape of You – Ed Sheeran","Blinding Lights – The Weeknd",
"Levitating – Dua Lipa ft. DaBaby",
"Havana – Camila Cabello ft. Young Thug",
"Señorita – Shawn Mendes & Camila Cabello",
"Uptown Funk – Mark Ronson ft. Bruno Mars",
"Someone Like You – Adele",
"Despacito – Luis Fonsi ft. Daddy Yankee"};
System.out.println(Arrays.toString(favoriteSongs));
ArrayList<String> desertIslandPlaylist=new ArrayList<>();
desertIslandPlaylist.add("beliver");
desertIslandPlaylist.add("Satisfya");
desertIslandPlaylist.add("Animals");
desertIslandPlaylist.add("Bellydancer");
desertIslandPlaylist.add("Banaza");
System.out.println(desertIslandPlaylist);
desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
desertIslandPlaylist.remove("beliver");
desertIslandPlaylist.remove("Satisfya");
desertIslandPlaylist.remove("Animals");
desertIslandPlaylist.remove("Bellydancer");
desertIslandPlaylist.remove("Banaza");
System.out.println("desertIslandPlaylist");
System.out.println(desertIslandPlaylist);
System.out.println(desertIslandPlaylist.size());
desertIslandPlaylist.remove("Levitating – Dua Lipa ft. DaBaby");
desertIslandPlaylist.remove("Despacito – Luis Fonsi ft. Daddy Yankee");
desertIslandPlaylist.remove("Someone Like You – Adele");
desertIslandPlaylist.remove("Uptown Funk – Mark Ronson ft. Bruno Mars");
desertIslandPlaylist.remove("Blinding Lights – The Weeknd");
System.out.println(desertIslandPlaylist);
System.out.println(desertIslandPlaylist.size());
int A=desertIslandPlaylist.indexOf("Havana – Camila Cabello ft. Young Thug");
int B=desertIslandPlaylist.indexOf("Levitating – Dua Lipa ft. DaBaby");
String temp = "";
if (A != -1 && B != -1) {
    temp = desertIslandPlaylist.get(A);
    desertIslandPlaylist.set(A, desertIslandPlaylist.get(B));
    desertIslandPlaylist.set(B, temp);
}
  }
  
}

// Tasks
// 15/15 complete
// Mark the tasks as complete by checking them off
// Create Your Playlist
// 1.
// We’ve created a file for you called Playlist.java

// Add a main() method to the Playlist class in the Playlist.java file.
// Import Arrays and ArrayList from java.util in Playlist.java since we’re working with them.
// 2.
// Inside main() of the Playlist.java file, create an array favoriteSongs that can hold String values and initialize it with your 10 favorite songs.

// Each element of the array should be a string in this format “Artist - Song Title”. For example:

// "Queen - Bohemian Rhapsody"

// to Clipboard

// 3.
// Print the first three songs in your favoriteSongs array.

// 4.
// Add an ArrayList called desertIslandPlaylist to store String values.

// 5.
// Let’s add some songs to our desertIslandPlaylist!

// Use the 
// Preview: Docs Adds an element to an ArrayList.
// add()
//  method of the ArrayList class to add 5 of your favorite songs to desertIslandPlaylist.

// Remember to add songs that are not present in the favoriteSongs array. 

// 6.
// Print desertIslandPlaylist to the terminal.

// Run the code and see what your playlist looks like!

// Add and Remove Songs
// 7.
// You have two lists of songs.

// You want to hear your favorite songs if you get stuck on a desert island, right?

// Add all the songs from favoriteSongs to desertIslandPlaylist:

// Use Arrays.asList() method and pass the favoriteSongs Array to convert it into a list.
// Add this list to desertIslandPlaylist using the 
// Preview: Docs Loading link description
// addAll()
//  method.
// For example, this is how we can add all the breeds from the array favoriteDogs to ArrayList dogsNames like so:

// dogNames.addAll(Arrays.asList(favoriteDogs)); 

// to Clipboard

// 8.
// Yikes! It turns out you can only bring five songs now. You’ll need to make some tough decisions and remove some of the songs from desertIslandPlaylist.

// You need to check how many songs does desertIslandPlaylist ArrayList contains.

// Use the 
// Preview: Docs Loading link description
// size()
//  method to get the number of songs on your playlist and print it to the terminal.

// 9.
// Now, to keep your top 5 favorite songs in the playlist, remove the rest of your least favorite songs.

// Use the 
// Preview: Docs Loading link description
// remove()
//  method to remove songs until you only have 10 songs left.

// Here, we remove the dog breed “Golden Retriever” from dogNames():

// dogNames.remove("Golden Retriever"); 

// to Clipboard

// Swap Songs
// 10.
// The playlist seems a little boring. Let’s change the ArrayList by swapping some of the songs.

// Before we get started, Run the code.

// The code will print the desertIslandPlaylist ArrayList which contains your top 5 favorite songs.

// 11.
// Select two songs and get their indices using the 
// Preview: Docs Loading link description
// indexOf()
//  method. Let’s call these songs Song A and Song B and store their indices inside these variables.

// 12.
// Now, create a String variable called tempA and assign it with the value of “Song A”.

// Here we create a String variable called tempBreed and assign it the value of “Border Collie”:

// String tempBreed = "Border Collie"; 

// to Clipboard

// 13.
// Replace Song A with Song B by using the set() method on desertIslandPlaylist to replace Song A with Song B.

// Print the ArrayList desertIslandPlaylist and run the code. Song B should appear twice in the playlist now.

// In the example below, we use the set() method to add the “Border Collie” in the place of “Golden retriever” in ArrayList dogNames. Remember, we have the index of “Golden retriever” stored in the variable indexD:

// dogNames.set(indexD, "Border Collie"); 

// to Clipboard

// 14.
// Let’s complete the second step of our swap.

// Call set() on desertIslandPlaylist again with the index of Song B and the temporary String variable you created tempA.

// With this, you’re putting Song A where Song B used to be because variable tempA has the value of Song A stored.

// Now, Print the playlist to see the songs swapped from their original positions.

// Remix!
// 15.
// Well done! You’ve successfully built your desert island playlist using arrays and ArrayLists!

// Here’s one possible solution.

// Want to try something else? Check the hint for ideas:

// Build another desert island playlist for food recipes, movies, or TV shows.
// Create a method that shuffles the song order.
// Reverse the song order.
