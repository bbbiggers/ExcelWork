package calc;
import java.util.Scanner;

public class DivisionCalculations {
//MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN 
public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
        String quits = "good";
       
        while(quits.equals("good")) {
        	
       System.out.println("What is your Equation?");
      //System.out.println("Spaces Between the Operation!\n(EX:23 + 2/2)");
        String Equation = Imput.nextLine();
        if(Equation.equals("quit")) {
        	System.out.println("Quid");
                quits = "quit";
        }
        else {
                imput(Equation);
        }} 
}
//SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER SPACER
public static void imput(String Equation) {
int firSps = Equation.indexOf(" ");
int SesSps = Equation.indexOf(" ", firSps+1);
int thrSps = Equation.indexOf(" ", SesSps+1);
int frtSps = Equation.indexOf(" ", thrSps+1);
if(thrSps != -1 && frtSps != -1 && firSps != -1 && SesSps != -1) {
String PaUN = Equation.substring(0,firSps);
String PaDO = Equation.substring(SesSps+1,thrSps);
String PaTR = Equation.substring(frtSps+1);
//System.out.println("Tri");
TriProb(Equation, firSps, SesSps, thrSps, frtSps, PaUN, PaDO, PaTR);
}
else if(firSps != -1 && SesSps != -1) {
	//System.out.println("Two Stuffs");
DiProb(Equation, firSps, SesSps);

}
else {
	System.out.println("That Equation is a stick of butter it's so bad");	
	return;
}
    }
//TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE TRI SPACE
public static void TriProb(String Equation, int firSps, int SesSps, int thrSps, int frtSps, String PaUN, String PaDO, String PaTR) {
int firDIV = Equation.indexOf("/");
        int SesDIV = Equation.indexOf("/", firDIV+1);
        int thrDIV = Equation.indexOf("/", SesDIV+1);
        int frtDIV = Equation.indexOf("/", thrDIV+1);
        int fitDIV = Equation.indexOf("/", frtDIV+1);
        System.out.println("Sorry Try again");
}

//TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT TRIMULIT 
public static void TRIMUlTI(String Equation) {

	
	
}
//DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE DI SPACE 
public static void DiProb(String Equation, int firSps, int SesSps) {
        int firUnd = Equation.indexOf("_");
        int SesUnd = Equation.indexOf("_", firUnd+1);
        int und = 54;
        
        if(firUnd > firSps && firUnd > SesSps) {
        SesUnd = firUnd;
        firUnd = -1;
        }
       
        if(firUnd != -1 && SesUnd == -1) {
            //FIRST UNDER SCORE
    //System.out.println("FIRST UNDER SCORE");
        und = 11;
        ASMD(Equation, und);
    }
    else if(firUnd != -1 && SesUnd != -1) {
            //TWO UNDER SCORES
    //System.out.println("TWO UNDER SCORES");
            und = 2;
            ASMD(Equation, und); 
    }
    else if(SesUnd != -1 && firUnd == -1) {
            //SECOND UNDER SCORE
   // System.out.println("SECOND UNDER SCORE");
        und = 22;
        ASMD(Equation, und);
    }
    else {
   // System.out.println("NO UNDER SCORE");
    und = 0;
            //NO UNDER SCORE
            ASMD(Equation, und);
    }
        
        
        
//dog MOose
}
//COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER COMBINER 
public static void ASMD(String Equation, int und) {
// 0 = No under     11 = first under     2 = two under     22 = second under score
	   int firSps = Equation.indexOf(" ");
       int SesSps = Equation.indexOf(" ", firSps+1);
       int firDIV = Equation.indexOf("/");
       int SesDIV = Equation.indexOf("/", firDIV+1);
       int thrDIV = -1;
       if(SesDIV == -1) {
    	   thrDIV = -1; 
       }
       else if(SesDIV != -1) {
    	   thrDIV = Equation.indexOf("/", SesDIV+1);
       }
       
       int firUnd = Equation.indexOf("_");
       int SesUnd = Equation.indexOf("_", firUnd+1);
       
       int DIVs = 54;
       
       if(firDIV == -1) {
        DIVs = 0;
       // System.out.println("No divs");
       }
       else if(thrDIV != -1) {
        DIVs = 3;
       // System.out.println("Three divs");
       }
       else if(SesDIV != -1 && SesDIV > SesSps) {
        //two DIV Not operatioon
        DIVs = 4;
       //System.out.println("Two divs none operation");
       }
       else if(SesDIV != -1 && SesDIV < SesSps && SesDIV > firSps && firDIV < firSps) {
        //DIV operatioon
        DIVs = 6;
      //  System.out.println("Two divs one operation one before");
       }
       else if(SesDIV != -1 && firDIV < SesSps && firDIV > firSps && SesDIV > SesSps) {
           //DIV NOT operatioon Secopnd after Space
           DIVs = 12;
           //System.out.println("Two divs one after operation and ones operation");
          }
       else if(firDIV != -1 && firDIV < SesSps && firDIV > firSps) {
        //one DIV operatioon
        DIVs = 23;
        //System.out.println("One Div that is the operation");
       }
       else if(firDIV != -1 && firDIV < firSps) {
        //DIV NOT operatioon first DIv
        DIVs = 26;
        //System.out.println("One Div before Spaces");
       }
       else if(firDIV != -1 && firDIV > SesSps) {
           //DIV NOT operatioon Secopnd after Space
           DIVs = 28;
           //System.out.println("One Div after Spaces");
          }
       
       else {
    	   System.out.println("Mass Code Failure Shut Down Compensing!");
       return;
       }
      // System.out.println("Thrird DIV "+thrDIV);
    //   System.out.println("Div number "+DIVs);
    // 0 = No Div     3 = three Div     4 = Two div not operation     6 = Two divs one operation one before     23 = one div that is operation        
       
//12 = Two divs one after operation and ones operation     26 = One Div before Spaces     28 = One Div after Spaces
       
//NumberTOW = Integer.parseInt(Equation.substring(0, Div));
       int NumeratorOne = 54;
       int NumeratorTwo = 54;
       int DenomatorOne = 54;
       int DenomatorTwo = 54;
       String Operation = "False";
       int nugget = 0;
       int plop = 0;
       int nugget2 = 0;
       int plop2 = 0;
       int neg1 = 0;
       int neg2 = 0;  
       int ce = 0;
       if(firUnd == SesUnd) {
    	   SesUnd = -1;
       }
       if(firUnd != -1) {
    	  neg1 =  Integer.parseInt(Equation.substring(0, firUnd));
       }
       else if(firUnd != -1 && SesUnd != -1) {
    	   neg1 =  Integer.parseInt(Equation.substring(0, firUnd));
    	   neg2 =  Integer.parseInt(Equation.substring(SesSps+1, SesUnd));
       }
       if(neg1 < 0) {
       ce = 1;
       }
       else if(neg1 < 0 && neg2 < 0){
       ce = 2;
       }
       else if(neg2 < 0) {
       ce = 3;
       }
       
       
if(und == 0) {
	//System.out.println("ssss");
//NO UNDERs
if(DIVs == 0) {
NumeratorOne = Integer.parseInt(Equation.substring(0, firSps));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1));
DenomatorOne = 1;
DenomatorTwo = 1;
Operation = Equation.substring(firSps+1, SesSps);
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
else if(DIVs == 3) {
	//System.out.println("Here Check!");
NumeratorOne = Integer.parseInt(Equation.substring(0, firDIV));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1, thrDIV));
DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
DenomatorTwo = Integer.parseInt(Equation.substring(thrDIV+1));
Operation = Equation.substring(firSps+1, SesSps);
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
else if(DIVs == 4) {
	
NumeratorOne = Integer.parseInt(Equation.substring(0, firDIV));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1, SesDIV));
DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
DenomatorTwo = Integer.parseInt(Equation.substring(SesDIV+1));
Operation = Equation.substring(firSps+1, SesSps);
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
else if(DIVs == 6) { 
NumeratorOne = Integer.parseInt(Equation.substring(0, firDIV));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1));
DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
DenomatorTwo = 1;
Operation = Equation.substring(firSps+1, SesSps);
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
else if(DIVs == 12) {
NumeratorOne = Integer.parseInt(Equation.substring(0, firSps));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1, firDIV));
DenomatorOne = 1;
DenomatorTwo = Integer.parseInt(Equation.substring(firDIV+1));
Operation = Equation.substring(firSps+1, SesSps);	
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
else if(DIVs == 23) {
NumeratorOne = Integer.parseInt(Equation.substring(0, firSps));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1));
DenomatorOne = 1;
DenomatorTwo = 1;
Operation = Equation.substring(firSps+1, SesSps);
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
else if(DIVs == 26) {
NumeratorOne = Integer.parseInt(Equation.substring(0, firDIV));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1));
DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
DenomatorTwo = 1;
Operation = Equation.substring(firSps+1, SesSps);	
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
else if(DIVs == 28) {
NumeratorOne = Integer.parseInt(Equation.substring(0, firSps));
NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1, firDIV));
DenomatorOne = 1;
DenomatorTwo = Integer.parseInt(Equation.substring(firDIV+1));
Operation = Equation.substring(firSps+1, SesSps);	
MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
}
//End of No Unders END OF IF
}
else if(und == 11) {
//FiRST
	if(DIVs == 0) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 3) {
		nugget = Integer.parseInt(Equation.substring(0, firUnd));
		plop = Integer.parseInt(Equation.substring(firUnd+1, firDIV));
		NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1, thrDIV));
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = Integer.parseInt(Equation.substring(thrDIV+1));
		Operation = Equation.substring(firSps+1, SesSps);
		if(ce == 0) {
	    NumeratorOne = (nugget*DenomatorOne)+plop;
		}
		else if(ce == 1) {
		    NumeratorOne = (nugget*DenomatorOne)-plop;
		}
		else {
			System.out.println("Shutting Down!");
			return;
		}
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 4) {
		nugget = Integer.parseInt(Equation.substring(0, firUnd));
		plop = Integer.parseInt(Equation.substring(firUnd+1, firDIV));
		NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1, SesDIV));
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = Integer.parseInt(Equation.substring(SesDIV+1));
		Operation = Equation.substring(firSps+1, SesSps);
		if(ce == 0) {
		    NumeratorOne = (nugget*DenomatorOne)+plop;
			}
			else if(ce == 1) {
			    NumeratorOne = (nugget*DenomatorOne)-plop;
			}
			else {
				System.out.println("Shutting Down!");
				return;
			}
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 6) { 
		nugget = Integer.parseInt(Equation.substring(0, firUnd));
		plop = Integer.parseInt(Equation.substring(firUnd+1, firDIV));
		NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1));
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = 1;
		Operation = Equation.substring(firSps+1, SesSps);
		if(ce == 0) {
		    NumeratorOne = (nugget*DenomatorOne)+plop;
			}
			else if(ce == 1) {
			    NumeratorOne = (nugget*DenomatorOne)-plop;
			}
			else {
				System.out.println("Shutting Down!");
				return;
			}
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 12) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 23) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 26) {
		nugget = Integer.parseInt(Equation.substring(0, firUnd));
		plop = Integer.parseInt(Equation.substring(firUnd+1, firDIV));
		NumeratorTwo = Integer.parseInt(Equation.substring(SesSps+1));
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = 1;
		if(ce == 0) {
		    NumeratorOne = (nugget*DenomatorOne)+plop;
			}
			else if(ce == 1) {
			    NumeratorOne = (nugget*DenomatorOne)-plop;
			}
			else {
				System.out.println("Shutting Down!");
				return;
			}
		Operation = Equation.substring(firSps+1, SesSps);	
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 28) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
	

}
else if(und == 2) {
//TWO
	    if(DIVs == 0) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 3) {
		nugget = Integer.parseInt(Equation.substring(0, firUnd));
		plop = Integer.parseInt(Equation.substring(firUnd+1, firDIV));
		nugget2 = Integer.parseInt(Equation.substring(SesSps+1, SesUnd));
	    plop2 = Integer.parseInt(Equation.substring(SesUnd+1, thrDIV));		
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = Integer.parseInt(Equation.substring(thrDIV+1));
		Operation = Equation.substring(firSps+1, SesSps);
		if(ce == 0) {
		    NumeratorOne = (nugget*DenomatorOne)+plop;
		    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
			}
			else if(ce == 1) {
			    NumeratorOne = (nugget*DenomatorOne)-plop;
			    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
			}
			else if(ce == 2) {
			    NumeratorOne = (nugget*DenomatorOne)+plop;
			    NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
			}
			else if(ce == 3) {
			    NumeratorOne = (nugget*DenomatorOne)-plop;
			    NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
			}
			else {
				System.out.println("Shutting Down!");
				return;
			}
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 4) {
		nugget = Integer.parseInt(Equation.substring(0, firUnd));
		plop = Integer.parseInt(Equation.substring(firUnd+1, firDIV));
		nugget2 = Integer.parseInt(Equation.substring(SesSps+1, SesUnd));
	    plop2 = Integer.parseInt(Equation.substring(SesUnd+1, SesDIV));		
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = Integer.parseInt(Equation.substring(SesDIV+1));
		Operation = Equation.substring(firSps+1, SesSps);
		if(ce == 0) {
		    NumeratorOne = (nugget*DenomatorOne)+plop;
		    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
			}
			else if(ce == 1) {
			    NumeratorOne = (nugget*DenomatorOne)-plop;
			    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
			}
			else if(ce == 2) {
			    NumeratorOne = (nugget*DenomatorOne)+plop;
			    NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
			}
			else if(ce == 3) {
			    NumeratorOne = (nugget*DenomatorOne)-plop;
			    NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
			}
			else {
				System.out.println("Shutting Down!");
				return;
			}
		
		//System.out.println("Num1:"+NumeratorOne);
		//System.out.println("Denom1:"+NumeratorTwo);
		//System.out.println("Num1:"+DenomatorOne);
		//System.out.println("Denom1:"+DenomatorTwo);
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 6) { 
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 12) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 23) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 26) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 28) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
}
else if(und == 22) {
//second
	
	if(DIVs == 0) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 3) {
		nugget = Integer.parseInt(Equation.substring(SesSps+1, firUnd));
		plop = Integer.parseInt(Equation.substring(firUnd+1, thrDIV));
		NumeratorOne = Integer.parseInt(Equation.substring(0, firDIV));;
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = Integer.parseInt(Equation.substring(thrDIV+1));
		Operation = Equation.substring(firSps+1, SesSps);
		if(ce == 0) {
		    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
			}	
			else if(ce == 2) {
			NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
			}
			else {
				System.out.println("Shutting Down!");
				return;
			}
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 4) {
		nugget2 = Integer.parseInt(Equation.substring(SesSps+1, firUnd));
	    plop2 = Integer.parseInt(Equation.substring(firUnd+1, SesDIV));
	    NumeratorOne = Integer.parseInt(Equation.substring(0, firDIV));
		DenomatorOne = Integer.parseInt(Equation.substring(firDIV+1, firSps));
		DenomatorTwo = Integer.parseInt(Equation.substring(SesDIV+1));
		Operation = Equation.substring(firSps+1, SesSps);
		if(ce == 0) {
		    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
			}	
			else if(ce == 2) {
			NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
			}
			else {
				System.out.println("Shutting Down!");
				return;
			}
		MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 6) { 
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 12) {
			nugget = Integer.parseInt(Equation.substring(SesSps+1, firUnd));
			plop = Integer.parseInt(Equation.substring(firUnd+1, SesDIV));
			NumeratorOne = Integer.parseInt(Equation.substring(0, firSps));
			DenomatorTwo = Integer.parseInt(Equation.substring(SesDIV+1));
			DenomatorOne = 1;
			if(ce == 0) {
			    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
				}	
				else if(ce == 2) {
				NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
				}
				else {
					System.out.println("Shutting Down!");
					return;
				}
			Operation = Equation.substring(firSps+1, SesSps);	
			MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		else if(DIVs == 23) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 26) {
		System.out.println("That Equation is a stick of butter it's so bad");	
		return;
		}
		else if(DIVs == 28) {
			nugget = Integer.parseInt(Equation.substring(SesSps+1, firUnd));
			plop = Integer.parseInt(Equation.substring(firUnd+1, firDIV));
			NumeratorOne = Integer.parseInt(Equation.substring(0, firSps));
			DenomatorTwo = Integer.parseInt(Equation.substring(firDIV+1));
			DenomatorOne = 1;
			if(ce == 0) {
			    NumeratorTwo = (nugget2*DenomatorTwo)+plop2;
				}	
				else if(ce == 2) {
				NumeratorTwo = (nugget2*DenomatorTwo)-plop2;
				}
				else {
					System.out.println("Shutting Down!");
					return;
				}
			Operation = Equation.substring(firSps+1, SesSps);	
			MUlTI(Equation, NumeratorOne, NumeratorTwo, DenomatorOne, DenomatorTwo, Operation);
		}
		}
		}

//MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT  MULIT MULIT MULIT MULIT MULIT MULIT MULIT MULIT 
public static void MUlTI(String Equation, int Num1, int Num2, int Deno1, int Deno2, String Opera) {
/*
System.out.println("Num1:"+Num1+":");
System.out.println("Deno1:"+Deno1+":");
System.out.println("Num2:"+Num2+":");
System.out.println("deno2:"+Deno2+":");
System.out.println("Operation:"+Opera+":");
*/
if(Opera.equals("+")) {
	//System.out.println("Num:"+Num1+": and Denom :"+Deno1+":");
	//System.out.println("Num2:"+Num2+": and Denom2 :"+Deno2+":");
	//ADD ADD ADD ADD ADD ADD ADD ADD ADD ADD ADD ADD ADD ADD 
	int NNum = (Num1*Deno2)+(Num2*Deno1);
	int NDeno = Deno1*Deno2;
	Sumpli(NNum, NDeno);
}
else if(Opera.equals("-")) {
	//Subtract  Subtract  Subtract  Subtract  Subtract  Subtract 
	int NNum = (Num1*Deno2)-(Num2*Deno1);
	int NDeno = Deno1*Deno2;
	Sumpli(NNum, NDeno);
}
else if(Opera.equals("*")) {
	//multiply multiply multiply multiply multiply multiply 
	int NNum = Num1*Num2;
	int NDeno = Deno1*Deno2;
	Sumpli(NNum, NDeno);
}
else if(Opera.equals("/")) {
	//Divide Divide Divide Divide Divide Divide Divide Divide 
	int NNum = Num1*Deno2;
	int NDeno = Deno1*Num2;
	Sumpli(NNum, NDeno);
}
}
//SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION SIMPLIFYCATION
public static void Sumpli(int nummerator, int denom) {
	
//System.out.println("Num:"+nummerator+": and Denom :"+denom+":");
   String finas = "";
   int count = 0;
   int po = 232;
   int a = nummerator;
   int b = denom;
   
     while(a!=0 && b!=0) // until either one of them is 0
     {
        int c = b;
        b = a%b;
        a = c;
     }
    // System.out.println("HERE 2!");
 	
     int gcf = a+b; // either one is 0, so return the non-zero value
    // System.out.println("gcf"+gcf);
     int newNum = nummerator/gcf;
     int newDenom = denom/gcf;
     //System.out.println("Num:"+newNum+": and Denom :"+newDenom+":");
    if((newNum-newDenom) == 0) {
         finas = "1";
         	System.out.println("Your answer is: "+finas);
    }
    else if((newNum-newDenom) != 0) {
    finas = newNum+"/"+newDenom;
    int wholer = 0;
    while(newNum > newDenom) {
    	newNum = newNum-newDenom;
    	wholer++;
    }
    int truck = 0;
    while(Math.abs(newNum) > newDenom) {
    	newNum = newNum+newDenom;
    	wholer--;
    	truck = 1;
    }
    if(truck == 1) {
    	newNum = Math.abs(newNum);
    }
    if(wholer > 0 || wholer < 0) {
    	if(newNum == newDenom) {
    		finas = wholer+"";
        	System.out.println("Your answer is: "+finas); 
    	}
    	else {
    	finas = wholer+"_"+newNum+"/"+newDenom;
    	System.out.println("Your answer is: "+finas); 
    	}
    	}
    else if(finas.equals("1/1")) {
    	finas = "1";
    System.out.println("Your answer is: "+finas); 
    }
    else if(finas.equals("0/1")){
    	System.out.println("Your answer is: 0"); 
    }
    else {
    	System.out.println("Your answer is: "+finas); 
    }
    }
    else {
    	System.out.println("Error Has occured");
    	return;
    	}
}
}