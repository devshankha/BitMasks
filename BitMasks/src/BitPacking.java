
public class BitPacking {
	public static void main(String[] args) {
		byte NAME = 13;
		byte AGE = 7;
		byte packed_info = (byte) (NAME << 3| AGE);
		byte a = (byte) (packed_info << 4);
		System.out.println(a);
		
	}

}
