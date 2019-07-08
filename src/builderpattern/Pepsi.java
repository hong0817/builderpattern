package builderpattern;

import builderpattern.item.impl.ColdDrink;

public class Pepsi extends ColdDrink {

	public float price() {
		return 35.0f;
	}
	
	public String name() {
		return "Pepsi";
	}
}
