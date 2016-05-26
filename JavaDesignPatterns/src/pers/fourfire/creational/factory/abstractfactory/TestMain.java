package pers.fourfire.creational.factory.abstractfactory;

import pers.fourfire.creational.factory.simple.ISell;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  TestMain </li>
 * <li>类描述：抽象工厂模式（Abstract Factory）   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class TestMain {

	/**
	 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，
	 * 如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，
	 * 所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，
	 * 创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
	 * 不需要修改之前的代码。
	 */
	public static void main(String[] args) {
		ISupermarket supermarket = new FishFactory();// 选择类型
		ISell seller = supermarket.getSeller();

		String buyGoods = seller.Sell();
		System.out.println(buyGoods);

		buyGoods = seller.Sell();
		System.out.println(buyGoods);
	}
}
