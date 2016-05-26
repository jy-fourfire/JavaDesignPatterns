package pers.fourfire.creational.factory.simple;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  SellFactory </li>
 * <li>类描述： 柜台,工厂模式  </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class SellFactory {

	/**
	 * 
	 * <ul>
	 * <li>方法名：  sell </li>
	 * <li>功能描述：工厂 </li>
	 * <li>创建人：  jy </li>
	 * <li>创建时间：2016年5月26日 </li>
	 * </ul> 
	 * @param type
	 * @return
	 */
	public ISell sell(String type) {
		if ("fish".equals(type)) {
			return new FishSeller();
		} else if ("sweet".equals(type)) {
			return new Sweeter();
		} else {
			System.out.println("请输入正确的品种");
			return null;
		}
	}
}
