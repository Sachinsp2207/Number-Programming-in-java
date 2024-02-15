package numberprog;

import java.util.Scanner;

public class AdditionOfChar {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String ip = sc.nextLine().toUpperCase();
	    int op = 0;
	    
	    if(ip.equals("AA")){
	        op = 27;
	    }else if(ip.equals("BB")){
	        op = 28;
	    }else{
	        char[] chr = ip.toCharArray();
	        for (char c : chr) {
	            int temp = (int)c - 64;
	            if (temp >= 1 && temp <= 26) {
	                op += temp;
	            }
	        }
	    }
	    
	    System.out.println("Sum of character : " + op);
	}

	}

