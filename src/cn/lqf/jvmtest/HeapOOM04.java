package cn.lqf.jvmtest;

public class HeapOOM04 {
	private static final int _1MB = 1024*1024;
	public static void main(String[] args) {
		byte[] b1,b2,b3;
		b1 = new byte[1024*512];
		b2 = new byte[_1MB*4];
		b3 = new byte[_1MB*4];
	}
}
