package de.maertinszone.examples.generics.superclass;

import java.lang.reflect.ParameterizedType;

/**
 * Call of {@link #tellFoodClass()} will throw a {@link ClassCastException}
 * because superclass (which is {@link SCat}) is no {@link ParameterizedType}.
 */
public class SKitten extends SCat {

}
