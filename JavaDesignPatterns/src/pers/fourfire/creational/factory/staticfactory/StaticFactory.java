package pers.fourfire.creational.factory.staticfactory;

import pers.fourfire.creational.factory.simple.FishSeller;
import pers.fourfire.creational.factory.simple.ISell;
import pers.fourfire.creational.factory.simple.Sweeter;

public class StaticFactory {
	public static ISell Fisher() {
		return new FishSeller();
	}

	public static ISell Sweeter() {
		return new Sweeter();
	}
}
