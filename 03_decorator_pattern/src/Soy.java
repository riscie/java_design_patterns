public class Soy extends IngredientDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
	this.beverage = beverage;
    }

    @Override
    public String getDescription() {
	return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
	return 0.45 + beverage.cost();
    }

}
