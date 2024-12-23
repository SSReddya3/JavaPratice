package javaPractice;

public class findSecondhighestNumber {

	public static void main(String[] args) {


	    int[] numbers = {12, 35, 1, 10, 34, 1};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Find the highest and second highest numbers
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        System.out.println("Second Highest Number: " + secondHighest);
		
		
		
		
		
		
		
		
		
		
	}

}
