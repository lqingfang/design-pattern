package cn.lqf.jvmtest;

import java.util.ArrayList;
import java.util.List;

public class OOMObject {
	public byte[] plceholder = new byte[64 * 1024];
	public static void fillHeap(int num) throws InterruptedException {
		List<OOMObject> list = new ArrayList<OOMObject>();
		for (int i = 0; i< num; i++) {
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	public static void main(String[] args) {
		try {
			fillHeap(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
