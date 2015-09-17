package de.maertinszone.examples.generics.override;

import de.maertinszone.examples.generics.Fish;

public class OCat extends OAnimal<Fish> {

	@Override
	protected Class<Fish> getFoodClass() {
		return Fish.class;
	}

}
