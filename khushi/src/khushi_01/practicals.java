package khushi_01;
  
import java.util.Scanner;
public class class04 {
	int a,b,c;

	public static void main(String[] args) {
		class04 o1=new class04();
		Scanner sc=new Scanner (System.in);
		 System.out.println("\n Enter number 1: " );
		 o1.a=sc.nextInt();
		 System.out.println("\n Enter number 2: " );
		o1. b=sc.nextInt();
		 
		 o1.c=o1.a+o1.b;
		 System.out.println(o1.a+"+"+o1.b+"="+o1.c);
		 
		
	}

}
