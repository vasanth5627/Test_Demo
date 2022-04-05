package PreCourse;
import java.util.Scanner;

public class Greatestofthree {
          public static void main(String[] args) {
        	  Scanner sc = new Scanner(System.in);
        	  int a,b,c;
        	  int i=0;
        		  System.out.println("Enter three distinct values");
        		  do {
        			  if(i>=1) {
        				 System.out.println("You have not entered distinct values!!");
        				 System.out.println("Please enter distinct values");
        			  }
        			  a=sc.nextInt();
            		  b=sc.nextInt();
            		  c=sc.nextInt();
            		  i++;
        		  }while(a==b || a==c || b==c);
        		  
        		 if(a>b) {
        			    if(c>a) {
        			    	System.out.println(c+ " is greatest");
        			    }
        			    else {
        			    	System.out.println(a+ " is greatest");
        			    }
        		 }
        		 else {
        			 if(c>b) {
        				 System.out.println(c+ " is greatest");
        			 }
        			 else {
        				 System.out.println(b+ " is greatest");
        			 }
        		 }
        
          }
}
