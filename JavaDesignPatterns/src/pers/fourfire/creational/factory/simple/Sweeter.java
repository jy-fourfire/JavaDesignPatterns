package pers.fourfire.creational.factory.simple;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  Sweeter </li>
 * <li>类描述：卖糖果的   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class Sweeter implements ISell {

	@Override
	public String Sell() {
		return "拿好,糖果~";
	}

}
