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

	public static void main(String[] args) {
		SellFactory factory = new SellFactory();
		ISell seller = factory.sell("fish");
		String buyGoods = seller.Sell();
		System.out.println(buyGoods);
	}

}
