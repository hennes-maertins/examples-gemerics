/**
 * Example how to get type information for generics.
 * 
 * Because of <a href="https://docs.oracle.com/javase/tutorial/java/generics/erasure.html">Type Erasure</a> in Java you cannot write something like T.class to get the type of a generic type parameter.
 * 
 * But sometimes you want to get the {@link java.lang.Class} of this type in a subclass. Maybe you need the information for a Hibernate Criteria or something else.
 * 
 * This example project will show two ways to achieve this.
 * 
 * The easy way is to use an abstract method as in {@link de.maertinszone.examples.generics.override.OAnimal}.
 * 
 * The cool way is to use the information about your generic superclass as in {@link de.maertinszone.examples.generics.superclass.SAnimal}. But be sure to make your implementing subclasses <code>final</code> or override the method that gets the {@link java.lang.Class} of your generic.
 */
package de.maertinszone.examples.generics;

