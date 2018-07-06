/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {
	public static void main(String[] args) {
		Smurf smurf = new Smurf("rob");
		smurf.getName();
		smurf.eat();
		smurf.getHatColor();
		smurf.isGirlOrBoy("boy");
		Smurf smurfette = new Smurf("Robba");
		smurfette.getName();
		smurfette.eat();
		smurfette.getHatColor();
		smurfette.isGirlOrBoy("gorl");
	}
	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public void getHatColor() {
		if (name.equals("papa")) {
			System.out.println(name+" wears a red hat");
		}
		else {
			System.out.println(name+" wears a white hat");
		}
	}
	private String gender;

	/* Smurfette is the only female Smurf. */
	public void isGirlOrBoy(String gender) {
		// 4. Fill in this method
		this.gender=gender;
		System.out.println(name+" is a "+gender);
	}

}



