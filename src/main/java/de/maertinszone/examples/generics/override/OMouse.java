package de.maertinszone.examples.generics.override;

import de.maertinszone.examples.generics.Cheese;

public class OMouse extends OAnimal<Cheese> {

	@Override
	protected Class<Cheese> getFoodClass() {
		return Cheese.class;
	}

}
