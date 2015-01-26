
import java.awt.*;
import java.util.Scanner;
public class Abc123 {
public static void main(String[] args) {
Scanner userInput = new Scanner( System.in );
//The good stuff


//Variables
int x = 300;
int y = 300;
String move;//w, a, s, d
int fun = 3;
String p1;
String p2;
int turd = 0;
int row;
int collumn;
System.out.println("Player 1:");
p1 = userInput.next();
System.out.println("Player 2:");
p2 = userInput.next();
System.out.println("Begin!");

DrawingPanel win = new DrawingPanel(600, 600);
win.setBackground(Color.WHITE);
Graphics g = win.getGraphics();
{g.fillRect(200,0 , 20, 1000);
g.fillRect(0,200 , 1000, 20);
g.fillRect(0,400 , 1000, 20);
g.fillRect(400,0 , 20, 1000);
}



while(fun == 3){

while(turd == 0){
System.out.println(p1+ "'s Turn");
System.out.println("Row:");
row = userInput.nextInt();
System.out.println("Collumn:");
collumn = userInput.nextInt();
if (row == 1 && collumn == 1){
g.setColor(Color.RED);
g.drawLine(0, 0, 200, 200);
g.drawLine(200, 0, 0, 200);

}
if (row == 1 && collumn == 2){
g.setColor(Color.RED);
g.drawLine(220, 0, 400, 200);
g.drawLine(220, 200, 400, 0);

}
if (row == 1 && collumn == 3){
g.setColor(Color.RED);
g.drawLine(420, 0, 600, 200);
g.drawLine(420, 200, 600, 0);
}
if (row == 2 && collumn == 1){
g.setColor(Color.RED);
g.drawLine(0, 220, 200, 400);
g.drawLine(0, 400, 200, 220);

}
if (row == 2 && collumn == 2){
g.setColor(Color.RED);
g.drawLine(220, 220, 400, 400);
g.drawLine(220, 400, 400, 220);

}
if (row == 2 && collumn == 3){
g.setColor(Color.RED);
g.drawLine(420, 220, 600, 400);
g.drawLine(420, 400, 600, 220);

}
if (row == 3 && collumn == 1){
g.setColor(Color.RED);
g.drawLine(0, 420, 200, 600);
g.drawLine(0, 600, 200, 420);

}
if (row == 3 && collumn == 2){
g.setColor(Color.RED);
g.drawLine(220, 420, 400, 600);
g.drawLine(220, 600, 400, 420);

}
if (row == 3 && collumn == 3){
g.setColor(Color.RED);
g.drawLine(420, 420, 600, 600);
g.drawLine(420, 600, 600, 420);

}
turd += 1;
}

while(turd == 1){
System.out.println(p2+ "'s Turn");
System.out.println("Row:");
row = userInput.nextInt();
System.out.println("Collumn::");
collumn = userInput.nextInt();

if (row == 1 && collumn == 1){
g.setColor(Color.BLUE);
g.drawOval(0, 0, 200, 200);

}
if (row == 1 && collumn == 2){
g.setColor(Color.BLUE);
g.drawOval(220,0,180,200);

}
if (row == 1 && collumn == 3){
g.setColor(Color.BLUE);
g.drawOval(420,0,180,200);
}
if (row == 2 && collumn == 1){
g.setColor(Color.BLUE);
g.drawOval(0,220,200,180);

}
if (row == 2 && collumn == 2){
g.setColor(Color.BLUE);
g.drawOval(220, 220,180,180) ;

}
if (row == 2 && collumn == 3){
g.setColor(Color.BLUE);
g.drawOval(420, 220, 180,180);

}
if (row == 3 && collumn == 1){
g.setColor(Color.BLUE);
g.drawOval(0, 420, 200, 180);

}
if (row == 3 && collumn == 2){
g.setColor(Color.BLUE);
g.drawOval(220, 420, 180,180);

}
if (row == 3 && collumn == 3){
g.setColor(Color.BLUE);
g.drawOval(420, 420, 180,180);

}

turd -= 1;
}
}}}