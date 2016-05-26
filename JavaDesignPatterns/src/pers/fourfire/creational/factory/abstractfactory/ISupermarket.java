package pers.fourfire.creational.factory.abstractfactory;

import pers.fourfire.creational.factory.simple.ISell;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  ISupermarket </li>
 * <li>类描述： 超级市场  </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public interface ISupermarket {

	/**
	 * 
	 * <ul>
	 * <li>方法名：  getSeller </li>
	 * <li>功能描述：定义一个,获取卖家接口的接口,要是商城来卖东西的,都需要实现这个接口 </li>
	 * <li>创建人：  jy </li>
	 * <li>创建时间：2016年5月26日 </li>
	 * </ul> 
	 * @return
	 */
	public ISell getSeller();
}
