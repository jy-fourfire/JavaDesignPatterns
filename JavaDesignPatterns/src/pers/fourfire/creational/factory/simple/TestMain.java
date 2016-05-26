package pers.fourfire.creational.factory.simple;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  柜台测试函数 </li>
 * <li>类描述：   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class TestMain {

	/**
	 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
	 */
	public static void main(String[] args) {
		SellFactory factory = new SellFactory();
		ISell seller = factory.sell("fish");
		String buyGoods = seller.Sell();
		System.out.println(buyGoods);
	}

}
