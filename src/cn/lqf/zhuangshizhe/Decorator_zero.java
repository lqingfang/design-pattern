package cn.lqf.zhuangshizhe;

public class Decorator_zero extends Decorator{
	
	public Decorator_zero(Human human) {
		super(human);
	}

	public void goHome() {
		System.out.println("回家...");
	}
	public void findMap() {
		System.out.println("找地图...");
	}
	public void wearClothes() {
		super.wearClothes();
		goHome();
	}
	public void walkToWhere() {
		super.walkToWhere();
		findMap();
	}
}
