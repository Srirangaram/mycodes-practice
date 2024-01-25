package booking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookMySHowCollection {

    static Scanner in = new Scanner(System.in);

    static List<String> movieList = new ArrayList<>();
    static Set<Integer> selectedSeats = new HashSet<>();

    static {
        movieList.add("1)CAPTAIN MILLER");
        movieList.add("2)AYALAAN");
        movieList.add("3)LEO");
        movieList.add("4)ASURAN");
        movieList.add("5)VISARANAI");
    }

    public static void main(String[] args) {
        BookMySHowCollection bm = new BookMySHowCollection();
        bm.getYourName();

        System.out.println("Welcome TO Rocky Cinemas!");
    }

    public static void getYourName() {
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Welcome " + name);
        getMovieName();
    }

    public static void getMovieName() {
        System.out.println("Select Your Movie: ");
        for (String movie : movieList) {
            System.out.println(movie);
        }

        int choice = in.nextInt();
        System.out.println("Selected Movie To Watch: ");
        System.out.println(movieList.get(choice - 1).substring(2));
        getSeat();
    }

    public static void getSeat() {
        System.out.println("Number Of Seats You Want: ");
        int noOfSeats = in.nextInt();

        System.out.println("Choose Seat Number (1 to 100): ");
        for (int i = 0; i < noOfSeats; i++) {
            int seat = in.nextInt();
            selectedSeats.add(seat);
        }

        int amount = noOfSeats * 170; // one ticket cost
        System.out.println("Total Amount To Pay: " + amount);
        getPaymentMethod();
    }

    public static void getPaymentMethod() {
        System.out.println("Please Select Your Payment Method: ");
        int pay;
        do {
            System.out.println("1)GPAY");
            System.out.println("2)PHONEPAY");
            System.out.println("3)PAYTM");
            System.out.println("4)CASH");
            pay = in.nextInt();

            switch (pay) {
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

                default:
                    System.out.println("Invalid option. Please select again.");
            }
        } while (pay < 1 || pay > 4);

        makePayment();
    }

    public static void makePayment() {
        System.out.println("Enter the Amount: ");
        int amountPay = in.nextInt();

        int amount = selectedSeats.size() * 170;

        if (amountPay == amount) {
            System.out.println("Your Payment is Successfully Completed!");
            System.out.println("Your Seat(s) has been Successfully Booked!");
            System.out.println("Thank You for Choosing Rocky Cinemas...");
        } else {
            System.out.println("Enter Valid Amount");
            System.out.println("Payment failed, Please try Again!");
        }
    }
}

