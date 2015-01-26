package While;


 
	 
 

import java.util.Scanner;
import java.util.Random;

public class FractionCalculator {
    public static void main (String[] args)
    {        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter:");
        
        int YesOrNo = 1;
        
        while(YesOrNo == 1){
            String Fraction = userInput.nextLine();
            
            if(Fraction.contains("Quit") || Fraction.contains("quit")){
                System.exit(0);
            }
            
            Splitter(Fraction);
            System.out.print("Enter:");
        }
    }
    
    public static void Splitter(String Fraction){
        // 0_1/4 + 0_1/4
        // 1/4 + 1/4
        
        String Left = Fraction.substring(0, Fraction.indexOf(" "));
        String Operator = Fraction.substring(Fraction.indexOf(" ")+1, Fraction.indexOf(" ")+2);
        String Right = Fraction.substring((Fraction.indexOf(" ")+3),Fraction.length()); 
        
        System.out.println(Left);
        System.out.println(Operator);
        System.out.println(Right);
        
        String LWN = "0";
        String RWN = "0";
        
        if(Left.contains("_")){
            LWN = Left.substring(0,Left.indexOf("_"));
        }else{
            LWN = "0";
        }
        
        if(Right.contains("_")){
            RWN = Right.substring(0,Right.indexOf("_"));
        }else{
            RWN = "0";
        }
        
        String LNumerator = Left.substring(Left.indexOf("_")+1,Left.indexOf("/"));
        String LDenominator = Left.substring(Left.indexOf("/")+1, Left.length());
        
        String RNumerator = Right.substring(Right.indexOf("_")+1,Right.indexOf("/"));
        String RDenominator = Right.substring(Right.indexOf("/")+1, Right.length());
        
        System.out.println(LWN);
        System.out.println(LNumerator);
        System.out.println(LDenominator);
        System.out.println(Operator);
        System.out.println(RWN);
        System.out.println(RNumerator);
        System.out.println(RDenominator);
        
        int LWNI = Integer.parseInt(LWN);
        int LNumeratorI = Integer.parseInt(LNumerator);
        int LDenominatorI = Integer.parseInt(LDenominator);
        int RWNI = Integer.parseInt(RWN);
        int RNumeratorI = Integer.parseInt(RNumerator);
        int RDenominatorI = Integer.parseInt(RDenominator);
        
        
        Calculate(LWNI, LNumeratorI, LDenominatorI, Operator, RWNI, RNumeratorI, RDenominatorI);
    }
    
    public static void Calculate(int LWN, int LNumerator, int LDenominator, String Operator, int RWN, int RNumerator, int RDenominator)
    {
        int buffer1 = 0;
        int buffer2 = 0;
        int buffer3 = 0;
        int buffer4 = 0;
        int buffer5 = 0;
        // a            c
        //--- Operator ---
        // b            d
        
        if(Operator.equals("+")){
            int unsimplenumerL = LNumerator + (LWN * LDenominator);
            System.out.println(unsimplenumerL+"/"+LDenominator);
            int unsimplenumerR = RNumerator + (RWN * RDenominator);
            System.out.println(unsimplenumerR+"/"+RDenominator);
            
            if(LDenominator == RDenominator){
               //System.out.println((LNumerator + RNumerator) + "/" + LDenominator);
               int unsimplenumer = unsimplenumerL+unsimplenumerR;
               int unsimpledenom = LDenominator;
               simple(unsimplenumer,unsimpledenom);
            }else{
                int unsimplenumer = (unsimplenumerL*RDenominator)+(unsimplenumerR*LDenominator);
                int unsimpledenom = LDenominator*RDenominator;
                simple(unsimplenumer,unsimpledenom);
            }
            
            //a/b + c/d = (ad + bc) / bd 
            
        }else if(Operator.equals("-")){
            int unsimplenumerL = LNumerator + (LWN * LDenominator);
            System.out.println(unsimplenumerL+"/"+LDenominator);
            int unsimplenumerR = RNumerator + (RWN * RDenominator);
            System.out.println(unsimplenumerR+"/"+RDenominator);
            
            if(LDenominator == RDenominator){
               int unsimplenumer = unsimplenumerL-unsimplenumerR;
               int unsimpledenom = LDenominator;
               simple(unsimplenumer,unsimpledenom);
            }else{
                int unsimplenumer = (unsimplenumerL*RDenominator)-(unsimplenumerR*LDenominator);
                int unsimpledenom = LDenominator*RDenominator;
                simple(unsimplenumer,unsimpledenom);
            }
            
            //a/b - c/d = (ad + bc) / bd 
            
        }else if(Operator.equals("/")){
            int unsimplenumerL = LNumerator + (LWN * LDenominator);
            int unsimplenumerR = RNumerator + (RWN * RDenominator);
            
            System.out.println("Division");
            int unsimplenumer = unsimplenumerL*unsimplenumerR;
            int unsimpledenom = LDenominator*RDenominator;
            simple(unsimplenumer,unsimpledenom);
        }else if(Operator.equals("*")){
            int unsimplenumerL = LNumerator + (LWN * LDenominator);
            int unsimplenumerR = RNumerator + (RWN * RDenominator);
            
            System.out.println("Multiplication");
            int unsimplenumer = unsimplenumerL*unsimplenumerR;
            int unsimpledenom = LDenominator*RDenominator;
            simple(unsimplenumer,unsimpledenom);
        }else{ // UNKNOWN OPERATOR -- ERROR HANDLING
            System.out.println("Unknown Operator.");
        }
}
    public static void simple (int unsimplenumer , int unsimpledenom ){
      int a = unsimplenumer;
      int b = unsimpledenom;
      int wholenum = unsimplenumer/unsimpledenom;
      unsimplenumer = a%b;
        if (unsimplenumer == 0){
            System.out.println(wholenum);
        
        }
        else{
            int simplenumer = 0;
            int simpledenom = 0;
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
            
            
        }
    
    //public static void Quit()
    //{
      //  System.out.println("Goodbye!");
       // System.exit(0);
    //}
}
}​