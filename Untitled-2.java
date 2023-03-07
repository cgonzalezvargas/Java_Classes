/*
 * Removing elements from ArrayLists using loops
 * 
 */

 //Example with while

 int i = 0; // initialize counter
 
while (i < lst.size()) {
  // if value is odd, remove value
  if (lst.get(i) % 2 != 0){
    lst.remove(i);
  } else {
    // if value is even, increment counter
    i++;
  }
}

//Example using for

for (int i = 0; i < lst.size(); i++) {
    if (lst.get(i) == "value to remove"){
      // remove value from ArrayList
      lst.remove(lst.get(i));
      // Decrease loop control variable by 1
      i--;    
    }
  }


  ////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  //Working example

  import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) 
  {
    // Add your code below
    for(int i = 0; i < lunchBox.size();i++)
    {
      if(lunchBox.get(i) =="ant")
      {
        lunchBox.remove(lunchBox.get(i));
        i--;
      }
      
    }
    return lunchBox;
  }
 
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}