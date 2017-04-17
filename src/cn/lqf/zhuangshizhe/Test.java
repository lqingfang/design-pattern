package cn.lqf.zhuangshizhe;

public class Test {

	public static void main(String[] args) {
		Human human = new Person();
		Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(human)));
		decorator.wearClothes();
		decorator.walkToWhere();
	}
}
