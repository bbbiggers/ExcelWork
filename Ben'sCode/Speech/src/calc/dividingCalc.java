package calc;
import java.util.Scanner;

public class dividingCalc {
        //IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER IMPUT TESTER
        public static void imput(String Equation){
                Scanner Imput = new Scanner(System.in);
                System.out.println("Loading...");
                System.out.println("Loading..");
                System.out.println("Loading.");
                System.out.println("Loading..");
                System.out.println("Loading...");
                
                int firSps = Equation.indexOf(" ");
                int SesSps = Equation.indexOf(" ", firSps+1);
                int thrSps = Equation.indexOf(" ", SesSps+1);
                int frtSps = Equation.indexOf(" ", thrSps+1);
                int firUnd = Equation.indexOf("_");
                int SesUnd = Equation.indexOf("_", firUnd+1);
                int Div = Equation.indexOf("/");
                int Div2 = Equation.indexOf("/",Div+1);
                int Div3 = Equation.indexOf("/",Div2+1);
                int Div4 = Equation.indexOf("/",Div3+1);
                int Mult = Equation.indexOf("*");
                int Mult2 = Equation.indexOf("*",Mult+1);
                int Plus = Equation.indexOf("+");
                int Plus2 = Equation.indexOf("*",Plus+1);
                int Subs = Equation.indexOf("-");
                int Subs2 = Equation.indexOf("*",Subs+1);
                
                
                Finds(Equation);
                
                ///SPECIAL
                
                
                
                
                int pres1 = 0;
                int Num1 = 0;
                int Denom1 = 0;
                int Num2 = 0;
                int denom2 = 0;
                int pres2 = 0;
                int ting = 0;
                int secDiv = 0;
                
                //TINGER TINGER TINGER TINGER TINGER TINGER TINGER TINGER TINGER
                if(Div3 != -1) {
                        ting = Div2;
                } else if(Mult != -1) {
                        ting = Mult;
                } else if(Plus != -1) {
                        ting = Plus;
                } else if(Subs != -1) {
                        ting = Subs;
                }
                
                if(Div4 != -1 || Mult2 != -1 || Plus2 != -1 || Subs2 != -1) {
                
                /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
                if(firUnd > ting) {
                	SesUnd = firUnd;
                	firUnd = -1;
                }
                /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
                if(firUnd != -1 && SesUnd == -1) {
                        //FIRST UNDER SCORE
                	//System.out.println("FIRST UNDER SCORE");
                    pres1 = Integer.parseInt(Equation.substring(0, firUnd));
                    Num1 = Integer.parseInt(Equation.substring(firUnd+1, Div));
                    Denom1 = Integer.parseInt(Equation.substring(Div+1, ting));
                    if(Div3 != -1) {
                            secDiv = Div3;
                    }else if(Div3 == -1) {
                            secDiv = Div2;
                    }
                    Num2 = Integer.parseInt(Equation.substring(ting+1, secDiv));
                    denom2 = Integer.parseInt(Equation.substring(secDiv+1));
                    
                    int newNom1 = (pres1*Denom1)+Num1; 
                    int newNom2 = Num2;
                    
                  //  System.out.println("newNom1 :"+newNom1);
                   // System.out.println("newNom2 :"+newNom2);
                   // System.out.println("Denom1 :"+Denom1);
                    //System.out.println("denom2 :"+denom2);
                    
                    Equation = newNom1+"/"+Denom1+Equation.substring(ting, ting+1)+newNom2+"/"+denom2;
                    
                    //System.out.println("Equat:"+Equation);
                    ASMD(Equation);
                }
                else if(firUnd != -1 && SesUnd != -1) {
                        //TWO UNDER SCORES
                	//System.out.println("TWO UNDER SCPRES");
                        pres1 = Integer.parseInt(Equation.substring(0, firUnd));
                        Num1 = Integer.parseInt(Equation.substring(firUnd+1, Div));
                        Denom1 = Integer.parseInt(Equation.substring(Div+1, ting));
                        pres2 = Integer.parseInt(Equation.substring(ting+1, SesUnd));
                        if(Div3 != -1) {
                                secDiv = Div3;
                        }else if(Div3 == -1) {
                                secDiv = Div2;
                        }
                        Num2 = Integer.parseInt(Equation.substring(SesUnd+1, secDiv));
                        denom2 = Integer.parseInt(Equation.substring(secDiv+1));
                        
                        int newNom1 = (pres1*Denom1)+Num1; 
                        int newNom2 = (pres2*denom2)+Num2;
                        
                      //  System.out.println("newNom1 :"+newNom1);
                      //  System.out.println("newNom2 :"+newNom2);
                       // System.out.println("Denom1 :"+Denom1);
                      //  System.out.println("denom2 :"+denom2);
                        
                        Equation = newNom1+"/"+Denom1+Equation.substring(ting, ting+1)+newNom2+"/"+denom2;
                        
                     //   System.out.println("Equat:"+Equation);
                        ASMD(Equation);
                        
                }
                else if(SesUnd != -1 && firUnd == -1) {
                        //SECOND UNDER SCORE

                //	System.out.println("SECOND UNDER SCORE");
                    Num1 = Integer.parseInt(Equation.substring(0, Div));
                    Denom1 = Integer.parseInt(Equation.substring(Div+1, ting));
                    pres2 = Integer.parseInt(Equation.substring(ting+1, SesUnd));
                    if(Div3 != -1) {
                            secDiv = Div3;
                    }else if(Div3 == -1) {
                            secDiv = Div2;
                    }
                    Num2 = Integer.parseInt(Equation.substring(SesUnd+1, secDiv));
                    denom2 = Integer.parseInt(Equation.substring(secDiv+1));
                    
                    int newNom1 = Num1; 
                    int newNom2 = (pres2*denom2)+Num2;
                    
                 //   System.out.println("newNom1 :"+newNom1);
                  //  System.out.println("newNom2 :"+newNom2);
                  //  System.out.println("Denom1 :"+Denom1);
                   // System.out.println("denom2 :"+denom2);
                    
                    Equation = newNom1+"/"+Denom1+Equation.substring(ting, ting+1)+newNom2+"/"+denom2;
                    
                   // System.out.println("Equat:"+Equation);
                    ASMD(Equation);
   
                }
                else {
                	
                	//System.out.println("NO UNDER SCORE");
                        //NO UNDER SCORE
                        ASMD(Equation);
            
                }

               // System.out.println("firUnder: " +firUnd);
                //System.out.println("Ses:" +SesUnd);
               // System.out.println("Div:" +Div);
               // System.out.println("Div2:" +Div2);
                //System.out.println("Div3:" +Div3);
                String leg = "TestDuck";
               // System.out.println("Length: "+leg.length());
                }
                //EXTRA EXTRA!!!!!!!!!!!!!
                else {
                	Spes(Equation);
                	
                	
                }
                
                
                
        }
        
