import java.util.Scanner;

 class DuckNum 
	 {

    public static void main(String args[])
       {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter  a number : ");
        String str = s.nextLine();
 
        int a = str.length();  
        int b = 0;  
        char c;
 
        for(int i=1;i<a;i++)
        {
            c = str.charAt(i); 
            if(c =='0')
                b++;
        }
 
        char d = str.charAt(0); 
 
        if(b>0 && d!='0')
            System.out.println("Duck number");
        else
            System.out.println("Not a duck number");
	   }
 }
