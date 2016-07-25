public class Whip extends IngredientDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
	this.beverage = beverage;
    }

    @Override
    public String getDescription() {
	return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
	return 0.19 + beverage.cost();
    }
}
