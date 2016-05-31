package pers.fourfire.creational.singleton;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  SingleDemo1 </li>
 * <li>类描述：简单的单例模式   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月31日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class SingleDemo1 {

	private static SingleDemo1 instance = null;

	/**
	 * 防止被误实例化
	 */
	private SingleDemo1() {
		System.out.println("instance.....");
	}

	public static SingleDemo1 getInstance() {
		if (instance == null) {
			instance = new SingleDemo1();
		}
		return instance;
	}

	/**
	 * 这个案例的问题,可以在SingleDemo1Test 看,
	 * 当在多线程的情况下,不能保证只创建一次
	 */
}
