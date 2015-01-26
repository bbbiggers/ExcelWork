package While;
import java.util.Scanner;
public class fraccalc {

public static void Math1 (String equation){
//Getting values
int space1 = equation.indexOf(" ");
int space2 = equation.indexOf(" ",space1+1);
int firstunderscore = equation.indexOf("_");
int secondunderscore = equation.indexOf("_",firstunderscore+1);
int divide1 = equation.indexOf("/");
int divide2 = equation.indexOf("/",divide1+1);
int divide3 = equation.indexOf("/",divide2+1);
int add = equation.indexOf("+");
int subtract = equation.indexOf("-");
int multiply = equation.indexOf("*");
int whole1;
int numer1;
int denom1;
int whole2;
int numer2;
int denom2;
int type=0;
//Finding equation type
if (add != -1){
 type = add;
}
else if (multiply != -1){
 type = multiply; 
}
else if (subtract != -1){
 type = subtract; 
}
else if (divide3 != -1){
 type = divide2;
}
//Finding whole numbers
if (firstunderscore > type){
secondunderscore = firstunderscore;
firstunderscore = -1;
}
if (firstunderscore != -1 && secondunderscore == -1){
    whole1 = Integer.parseInt(equation.substring(0,firstunderscore));
    numer1 = Integer.parseInt(equation.substring(firstunderscore+1,divide1));
    denom1 = Integer.parseInt(equation.substring(divide1+1, space1));
    numer2 = Integer.parseInt(equation.substring(space2+1,divide2));
    denom2 = Integer.parseInt(equation.substring(divide2+1));

    int mixednum1 = (whole1*denom1)+numer1; 
    int mixednum2 = numer2;
                    
 //System.out.println(whole1+" "+numer1+" "+denom1+" "+numer2+" "+denom2);
    
 //equation = mixednum1+"/"+denom1+equation.substring(type, type+1)+mixednum2+"/"+denom2;
 //System.out.println(equation);
 Math2(equation,mixednum1,mixednum2,denom1,denom2,type);
}
else if (firstunderscore == -1 && secondunderscore != -1){
    //whole1 = Integer.parseInt(equation.substring(0,firstunderscore));
    numer1 = Integer.parseInt(equation.substring(0,divide1));
    denom1 = Integer.parseInt(equation.substring(divide1+1, space1));
    whole2 = Integer.parseInt(equation.substring(space2+1, secondunderscore));
    numer2 = Integer.parseInt(equation.substring(secondunderscore+1,divide2));
    denom2 = Integer.parseInt(equation.substring(divide2+1));

    int mixednum1 = numer1; 
    int mixednum2 = (whole2*denom2)+numer2;
                    
 //System.out.println(numer1+" "+denom1+" "+whole2+" "+numer2+" "+denom2);
    
 //equation = mixednum1+"/"+denom1+equation.substring(type, type+1)+mixednum2+"/"+denom2;
 //System.out.println(equation);
 Math2(equation,mixednum1,mixednum2,denom1,denom2,type);
}
else if (firstunderscore != -1 && secondunderscore != -1){
   whole1 = Integer.parseInt(equation.substring(0, firstunderscore));
   numer1 = Integer.parseInt(equation.substring(firstunderscore+1, divide1));
   denom1 = Integer.parseInt(equation.substring(divide1+1, space1));
   whole2 = Integer.parseInt(equation.substring(space2+1, secondunderscore));
   numer2 = Integer.parseInt(equation.substring(secondunderscore+1, divide2));
   denom2 = Integer.parseInt(equation.substring(divide2+1));
                        
    int mixednum1 = (whole1*denom1)+numer1; 
    int mixednum2 = (whole2*denom2)+numer2;
                        
      
    //System.out.println(whole1+" "+numer1+" "+denom1+" "+whole2+" "+numer2+" "+denom2);                    
    
    //equation = mixednum1+"/"+denom1+equation.substring(type, type+1)+mixednum2+"/"+denom2;                   
    //System.out.println(equation);
    Math2(equation,mixednum1,mixednum2,denom1,denom2,type);
}
else if (firstunderscore == -1 && secondunderscore == -1){
    numer1 = Integer.parseInt(equation.substring(0, divide1));
    denom1 = Integer.parseInt(equation.substring(divide1+1, space1));
    numer2 = Integer.parseInt(equation.substring(space2+1, divide2));
    denom2 = Integer.parseInt(equation.substring(divide2+1));
    System.out.println(numer1+" "+denom1+" "+numer2+" "+denom2);                    
    
    int mixednum1 = numer1;
    int mixednum2 = numer2;
    
    //equation = numer1+"/"+denom1+equation.substring(type, type+1)+numer2+"/"+denom2;                   
    //System.out.println(equation);
    Math2(equation,mixednum1,mixednum2,denom1,denom2,type);
}
}
public static void Math2 (String equation,int mixednum1,int mixednum2,int denom1,int denom2,int type){
int space1 = equation.indexOf(" ");
int space2 = equation.indexOf(" ",space1+1);
int firstunderscore = equation.indexOf("_");
int secondunderscore = equation.indexOf("_",firstunderscore+1);
int divide1 = equation.indexOf("/");
int divide2 = equation.indexOf("/",divide1+1);
int divide3 = equation.indexOf("/",divide2+1);
int add = equation.indexOf("+");
int subtract = equation.indexOf("-");
int multiply = equation.indexOf("*");


if(divide3 != -1) {
	System.out.println("/");
    //numer1 = Integer.parseInt(equation.substring(0, Div));
   // Denom1 = Integer.parseInt(Equation.substring(Div+1, Div2));
   // Num2 = Integer.parseInt(Equation.substring(Div2+1, Div3));
    //denom2 = Integer.parseInt(Equation.substring(Div3+1));
    //Dividing Fractions
	System.out.println("numer1: "+mixednum1);
	System.out.println("denom1: "+denom1);
	System.out.println("numer1: "+mixednum2);
	System.out.println("numer1: "+denom2);
    //Numm = Num1*denom2;
   // deno = Denom1*Num2;
    //Sumpli(Numm, deno);
}
else if (multiply != -1){
System.out.println("*");
 int unsimplenumer = mixednum1 * mixednum2;
 int unsimpledenom = denom1 * denom2;
 equation = unsimplenumer+"/"+unsimpledenom;
 System.out.println(equation);
 simple(equation,unsimplenumer,unsimpledenom);

}
}
public static void simple(String equation,int unsimplenumer,int unsimpledenom){
int count = 0;
int num1 = 1;
int wholenum = 0;
int a = unsimplenumer;
int b = unsimpledenom;
String finaleqat = "";
int wholey = unsimplenumer /unsimpledenom;
unsimplenumer = unsimplenumer %unsimpledenom;
if (unsimplenumer == 0){
System.out.println(wholey);
}
else{
int simplenumer = 0;
int simpledenom = 0;
//FIX
while (unsimplenumer != 0 && unsimpledenom != 0){
int meh = unsimpledenom;
unsimpledenom = unsimplenumer % unsimpledenom;
unsimplenumer = meh;
}
System.out.println("equation: "+a+"/"+b);
int divider = unsimplenumer+unsimpledenom;
System.out.println("gfc: "+divider);
simplenumer = a/divider;
simpledenom = b/divider;
System.out.println("equation: "+simplenumer+"/"+simpledenom);

while (simplenumer > simpledenom){
simplenumer=simplenumer-simpledenom;
wholenum++;
	
}
System.out.println("equation: "+wholenum+"_"+simplenumer+"/"+simpledenom);
//WOEK EN PROGRESS
//if((simplenumer-simpledenom) == 0) {
  //  finaleqat = simplenumer+"/"+simpledenom;
   // System.out.println("Your answer is: "+finaleqat);
//}
//else if((simplenumer-simpledenom) != 0) {

//int a = simplenumer;
//int b = simpledenom;
//while(num1 != 0) {
//a = a-b;
//count = count+1;
//if(a < b) {
//num1 = 0;
//}
//if(a == 0) {
//finaleqat = count+"";
// 
//}
//else if(a != 0) {
//finaleqat = count+"_"+a+"/"+b;
   

//}}
//System.out.println("Your answer is: "+finaleqat); 
// }

}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner userInput = new Scanner( System.in );
String quit = "nope";
while (quit.equals("nope")){
System.out.println("Enter");
String equation = userInput.nextLine();
if (equation.equals("quit")||equation.equals("Quit")){
quit = "quit";
}
else{
Math1(equation);
}
}
}
}
