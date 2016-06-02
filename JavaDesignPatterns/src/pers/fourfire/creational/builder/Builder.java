package pers.fourfire.creational.builder;

import java.util.ArrayList;
import java.util.List;

import pers.fourfire.creational.factory.simple.FishSeller;
import pers.fourfire.creational.factory.simple.ISell;
import pers.fourfire.creational.factory.simple.Sweeter;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  Builder </li>
 * <li>类描述： 创建者模型 </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年6月2日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class Builder {

	// 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
	// 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，
	// 其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的

	private List<ISell> list = new ArrayList<ISell>();

	public void FishSell() {
		list.add(new FishSeller());
	}

	public void sweetSell() {
		list.add(new Sweeter());
	}
	
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.FishSell();
	}
}
