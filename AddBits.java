import java.util.Arrays;
import java.util.Random;
/*
 *   If x and y don’t have set bits at same position(s), then bitwise XOR (^) of x and y 
 *   gives the sum of x and y. To incorporate common set bits also, bitwise AND (&) is used. 
 *   Bitwise AND of x and y gives all carry bits. We calculate (x & y) << 1 and add it to x ^ y to 
 *   get the required result.
 * 
 * 
 */

public class AddBits {
	//XOR (x ^ y) is addition without carry. (x & y) is the carry-out from each bit. 
	//(x & y) << 1 is the carry-in to each bit.
	// The loop keeps adding the carries until the carry is zero for all bits.
	static int add(int x, int y) {
	    int a, b;
	    do {
	        a = x & y;
	        b = x ^ y;
	        x = a << 1;
	        y = b;
	    } while (a!= 0);
	    return b;
	}
	
	static int Add(int x, int y) 
    { 
        // Iterate till there is no carry 
		
        while (y != 0)  
        { 
            // carry now contains common 
            // set bits of x and y 
             int carry = x & y; 
  
            // Sum of bits of x and  
            // y where at least one  
            // of the bits is not set 
            x = x ^ y; 
  
            // Carry is shifted by  
            // one so that adding it  
            // to x gives the required sum 
            y = carry << 1; 
        } 
        return x; 
    } 
      
 

	public static void main(String[] args) {
		System.out.println(add(15,43));
		System.out.println(Add(15,43));
		
		
	}

}
