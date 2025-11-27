package Interview_Programs;

public class LTInterview_Programe 
{
	public static void main(String[] args)
	{
		
		// QA : Check if the sum of any two elements in the array equals 7, and if yes → return true.
		
	        int[] arr = {1, 2, 3, 4, 5};
	        int sum = 7;

	        boolean result = checkPairSum(arr, sum);
	        System.out.println(result); // Output: true (because 2 + 5 = 7 or 3 + 4 = 7)
	    }

	    public static boolean checkPairSum(int[] arr, int sum) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == sum) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
}