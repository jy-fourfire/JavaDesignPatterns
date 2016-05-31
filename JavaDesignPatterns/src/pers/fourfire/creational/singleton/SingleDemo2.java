package pers.fourfire.creational.singleton;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  SingleDemo2 </li>
 * <li>类描述： 利用内部类,只加载一次的机制   </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月31日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class SingleDemo2 {
	/**
	 * 防止被误实例化
	 */
	private SingleDemo2() {
		System.out.println("instance.....");
	}

	/**
	 * 
	*实际情况是，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
	*这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
	*并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。
	*同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题
	 */
	public static class SingleDemo2Factory {
		// 存在一个问题,就是如果 初始的方法,错误,那么整个程序就不能再次加载了
		public static SingleDemo2 instance = new SingleDemo2();
	}

	public SingleDemo2 getInstance() {
		return SingleDemo2Factory.instance;
	}
}
