# examples-generics
Example project abaout usage of generics in Java.

Example how to get type information for generics.
Because of [Type Erasure](https://docs.oracle.com/javase/tutorial/java/generics/erasure.html) in Java you cannot write something like T.class to get the type of a generic type parameter.
But sometimes you want to get the Class of this type in a subclass. Maybe you need the information for a Hibernate Criteria or something else.
This example project will show two ways to achieve this.
* The easy way is to use an abstract method as in de.maertinszone.examples.generics.override.OAnimal.
* The cool way is to use the information about your generic superclass as in de.maertinszone.examples.generics.superclass.SAnimal.
  But be sure to make your implementing subclasses final or override the method that gets the Class of your generic.
