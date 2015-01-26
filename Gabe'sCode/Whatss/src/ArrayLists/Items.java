package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class Items {
public static void main(String[] args) {
Scanner userInput = new Scanner( System.in );

ArrayList<String>groceryList = new ArrayList<String>();

System.out.println("What want");
String stuff = userInput.nextLine();
	
while (!stuff.equals("")){
if(groceryList.contains(stuff)){
System.out.println("Repeat Item");
}else{
groceryList.add(stuff);
}
System.out.println("What want");
stuff = userInput.nextLine();	
}

if (groceryList.contains("Milk")){
	groceryList.remove("Milk");
	groceryList.add("Chocolate Milk");
}
if (groceryList.contains("sauerkraut")){
	groceryList.remove("sauerkraut");
}
if (groceryList.contains("Ice Cream")){
	groceryList.remove("Ice Cream");
	groceryList.add("Ice Cream");
}
System.out.println(groceryList);
if(groceryList.size() > 10){
	System.out.println("You will need help carrying");	
}


}	
}
