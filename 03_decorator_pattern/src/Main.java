public class Main {

    public static void main(String args[]) {
	// ##1 A Simple Espresso, no other Ingreditens
	Beverage espresso = new Espresso();
	System.out.println(espresso.getDescription() + " $" + espresso.cost());

	// ##2 A DarkRoast, with double Mocha and Whip
	Beverage darkRoastExtra = new DarkRoast();
	// Here comes double Mocha
	darkRoastExtra = new Mocha(darkRoastExtra);
	darkRoastExtra = new Mocha(darkRoastExtra);
	// And the Whip
	darkRoastExtra = new Whip(darkRoastExtra);
	System.out.println(darkRoastExtra.getDescription() + " $" + darkRoastExtra.cost());

	// ##3 A HouseBlend with Soy and Whip
	Beverage houseBlendExtra = new HouseBlend();
	// Here comes the Soy
	houseBlendExtra = new Soy(houseBlendExtra);
	// And here the Whip
	houseBlendExtra = new Whip(houseBlendExtra);
	System.out.println(houseBlendExtra.getDescription() + " $" + houseBlendExtra.cost());

    }

}
