package com.example.demo;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MPractice mp = new MPractice();
		//mp.firstPrime();
		//mp.primeNumber();
		//mp.fibonacciNumber();
		//mp.fibonacciWhile();
		//mp.descendingNumber();
		//mp.ascendingNumber();
		//mp.secondMinimum();
		//mp.Smallfact();
		//mp.bigfact();            //this doesn't work properly
		//System.out.println("Factorial of 5 is : "+factorial(5));     //factorial using recursion
		//mp.factorialWithoutUsingRecursion();
		//mp.compareThreeNumbers();
		//mp.reverseNumber();
		//mp.reverseString();
		//mp.duplicateNumber();
		//mp.uniqueNumber();
		//mp.maxNumber();
		//mp.minNumber();
		//mp.searchArray();
		//mp.repeatedChar();
		//mp.repeatedCharUsingHashMap();
		//mp.uniqueCharactersString();
		//mp.uniqueCharactersWIthoutUsingSet();
		//mp.printOnlySpecialCharacters();
		//mp.leapYear();
		//mp.countDigits();
		//mp.countZeros();
		//mp.numberFromEmail();
		//mp.stringFromEmail();
		mp.specialCharFromEmail();
	}
	
	public void firstPrime() {
			
			int n;
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your prime number: ");
			n = in.nextInt();
			System.out.println("Your Giver Number is "+n);
			
			int count = 0;
			for(int i=1;i<=n;i++){
				if(n%i == 0) {
					count++;
				}
			}
			System.out.println(count);
			if(count == 2) {
				System.out.println("Number "+n+" is a prime number");
			}else {
				System.out.println("Number "+n+" is not a prime number");
			}
	}
	
	
	
	public void primeNumber() {
		
		int n, status = 1, num = 3;
		
		System.out.println("Enter the numbers of prime numbers you want: ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		
		if(n >= 1) {
			System.out.println("First "+ n +" prime numbers are: ");
			System.out.println(2);
		}
		
		for(int count = 2; count <= n; ) {
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num%j == 0) {
					status = 0;
					break;
				}
			}
			if(status != 0) {
				System.out.println(num);
				count++;
			}
			
			status=1;
			num++;
		}
	}
	
	public void fibonacciNumber() {
		
		int n, num1 = 0, num2 = 1;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the numbers of fibonacci numbers you want: ");
		n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			System.out.println(num1 +" ");
		}
	}
	
	public void fibonacciWhile() {
		
		int n, num1 = 0, num2 = 1, num3 = num1 + num2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers of fibonacci numbers you want: ");
		n = in.nextInt();
		
		
		
		while(num3 <= n) {
			
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			
			
			System.out.println(num3 + " ");
			
		}
		
	}
	
	public void descendingNumber() {
		
		int[] ar= {11,8,107,13};
		int temp=0;
		
		for(int i=0; i<ar.length; i++) {
			
			for(int j=i;j<ar.length; j++) {
				
				if(ar[i]<ar[j]) //5<5 5<8 5<11
					{
					
						temp=ar[i];  //temp=5
						ar[i]=ar[j];  //ar[0]=8
						ar[j]=temp;  //ar[1]=5
					}
			}
			System.out.print(ar[i]+" ");
		}
	
	}
	
	public void ascendingNumber() {
		
		int[] ar= {1,171,50,88};
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i;j<ar.length;j++) {
				
				if(ar[i]>ar[j]) //5<5 5<8 5<11
					{
					
						temp=ar[i];  //temp=5
						ar[i]=ar[j];  //ar[0]=8
						ar[j]=temp;  //ar[1]=5
					}
			}
			System.out.print(ar[i] + " ");
		}
	
	}
	
	public void secondMinimum() {
			
			int[] marks= {60,80,50,40,55};
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			
			int min=2147483647,secondmin=2147483646;  //comparison target values
			
			for(int i=0;i<marks.length;i++) {
				if(marks[i]<min) //60<2147483647  --80<60  --50<60
				{
					secondmin=min;  //smin=2147483647
					min=marks[i];  //min=60
				}
				else if(marks[i]<secondmin) //60<2147483646  --80<2147483646
				{
					secondmin=marks[i];  //smin=60 smin=80
				}
			}
			System.out.println(min);
			System.out.println(secondmin);
			
		}
	
	public void Smallfact() {
		int n,c, fact = 1;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an Integer: ");
		n = in.nextInt();
		
		if(n < 0) {
			System.out.println("Number should be non-negative.");
		}else {
			for(c = 1; c <= n; c++) {
				fact = fact * c;
			}
			System.out.println("Factorial of "+n+ " is= "+fact);
		}
	}
	
	public void bigfact() {     //This doesn't work properly.
		int n, c;
		
		Scanner in = new Scanner(System.in);
		
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		
		System.out.println("Enter an Integer: ");
		n = in.nextInt();
		
		for(c = 1; c >= n; c++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		System.out.println(n + " ! = "+fact);
	}
	
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return(n * factorial(n - 1));
		}
	}
	
	public void factorialWithoutUsingRecursion() {
		
		Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        // Calculate and display the factorial
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
	}
	
	 static long calculateFactorial(int num) {
	        if (num < 0) {
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
	        }

	        long result = 1;

	        // Calculate factorial using a loop
	        for (int i = 2; i <= num; i++) {
	            result *= i;
	        }

	        return result;
	    }
	
	public void compareThreeNumbers() {
		
		int x, y, z;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		x = in.nextInt();
		System.out.println("Enter the second number: ");
		y = in.nextInt();
		System.out.println("Enter the third number: ");
		z = in.nextInt();
		
		if(x > y && x > z) {
			System.out.println("First Number is Largest");
		}else if(y > x && y > z) {
			System.out.println("Second Number is Largest");
		}else if(z > x && z > y) {
			System.out.println("Third Number is Largest");
		}else {
			System.out.println("Entered Numbers are distinct");
		}
	
	}
	
	public void reverseNumber() {
		int n, reverse = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to reverse: ");
		n = in.nextInt();
		
		while(n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		System.out.println("Reverse the entered number is "+reverse);
	}
	
	public void reverseString() {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse: ");
		original = in.nextLine();
		
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i--) {
			reverse = reverse+original.charAt(i);
			
			System.out.println("Reverse of entered string is: "+reverse);
		}
	}
	
	public void duplicateNumber() {
		
			
		Scanner in = new Scanner(System.in);
		
		// Get the size of the array from the user
		System.out.println("Enter the size of an array: ");
		
		int size = in.nextInt();
		
		// Create an array of the specified size
		int[] arr = new int[size];
		

        // Get each element of the array from the user
		for(int i = 0; i < size; i++) {
			System.out.println("Enter elment "+(i+1)+": ");
			arr[i] = in.nextInt();
		}
		
		//Initialize array  
        //int[] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
	}
	
	public void uniqueNumber() {
		
		Scanner in = new Scanner(System.in);
		
		// Get the size of the array from the user
		System.out.println("Enter the size of an array: ");
		
		int size = in.nextInt();
		
		// Create an array of the specified size
		int[] arr = new int[size];
		

        // Get each element of the array from the user
		for(int i = 0; i < size; i++) {
			System.out.println("Enter elment "+(i+1)+": ");
			arr[i] = in.nextInt();
		}
		
		Map<Integer, Integer> numberCountMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : arr) {
            numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) + 1);
        }

        // Print unique numbers
        System.out.println("Unique Numbers:");
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
		
	}
	
	public void maxNumber() {
		
				Scanner in = new Scanner(System.in);
		
				// Get the size of the array from the user
				System.out.println("Enter the size of an array: ");
				
				int size = in.nextInt();
				
				// Create an array of the specified size
				int[] arr = new int[size];
				

		        // Get each element of the array from the user
				for(int i = 0; i < size; i++) {
					System.out.println("Enter elment "+(i+1)+": ");
					arr[i] = in.nextInt();
				}
				
				
		        
		     // Check if the array is not empty
		        if (arr == null || arr.length == 0) {
		            throw new IllegalArgumentException("Array is empty or null");
		        }

		        // Initialize the maximum number with the first element
		        int maxNumber = arr[0];

		        // Iterate through the array to find the maximum number
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > maxNumber) {
		                maxNumber = arr[i];
		            }
		        }

		     // Display the result
		        System.out.println("Maximum Number: " + maxNumber);
		    
		}
	
	public void minNumber() {
		
		Scanner in = new Scanner(System.in);
		
		// Get the size of the array from the user
		System.out.println("Enter the size of an array: ");
		
		int size = in.nextInt();
		
		// Create an array of the specified size
		int[] arr = new int[size];
		

        // Get each element of the array from the user
		for(int i = 0; i < size; i++) {
			System.out.println("Enter elment "+(i+1)+": ");
			arr[i] = in.nextInt();
		}
		
		// Check if the array is not empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Initialize the maximum number with the first element
        int minNumber = arr[0];

        // Iterate through the array to find the maximum number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }

        // Display the result
        System.out.println("Minimum Number: " + minNumber);
	}
	
	public void searchArray() {
		
		 	Scanner in = new Scanner(System.in);

	        // Get the size of the array from the user
	        System.out.println("Enter the size of the sorted array: ");
	        int size = in.nextInt();

	        // Create a sorted array of the specified size
	        int[] arr = new int[size];

	        // Get each element of the array from the user
	        System.out.println("Enter the sorted elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = in.nextInt();
	        }

	        // Number to search for
	        System.out.println("Enter the element to search for: ");
	        int target = in.nextInt();

	        // Perform the search
	        int index = binarySearch(arr, target);

	        // Display the result
	        if (index != -1) {
	            System.out.println(target + " found at index: " + index);
	        } else {
	            System.out.println(target + " not found in the array.");
	        }
	    }

	    static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid;  // Target found, return the index
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1;  // Target not found in the array
	    
	}

	public void repeatedChar() {
		
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Enter your string: ");
		
		// Read the entered string
        String userInput = in.nextLine();

        // Display the entered string
        System.out.println("You entered: " + userInput);

        // Close the scanner to release resources (optional, but good practice)
        in.close();
		
		//String inputString = "malayalam";
		
		char[] charArray = userInput.toCharArray();

	     System.out.println("Repeated characters in the string:");

	        for (int i = 0; i < charArray.length; i++) {
	            // Check if the character is not processed before
	            if (charArray[i] != '\0') {
	                int count = 1;

	                // Compare the current character with the rest of the array
	                for (int j = i + 1; j < charArray.length; j++) {
	                    if (charArray[i] == charArray[j]) {
	                        count++;
	                        // Mark the repeated character as processed
	                        charArray[j] = '\0';
	                    }
	                }

	                // Display the repeated character and its count
	                if (count > 1) {
	                    System.out.println(charArray[i] + " - " + count + " times");
	                }
	            }
	        }
	    
	        
		}
	
		public void repeatedCharUsingHashMap() {
			
			 String inputString = "srirangaram";
			 
		        Map<Character, Integer> charFrequencyMap = findRepeatedCharacters(inputString);

		        System.out.println("Repeated characters in the string:");
		        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
		            }
		        }
		        
		        	
		}
		
		static Map<Character, Integer> findRepeatedCharacters(String str) {
            Map<Character, Integer> charFrequencyMap = new HashMap<>();

            // Convert the string to char array for easy iteration
            char[] charArray = str.toCharArray();

            // Count the frequency of each character
            for (char ch : charArray) {
                charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
            }

            return charFrequencyMap;
        }

	        
		
	    public void uniqueCharactersString() {
	    	
	    	 String inputString = "srirangaram";
	         Set<Character> uniqueCharacters = findUniqueCharacters(inputString);

	         System.out.println("Unique characters in the string:");
	         for (char ch : uniqueCharacters) {
	             System.out.print(ch + " ");
	         }
	    	
	    }
	    
	    static Set<Character> findUniqueCharacters(String str) {
	        Set<Character> uniqueCharacters = new HashSet<>();
	        
	        for (char ch : str.toCharArray()) {
	            if (Character.isLetterOrDigit(ch)) {
	                uniqueCharacters.add(ch);
	            }
	        }

	        return uniqueCharacters;
	    }
	    
	    
	    public void uniqueCharactersWIthoutUsingSet() {
	    	
	    	String inputString1 = "srirangaram";
	        char[] uniqueCharacters = findUniqueCharacters1(inputString1);

	        System.out.println("Unique characters in the string:");
	        for (char ch : uniqueCharacters) {
	            if (ch != '\0') {
	                System.out.print(ch + " ");
	            }
	        }
	    }
	    
	    static char[] findUniqueCharacters1(String str) {
	        char[] uniqueCharacters = new char[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);

	            if (isUnique(uniqueCharacters, currentChar)) {
	                uniqueCharacters[i] = currentChar;
	            }
	        }

	        return uniqueCharacters;
	    }

	    static boolean isUnique(char[] uniqueCharacters, char ch) {
	        for (char currentChar : uniqueCharacters) {
	            if (currentChar == ch) {
	                return false;  // Character already encountered, not unique
	            }
	        }
	        return true;  // Character is unique
	    }
	    
	    public void printOnlySpecialCharacters() {
	    	
	    	String inputString = "Hello! How are you? 123 #$%";
	        printSpecialCharacters(inputString);
	    }
	    
	    static void printSpecialCharacters(String str) {
	        System.out.println("Special characters in the string:");

	        for (char ch : str.toCharArray()) {
	            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
	                System.out.print(ch + " ");
	            }
	        }
	        
	    }
	    
	    
	    public void leapYear() {
	    	
	    	Scanner scanner = new Scanner(System.in);

	        // Get the input year from the user
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Check if the year is a leap year
	        boolean isLeapYear = checkLeapYear(year);

	        // Display the result
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        scanner.close();
	    }
	    
	    static boolean checkLeapYear(int year) {
	        // Check for leap year conditions
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            return true; // Leap year
	        } else {
	            return false; // Not a leap year
	        }
	    }
	    
	    public void countDigits() {
	    	
	    	 Scanner scanner = new Scanner(System.in);

	         // Get the input number from the user
	         System.out.print("Enter a number: ");
	         long number = scanner.nextLong();

	         // Count the number of digits
	         int digitCount = countDigits(number);

	         // Display the result
	         System.out.println("Number of digits in " + number + " is: " + digitCount);

	         scanner.close();
	    }
	    
	    static int countDigits(long number) {
	        // Convert the number to a string and find the length
	        String numberString = Long.toString(Math.abs(number));
	        return numberString.length();
	    }
	    
	    public void countZeros() {
	    	
	    	 Scanner scanner = new Scanner(System.in);

	         // Get the input number from the user
	         System.out.print("Enter a number: ");
	         long number = scanner.nextLong();

	         // Count the number of zeros
	         int zeroCount = countZeros(number);

	         // Display the result
	         System.out.println("Number of zeros in " + number + " is: " + zeroCount);

	         scanner.close();
	    }
	    
	    static int countZeros(long number) {
	        // Convert the number to a string and count zeros
	        String numberString = Long.toString(Math.abs(number));

	        int zeroCount = 0;

	        // Iterate through each character in the string
	        for (int i = 0; i < numberString.length(); i++) {
	            if (numberString.charAt(i) == '0') {
	                zeroCount++;
	            }
	        }
			return zeroCount;
	        
	    }
	    
	    
	    public void numberFromEmail() {
	    	
	    	String mailId;
	    	
	    	Scanner in = new Scanner(System.in);
	    	
	    	System.out.println("Enter the EmailId: ");
	    	
	    	mailId = in.next();
	    	
	    	System.out.println("You've entered Id is: "+mailId);
	    	
	    	for(int i = 0; i< mailId.length(); i++) {
				
				if(mailId.charAt(i) >= '0' &&  mailId.charAt(i) <= '9') {
					System.out.println(mailId.charAt(i));
				}else {
					continue;
				}
				
			}
	    }
	    
	    public void stringFromEmail() {
	    	
    		String mailId;
	    	
	    	Scanner in = new Scanner(System.in);
	    	
	    	System.out.println("Enter the EmailId: ");
	    	
	    	mailId = in.next();
	    	
	    	System.out.println("You've entered Id is: "+mailId);
	    	
	    	for(int i=0; i< mailId.length(); i++) {
	    		
	    		if(mailId.charAt(i) >= 'a' && mailId.charAt(i) <= 'z') {
	    			System.out.println(mailId.charAt(i));
	    		}else {
	    			continue;
	    		}
	    	}
	    }
	    
	    public void specialCharFromEmail() {
	    	
	    	String mailId;
	    	
	    	Scanner in = new Scanner(System.in);
	    	
	    	System.out.println("Enter the EmailId: ");
	    	
	    	mailId = in.next();
	    	
	    	System.out.println("You've entered Id is: "+mailId);

	    	for(int i=0; i<mailId.length(); i++) {
	    		
	    		char currentChar = mailId.charAt(i);
	    		
	    		// Check if the character is a special character (not alphanumeric)
	            if (!(Character.isLetterOrDigit(currentChar) || Character.isWhitespace(currentChar))) {
	                System.out.println("Special character found: " + currentChar);
	            }
	    	}
	    	
	    }

}
