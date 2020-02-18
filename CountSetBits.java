import java.util.Arrays;
import java.util.Random;

public class CountSetBits {
   //this is a normal technique
	static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			System.out.println("Printing value of n " + n);
			count += n & 1;
			n = n >> 1;
		}

		return count;
	}
   //this is same logic as above
	static int setBits(byte b) {
		int count = 0;
		while (b > 0) {
			if ((b & 1) != 0)
				count++;

			b = (byte) (b >> 1);

		}
		return count;
	}
	//This is using Brian Kernighan’s Algorithm
	static int countSetBitsA(int n) {
		int count = 0; 
        while (n > 0) { 
            n =n& (n - 1); 
            count++; 
        } 
        return count; 
		
	}

	public static void main(String[] args) {
		Random r = new Random();
		// for (int i=0; i < 6;i++)
		// System.out.print(r.nextInt(3+1)+" , ");
		int arr[] = { 1, 2, 3, 4 };
		// randomize(arr, arr.length-1);
		int arr1[] = { 1, 2, 3, 4 };
		// System.out.println();
		//int[] k = shuffleRecursively(arr1, arr1.length - 1);
		// System.out.println(Arrays.toString(k));
		byte b = 15;
		System.out.println(countSetBitsA(b));
	}

}
