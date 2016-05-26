package pers.fourfire.creational.factory.abstractfactory;

import pers.fourfire.creational.factory.simple.FishSeller;
import pers.fourfire.creational.factory.simple.ISell;

public class FishFactory implements ISupermarket {

	@Override
	public ISell getSeller() {
		return new FishSeller();
	}

}
