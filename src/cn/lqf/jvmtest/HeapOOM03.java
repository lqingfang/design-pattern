package cn.lqf.jvmtest;

public class HeapOOM03 {
	private static final int _1MB = 1024*1024;
	public static void main(String[] args) {
		byte[] b1,b2,b3,b4;
		b1 = new byte[_1MB];
		b2 = new byte[_1MB];
		b3 = new byte[_1MB];
		b4 = new byte[_1MB];
	}
}
