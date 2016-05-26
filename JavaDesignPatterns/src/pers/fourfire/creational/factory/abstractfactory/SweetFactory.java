package pers.fourfire.creational.factory.abstractfactory;

import pers.fourfire.creational.factory.simple.ISell;
import pers.fourfire.creational.factory.simple.Sweeter;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  SweetFactory </li>
 * <li>类描述：糖果卖家   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月26日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class SweetFactory implements ISupermarket {

	@Override
	public ISell getSeller() {
		return new Sweeter();
	}

}