        //ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD ASMD v
        public static void ASMD(String Equation) {
             
                int Div = Equation.indexOf("/");
                int Div2 = Equation.indexOf("/",Div+1);
                int Div3 = Equation.indexOf("/",Div2+1);
                int Mult = Equation.indexOf("*");
                int Plus = Equation.indexOf("+");
                int Subs = Equation.indexOf("-");
                
                int Num1 = 999;
                int Denom1 = 999;
                int Num2 = 999;
                int denom2 = 999;
                int Numm = 999;
                int deno = 999;
                //Dividing 
                                if(Div3 != -1) {
                                        Num1 = Integer.parseInt(Equation.substring(0, Div));
                                        Denom1 = Integer.parseInt(Equation.substring(Div+1, Div2));
                                        Num2 = Integer.parseInt(Equation.substring(Div2+1, Div3));
                                        denom2 = Integer.parseInt(Equation.substring(Div3+1));
                                        //Dividing Fractions
                                        
                                        Numm = Num1*denom2;
                                        deno = Denom1*Num2;
                                        Sumpli(Numm, deno);
                                }
                                //Multiplying
                                else if(Mult != -1) {
                                        Num1 = Integer.parseInt(Equation.substring(0, Div));
                                        Denom1 = Integer.parseInt(Equation.substring(Div+1, Mult));
                                        Num2 = Integer.parseInt(Equation.substring(Mult+1, Div2));
                                        denom2 = Integer.parseInt(Equation.substring(Div2+1));
                                        //Multiplying \/\/\/\/\/\/
                                        
                                        Numm = Num1*Num2;
                                        deno = Denom1*denom2;
                                        Sumpli(Numm, deno);
                                        
                                }
                                //adding
                                else if(Plus != -1) {
                                        Num1 = Integer.parseInt(Equation.substring(0, Div));
                                        Denom1 = Integer.parseInt(Equation.substring(Div+1, Plus));
                                        Num2 = Integer.parseInt(Equation.substring(Plus+1, Div2));
                                        denom2 = Integer.parseInt(Equation.substring(Div2+1));
                                        if(Denom1 == denom2) {
                                                Numm = Num1+Num2;
                                                deno = Denom1;
                                                Sumpli(Numm, deno);
                                        }
                                        else {
                                                Numm = (Num1*denom2)+(Num2*Denom1);
                                                deno = Denom1*denom2;
                                                Sumpli(Numm, deno);
                                        }
                                        
                                }
                                //subtracting
                                else if(Subs != -1) {
                                        Num1 = Integer.parseInt(Equation.substring(0, Div));
                                        Denom1 = Integer.parseInt(Equation.substring(Div+1, Subs));
                                        Num2 = Integer.parseInt(Equation.substring(Subs+1, Div2));
                                        denom2 = Integer.parseInt(Equation.substring(Div2+1));
                                        if(Denom1 == denom2) {
                                            Numm = Num1-Num2;
                                            deno = Denom1;
                                            Sumpli(Numm, deno);
                                    }
                                    else {
                                            Numm = (Num1*denom2)-(Num2*Denom1);
                                            deno = Denom1*denom2;
                                            Sumpli(Numm, deno);
                                    }
                                        
                                }
                
                                
        }
        
        
        
        
        
