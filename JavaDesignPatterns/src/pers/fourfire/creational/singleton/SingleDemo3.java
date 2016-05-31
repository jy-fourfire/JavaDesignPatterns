package pers.fourfire.creational.singleton;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  SingleDemo3 </li>
 * <li>类描述： 除了内部类方案  </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月31日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class SingleDemo3 {

	private static SingleDemo3 instance = null;

	private SingleDemo3() {
	}

	public static synchronized void initInstance() {
		instance = new SingleDemo3();
	}

	public static SingleDemo3 getInstance() {
		if (instance == null) {
			// 因为每次,只会用一次,所以加上同步也不怎会影响效率
			initInstance();
		}
		return instance;
	}
}
