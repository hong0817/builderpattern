package builderpattern.item.impl;

import builderpattern.item.Item;
import builderpattern.packing.Packing;
import builderpattern.packing.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
