package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	Cow cow1 = new Cow();
	Duck duck1 = new Duck();
	Horse horse = new Horse();
	Duck duck2 = new Duck();
	Pig pig = new Pig();
	Cow cow2 = new Cow();
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(cow1);
	farm.add(duck1);
	farm.add(horse);
	farm.add(duck2);
	farm.add(pig);
	farm.add(cow2);
	for (Animal animal : farm) {
		animal.makeNoise();
		animal.eats();
	}
}
}
