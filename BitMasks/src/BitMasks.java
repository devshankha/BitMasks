import java.nio.channels.SelectionKey;

public class BitMasks {
	// checks if the nth bit is set in a byte
	static boolean isSet(Byte b, int n) {
		System.out.println(b);
		System.out.println(n);
		System.out.println(1 << n);
		System.out.println(b & (1 << n));
		return (b & (1 << n)) != 0;
		// return (b & (1<<n)) == 1<<n;
	}

	static void setNthbit(byte b, int n) {

		b = (byte) (b | (1 << n));

	}

	static void unsetNthbit(byte b, int n) {

		b = (byte) (b & ~(1 << n));

	}

	static void toggleNthbit(byte b, int n) {

		b = (byte) (b ^ (1 << n));

	}
	//This will work as there will be 1 in the first bit
	//if this is an odd number
	static boolean isOdd(byte b) {
		return (b & 1 )!= 0;
		
	}
	//Let the input number be n. n-1 would have all 
	//the bits flipped after the rightmost set bit (including the set bit). 
	//So, doing n&(n-1) would give us the required result.
	static void turnOffRightMost(byte b) {
		b = (byte) (b & (b-1));
		
	}
	static boolean isPowerOf2(byte b) {
		return (b & (b-1))==0;
		
	}
	

	public static void main(String[] args) {
		int a = 6;
		// System.out.println(a<<0);
		//boolean l = BitMasks.isSet((byte) 3, 1);
		//System.out.println(l);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(BitMasks.isOdd((byte)8));
		byte c1 = 0;
		byte c2 = (byte) (c1-1);
		System.out.println(Integer.toBinaryString(c2));
		byte asd = 4;
		System.out.println(Integer.toBinaryString(asd));
		byte asd1 = 4;
		System.out.println(Integer.toBinaryString(asd1));
		int mn = 1;
		System.out.println(BitMasks.isPowerOf2((byte) 7));
		
	
		
		
		
	}

}
