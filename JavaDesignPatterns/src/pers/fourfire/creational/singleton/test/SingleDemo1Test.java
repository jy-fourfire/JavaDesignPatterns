package pers.fourfire.creational.singleton.test;

import java.util.Date;

import pers.fourfire.creational.singleton.SingleDemo1;

/**
 * 
 * <ul>
 * <li>项目名称：JavaDesignPatterns </li>
 * <li>类名称：  SingleDemo1Test </li>
 * <li>类描述： 单例测试  </li>
 * <li>创建人：jy </li>
 * <li>创建时间：2016年5月31日 </li>
 * <li>修改备注：</li>
 * </ul>
 */
public class SingleDemo1Test extends Thread {

	/***/
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			SingleDemo1Test testMain = new SingleDemo1Test();
			testMain.setName(new Date().toLocaleString());
			testMain.start();
		}
	}

	public void run() {
		SingleDemo1 demo1 = SingleDemo1.getInstance();
	}

}
