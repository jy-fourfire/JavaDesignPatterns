package pers.fourfire.creational.factory.morefactory;

import pers.fourfire.creational.factory.simple.FishSeller;
import pers.fourfire.creational.factory.simple.Sweeter;
import pers.fourfire.creational.factory.simple.ISell;

public class SellMoreFactory {

	public ISell Fisher() {
		return new FishSeller();
	}

	public ISell Sweeter() {
		return new Sweeter();
	}
}
