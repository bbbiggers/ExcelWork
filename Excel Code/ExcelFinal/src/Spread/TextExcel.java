package Spread;

import java.util.Scanner;

public class TextExcel {
	

	public static void main(String[] args) {
		String[][] Sheet = new String[10][7];
	
		Scanner Imput = new Scanner(System.in);
		Spreadsheet Shet = new Spreadsheet(Sheet);
		Shet.clearall();
		String Exit = "NO"; 
		while(!Exit.equals("exit")){
		System.out.println("enter a command:");
		Exit = Imput.nextLine();
		//System.out.println(Exit.substring(0, 5));
		if(Exit.equals("print")||Exit.equals("Print")) {
			Shet.printSheet();
		}
		else if(Exit.equals("clear all")||Exit.equals("Clear All")||Exit.equals("Clear all")||Exit.equals("clear All")) {
			Shet.clearall();
		}
		else if(Exit.equals("help")||Exit.equals("Help")) {
			
		}
		else if(Exit.length() > 5){
			if((Exit.substring(0, 5)).equals("clear") || (Exit.substring(0, 5)).equals("Clear")) {
			String A = Exit.substring(6, 7);
			String B = Exit.substring(7);
			int a = 0;
			int b = Integer.parseInt(B);
			a = Shet.AtoB(A);
			if(b < 11 && a < 8 && a > 0 && b > 0) {
			Shet.clear(a, b);
			}
			else {
				System.out.println("Not a valid point!");
			}
			}
			else {
				System.out.println("That is Bad.");
			}
		}
		/*
		else if(Exit.length() < 8){
			
				String A = Exit.substring(5, 6);
				String B = Exit.substring(6);
				String Data = Exit.substring(7);
				int a = 0;
				int b = Integer.parseInt(B);
				a = Shet.AtoB(A);
				if(b < 11 && a < 8 && a > 0 && b > 0) {
				Shet.add(a, b, Data);
				}
				else {
					System.out.println("Not a valid point!");
				}
		}
		*/
		else if(Exit.equals("Exit") || Exit.equals("Exit")) {
			Exit = "exit";
		}
		else {
			//System.out.println("That is Bad.");
		}
		
		}
		}
	}
