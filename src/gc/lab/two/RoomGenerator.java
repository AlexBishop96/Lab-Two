package gc.lab.two;

import java.util.Scanner;

public class RoomGenerator { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		double roomLength;
		double roomWidth;
		double roomArea;
		double roomPerimeter;
		char userReturns = 'y';
		
		
		while (userReturns == 'y') {
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		System.out.print("Enter Length: ");
		roomLength = scan.nextDouble();
		
		System.out.print("Enter Width: ");
		roomWidth = scan.nextDouble();
		
		roomArea = (roomLength * roomWidth);
		roomPerimeter = ((roomLength + roomWidth) * 2);
		
		System.out.println("Room Area : " + roomArea);
		System.out.println("Room Perimeter : " + roomPerimeter);
		
		System.out.println("Do you want to measure another room? (y/n): ");
		userReturns = scan.next().charAt(0);
		
		
		
		   }
		System.exit(0);
		
		scan.close();
		}
		
	}
