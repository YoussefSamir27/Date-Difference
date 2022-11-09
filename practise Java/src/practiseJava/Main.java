package practiseJava;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		double y1=0, y2=0, m1=0, m2=0, d1=0, d2=0;
		String dash;
		
		
		System.out.println("*******( Enter Date Format as Day Month Year )********");
		
		System.out.print("Enter First Date : ");
		d1 = input.nextDouble();
		m1 = input.nextDouble();
		y1 = input.nextDouble();

		System.out.print("Enter Second Date : ");
		d2 = input.nextDouble();
		m2 = input.nextDouble();
		y2 = input.nextDouble();
		
		dateDifference.calculateDateDifference(d1, m1, y1, d2, m2, y2);
		
		
		

	}

}
