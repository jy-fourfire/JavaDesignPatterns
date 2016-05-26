package pers.fourfire.creational.factory.morefactory;

import pers.fourfire.creational.factory.simple.ISell;

/**
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  TestMain </li>
 * <li>类描述：多个工厂方法模式   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class TestMain {

	/**是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，
	 * 则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
	 */
	public static void main(String[] args) {
		SellMoreFactory factory = new SellMoreFactory();
		ISell seller = factory.Fisher();
		String buyGoods = seller.Sell();
		System.out.println(buyGoods);
	}
}
