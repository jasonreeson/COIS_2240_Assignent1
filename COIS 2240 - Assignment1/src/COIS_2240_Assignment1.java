// Class: COIS 2240
// Assignnet: #1
// Developer: Jason Reeson
// Start Date: Jan 28, 2017
// End Date:

import java.util.Scanner;  // needed for Scanner

 class COIS_2240_Assignment1 {
	
	public static void main(String[] args) 
	{
		
		
	// Print Title
	System.out.println("COIS 2240 - Assignment #1 - Jason Reeson");
	System.out.println("\n");
	//Prompt the User to input an integer
	System.out.println("Please Provide an integer like 1,2, 17, 109 (no decimals!).");
	System.out.println("Enter your integer here:");
	
	//Get the end fibonacci number from the user
	Scanner scanner = new Scanner( System.in);
	String input = scanner.nextLine();
	System.out.println("The integer provided was: " + input);
	
	//Start the Recursive Method
	System.out.println("Start of the Recursive Test.");	
	// Start the timer - Recursion
	long startTimeNanoRec = System.nanoTime();
	// Call the fibonacci method using the user's input
	fiboSeriesRec(0,1,1,Integer.parseInt(input)); //convert the input string to int
	// Stop the Recursion Timer
	long endTimeNanoRec = System.nanoTime();
	
	//Test the Loop Method
	System.out.println("Start of the Recursive Test.");	
	// Start the Time - Loop
	long startTimeNanoLoop = System.nanoTime();
	//Call the iterative method using the user's input
	fiboSeriesLoop(0,1,1,Integer.parseInt(input));
	//Stop the timer
	long endTimeNanoLoop = System.nanoTime();
	
	//Print the results
	System.out.println("Iterative Method - Time Elapsed: " + (endTimeNanoLoop - startTimeNanoLoop) + " nanoseconds.");
	System.out.println("Iterative Method - Time Elapsed: " + (endTimeNanoLoop - startTimeNanoLoop)/1000000 + " milliseconds.\n");
	System.out.println("Recursive Method - Time Elapsed: " + (endTimeNanoRec - startTimeNanoRec) + " nanoseconds.");
	System.out.println("Recursive Method - Time Elapsed: " + (endTimeNanoRec - startTimeNanoRec)/1000000 + " milliseconds.");
		
	} 
	
	public static void fiboSeriesRec(int rNum1, int rNum2, int counter, int numbers)
	{
		//Setup the termination clause
		if(counter > 0) 
		{
			//Print the first number in the sequence
            System.out.println(rNum1 + " ");

            //Move to the next Number in the sequence
            if(counter < numbers)
            {
            	fiboSeriesRec(rNum2, rNum1 + rNum2, counter + 1, numbers);
            }
		}
	}
	
	public static void fiboSeriesLoop(int num1, int num2, int counter, int numbers)
     {
        //Print the first 2 numbers in the sequence
        System.out.println(num1 + " ");
        System.out.println(num2 + " ");

        int newNum =0;

        //iterate through the remaining elements in the sequence
        //note need to adjust the 'numbers' by 1 because we printed the first two numbers outside the loop
        for(int i = 1;i<numbers-1;i++)
        {
            newNum = num1+num2;
            System.out.println(newNum + " ");
            num1 = num2;
            num2 = newNum;

        }
     }
	
}
