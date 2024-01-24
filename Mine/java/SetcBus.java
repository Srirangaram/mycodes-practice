package booking;

import java.util.Scanner;

public class SetcBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetcBus sb = new SetcBus();
		sb.getYourName();
		
		System.out.println("Welcome TO SETC Bus Service!");
		
		
	}
	
	static Scanner in = new Scanner(System.in);
	
	static String[] travelTime = {"1)DAY-TIME", "2)NIGHT-TIME"};
	
	public static void getYourName() {
		
		
		System.out.println("Enter your name: ");
		
		String name = in.nextLine();
		
		System.out.println("Welcome "+name);
		
		getMovieName();
		
	}
	
	public static void getMovieName() {
		
		System.out.println("Select Your Timing: ");
		
		for(int i=0; i < travelTime.length; i++) {
			System.out.println(travelTime[i]);
		}
		
		int choice = in.nextInt();
		
		System.out.println("Selected Timing to Travel: ");
		
		System.out.println(travelTime[choice - 1].toString().substring(2));
		
		getSeat();
	}
	
	public static void getSeat() {
		
		System.out.println("Number Of Seats You Want: ");
		
		int noOfSeats = in.nextInt();
		
		int[] arr = new int[noOfSeats];
		
		System.out.println("Choose Seat Number: ");
		
		for(int i=0; i<noOfSeats; i++) {
			arr[i] = in.nextInt();
		}
		
		int amount = noOfSeats*200;    //one ticket cost
		
		System.out.println("Total Amount To Pay: "+amount);
		
		System.out.println("Please Select Your Payment Method: ");
		
		int payment = 1;
		
		while(payment == 1) {
			System.out.println("1)GPAY");
			System.out.println("2)PHONEPAY");
			System.out.println("3)PAYTM");
			System.out.println("4)CASH");
			
			int pay = in.nextInt();
			
			switch(pay) {
				case 1:
				System.out.println("Payment through GPAY");
				break;
				
				case 2:
				System.out.println("Payment through PHONEPAY");
				break;
				
				case 3:
				System.out.println("Payment through PAYTM");
				break;
				
				case 4:
				System.out.println("Payment through CASH");
				break;
			}
			
			break;
		}
		
		System.out.println("Enter the Amount: ");
		
		int amountPay = in.nextInt();
		
		if(amountPay == amount) {
			System.out.println("Your Payment is Successfully Completed!");
			System.out.println("Your Seat has been Successfully Booked!");
			System.out.println("Thank You for Choosing SETC Bus Service...");
		}else {
			System.out.println("Enter Valid Amount");
			System.out.println("Payment failed, Please try Again!");
		}
	}

}
