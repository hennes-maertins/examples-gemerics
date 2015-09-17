package de.maertinszone.examples.generics.superclass;

import java.lang.reflect.ParameterizedType;

import de.maertinszone.examples.generics.Food;

public abstract class SAnimal<T extends Food> {

	@SuppressWarnings("unchecked")
	private Class<T> getFoodClass() {
		return (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public String tellFoodClass() {
		return "My food is "+ getFoodClass().getSimpleName();
	}
	
}
