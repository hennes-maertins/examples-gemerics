package de.maertinszone.examples.generics.override;

import de.maertinszone.examples.generics.Food;

public abstract class OAnimal<T extends Food> {

	protected abstract Class<T> getFoodClass();
	
	public String tellFoodClass() {
		return "My food is "+ getFoodClass().getSimpleName();
	}
	
}
