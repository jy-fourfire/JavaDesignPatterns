package pers.fourfire.creational.factory.staticfactory;

import pers.fourfire.creational.factory.simple.ISell;

public class TestMain {

	public static void main(String[] args) {
		ISell seller = StaticFactory.Fisher();
		String buyGoods = seller.Sell();
		System.out.println(buyGoods);
		// -====
		buyGoods = seller.Sell();
		System.out.println(buyGoods);
		//
		System.out.println("这个案例看出,对象只会初始化一次");
	}
}
