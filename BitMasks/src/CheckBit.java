//This is extract from SelectionKey.java
public class CheckBit {
	//1
	public static final int OP_READ = 1 << 0;
	//4
	public static final int OP_WRITE = 1 << 2;
	//8
	public static final int OP_CONNECT = 1 << 3;
	//16
	public static final int OP_ACCEPT = 1 << 4;
	int readyOps = 5;

	public final boolean isWritable() {
		return (readyOps & OP_WRITE) != 0;
	}

	public final boolean isReadable() {
		return (readyOps & OP_READ) != 0;
	}

	public final boolean isConnectable() {
		return (readyOps & OP_CONNECT) != 0;
	}

	public final boolean isAcceptable() {
		return (readyOps & OP_ACCEPT) != 0;
	}

}
