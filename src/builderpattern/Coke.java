package builderpattern;

import builderpattern.item.impl.ColdDrink;

public class Coke extends ColdDrink{

	public float price() {
		return 30.0f;
	}
	
	public String name() {
		return "Coke";
	}
	
}
