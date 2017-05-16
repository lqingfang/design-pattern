package cn.lqf.jvmtest;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

	private static final int _1MB = 1024*1024;
	
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		List<Object> list = new ArrayList<Object>();
		byte[] allocation = new byte[2 * _1MB];
		try {
			while(true) {
				list.add(allocation);
			}
		} finally {
			long costTime = System.currentTimeMillis()-time1;
			System.out.println("共耗时"+costTime+"ms");
		}
	}
}