        //MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN v
public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
        String quits = "good";
        
        while(quits.equals("good")) {

       System.out.println("What is your Equation?");
       System.out.println("Spaces Between the Operation!\n(EX:23 + 2/2)");
        String Equation = Imput.nextLine();
        if(Equation.equals("quit")) {
                quits = "quit";
        }
        
        else {
                imput(Equation);
        }}

}

// SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION SIMPLIFICATION
public static void Sumpli(int nummerator, int denom) {
//System.out.println("number Nummerator:"+nummerator);
   // System.out.println("number denomitnator:"+denom);
    String finas = "";
    int count = 0;
    int po = 232;
    int a = nummerator;
    int b = denom;
    
      while(a!=0 && b!=0) // until either one of them is 0
      {
    	 // System.out.println("numer: "+a);
    	  //System.out.println("denoms: "+b);
         int c = b;
         b = a%b;
         a = c;
      }
    
      int gcf = a+b; // either one is 0, so return the non-zero value
      //System.out.println("GCD: "+gcf);
      int newNum = nummerator/gcf;
      int newDenom = denom/gcf;
      //System.out.println("newNum: "+newNum);
      //System.out.println("newdenom: "+newDenom);
     if((newNum-newDenom) == 0) {
          finas = newNum+"/"+newDenom;
          System.out.println("Your answer is: "+finas);
     }
     else if((newNum-newDenom) != 0) {
    	 
    	 int chex = newNum;
    	 int ched = newDenom;
    	 while(po != 0) {
    		 chex = chex-ched;
    		 count = count+1;
    				 if(chex < ched) {
    					 po = 0;
    				 }
    	 if(chex == 0) {
    		 finas = count+"";
        	
    	 }
    	 else if(chex != 0) {
    		 finas = count+"_"+chex+"/"+ched;
        	 
    	 }
    	 
    	 }
    	 System.out.println("Your answer is: "+finas); 
     }
      
     
     
}
//EXTRA CRED EXTRA CRED EXTRA CRED EXTRA CRED EXTRA CRED EXTRA CRED EXTRA CRED EXTRA CRED EXTRA CRED EXTRA CRED
public static void Spes(String Equation) {
	System.out.println("DUCK SHot");
	
	
	
	
}
//FINDER FINDEr
public static void Finds(String Equation) {
	
	
	int firSps = Equation.indexOf("_");
    int SesSps = Equation.indexOf("_", firSps+1);
    int thrSps = Equation.indexOf("_", SesSps+1);
    int frtSps = Equation.indexOf("_", thrSps+1);
    int firUnd = Equation.indexOf("_");
    int SesUnd = Equation.indexOf("_", firUnd+1);
    int Div = Equation.indexOf("/");
    int Div2 = Equation.indexOf("/",Div+1);
    int Div3 = Equation.indexOf("/",Div2+1);
    int Div4 = Equation.indexOf("/",Div3+1);
    int Mult = Equation.indexOf("*");
    int Mult2 = Equation.indexOf("*",Mult+1);
    int Plus = Equation.indexOf("+");
    int Plus2 = Equation.indexOf("*",Plus+1);
    int Subs = Equation.indexOf("-");
    int Subs2 = Equation.indexOf("*",Subs+1);
    
    int pres1 = 0;
    int Num1 = 0;
    int Denom1 = 0;
    int Num2 = 0;
    int denom2 = 0;
    int pres2 = 0;
    int ting = 0;
    int secDiv = 0;
    
    //TINGER TINGER TINGER TINGER TINGER TINGER TINGER TINGER TINGER
    if(Div3 != -1) {
            ting = Div2;
    } else if(Mult != -1) {
            ting = Mult;
    } else if(Plus != -1) {
            ting = Plus;
    } else if(Subs != -1) {
            ting = Subs;
    }
    
    if(Div4 != -1 || Mult2 != -1 || Plus2 != -1 || Subs2 != -1) {
    
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    if(firUnd > ting) {
    	SesUnd = firUnd;
    	firUnd = -1;
    }
    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
    if(firUnd != -1 && SesUnd == -1) {
            //FIRST UNDER SCORE
    	//System.out.println("FIRST UNDER SCORE");
        pres1 = Integer.parseInt(Equation.substring(0, firUnd));
        Num1 = Integer.parseInt(Equation.substring(firUnd+1, Div));
        Denom1 = Integer.parseInt(Equation.substring(Div+1, ting));
        if(Div3 != -1) {
                secDiv = Div3;
        }else if(Div3 == -1) {
                secDiv = Div2;
        }
        Num2 = Integer.parseInt(Equation.substring(ting+1, secDiv));
        denom2 = Integer.parseInt(Equation.substring(secDiv+1));
        
        int newNom1 = (pres1*Denom1)+Num1; 
        int newNom2 = Num2;
        
      //  System.out.println("newNom1 :"+newNom1);
       // System.out.println("newNom2 :"+newNom2);
       // System.out.println("Denom1 :"+Denom1);
        //System.out.println("denom2 :"+denom2);
        
        Equation = newNom1+"/"+Denom1+Equation.substring(ting, ting+1)+newNom2+"/"+denom2;
        
        //System.out.println("Equat:"+Equation);
        ASMD(Equation);
    }
    else if(firUnd != -1 && SesUnd != -1) {
            //TWO UNDER SCORES
    	//System.out.println("TWO UNDER SCPRES");
            pres1 = Integer.parseInt(Equation.substring(0, firUnd));
            Num1 = Integer.parseInt(Equation.substring(firUnd+1, Div));
            Denom1 = Integer.parseInt(Equation.substring(Div+1, ting));
            pres2 = Integer.parseInt(Equation.substring(ting+1, SesUnd));
            if(Div3 != -1) {
                    secDiv = Div3;
            }else if(Div3 == -1) {
                    secDiv = Div2;
            }
            Num2 = Integer.parseInt(Equation.substring(SesUnd+1, secDiv));
            denom2 = Integer.parseInt(Equation.substring(secDiv+1));
            
            int newNom1 = (pres1*Denom1)+Num1; 
            int newNom2 = (pres2*denom2)+Num2;
            
          //  System.out.println("newNom1 :"+newNom1);
          //  System.out.println("newNom2 :"+newNom2);
           // System.out.println("Denom1 :"+Denom1);
          //  System.out.println("denom2 :"+denom2);
            
            Equation = newNom1+"/"+Denom1+Equation.substring(ting, ting+1)+newNom2+"/"+denom2;
            
         //   System.out.println("Equat:"+Equation);
            ASMD(Equation);
            
    }
    else if(SesUnd != -1 && firUnd == -1) {
            //SECOND UNDER SCORE

    //	System.out.println("SECOND UNDER SCORE");
        Num1 = Integer.parseInt(Equation.substring(0, Div));
        Denom1 = Integer.parseInt(Equation.substring(Div+1, ting));
        pres2 = Integer.parseInt(Equation.substring(ting+1, SesUnd));
        if(Div3 != -1) {
                secDiv = Div3;
        }else if(Div3 == -1) {
                secDiv = Div2;
        }
        Num2 = Integer.parseInt(Equation.substring(SesUnd+1, secDiv));
        denom2 = Integer.parseInt(Equation.substring(secDiv+1));
        
        int newNom1 = Num1; 
        int newNom2 = (pres2*denom2)+Num2;
        
     //   System.out.println("newNom1 :"+newNom1);
      //  System.out.println("newNom2 :"+newNom2);
      //  System.out.println("Denom1 :"+Denom1);
       // System.out.println("denom2 :"+denom2);
        
        Equation = newNom1+"/"+Denom1+Equation.substring(ting, ting+1)+newNom2+"/"+denom2;
        
       // System.out.println("Equat:"+Equation);
        ASMD(Equation);

    }
    else {
    	
    	//System.out.println("NO UNDER SCORE");
            //NO UNDER SCORE
            ASMD(Equation);

    }

   // System.out.println("firUnder: " +firUnd);
    //System.out.println("Ses:" +SesUnd);
   // System.out.println("Div:" +Div);
   // System.out.println("Div2:" +Div2);
    //System.out.println("Div3:" +Div3);
    String leg = "TestDuck";
   // System.out.println("Length: "+leg.length());
    }
    //EXTRA EXTRA!!!!!!!!!!!!!
    else {
    	Spes(Equation);
    	
    	
    }
	
	///ENDERS
	
	
	
}



}





