package pers.fourfire.creational.factory.simple;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  FishSeller </li>
 * <li>类描述：买鱼的   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class FishSeller implements ISell {

	public FishSeller() {
		System.out.println("init FishSeller~");
	}

	@Override
	public String Sell() {
		return "客官,你的鱼摆摆~";
	}

}
