package abstract_classes.farm;

import java.util.Random;

abstract public class Animal {
	abstract void MakeNoise();
	abstract void Eat();
	String randomChoice(){
		String choice;
		Random r = new Random();
		if(r.nextInt(10) > 2) {
			choice = "I want moooooooooooooreeeeeeeeeeeee";
		}else {
			choice = "I had enough";
		}
		return choice;
	}
}

class cow extends Animal{
	void MakeNoise() {	
		System.out.println("give me alot of food  ...");
		System.out.println("... moo mooooo");
	}
	void Eat() {
		System.out.println(randomChoice());
	}
}

class chicken extends Animal{
	void MakeNoise() {	
		System.out.println("give me some food ...");
		System.out.println("... cluck cluck cluck");
	}
	void Eat() {
		System.out.println(randomChoice());
	}
}

class horse extends Animal{
	void MakeNoise() {	
		System.out.println("give me alot of food ...");
		System.out.println("... neeeiigggh");
	}
	void Eat() {
		System.out.println(randomChoice());
	}
}

class duck extends Animal{
	void MakeNoise() {	
		System.out.println("give me some food ...");
		System.out.println("... quack quack quack");
	}
	void Eat() {
		System.out.println(randomChoice());
	}	
}