package cn.lqf.jvmtest;

public class HeapOOM02 {
	
	private static final int _1MB = 1024*1024;
	
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		byte[] b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
		try {
			b1 = new byte[10 * _1MB];
			b2 = new byte[10 * _1MB];
			b3 = new byte[10 * _1MB];
			Thread.sleep(2000);
			b4 = new byte[10 * _1MB];
			b5 = new byte[10 * _1MB];
			b6 = new byte[10 * _1MB];
			b7 = new byte[10 * _1MB];
			b8 = new byte[10 * _1MB];
			b9 = new byte[10 * _1MB];
			Thread.sleep(2000);
			b10 = new byte[10 * _1MB];
			b11 = new byte[10 * _1MB];
			b12 = new byte[10 * _1MB];
			b13 = new byte[10 * _1MB];
			b14 = new byte[10 * _1MB];
			Thread.sleep(2000);
			b15 = new byte[10 * _1MB];
			b16 = new byte[10 * _1MB];
			b17 = new byte[10 * _1MB];
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			long costTime = System.currentTimeMillis()-time1;
			System.out.println("共耗时"+costTime+"ms");
			System.exit(0);
		}
	}
}
