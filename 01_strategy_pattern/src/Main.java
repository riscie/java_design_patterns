public class Main {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		System.out.println("= = = = =");
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		System.out.println("changing flybehavior on the fly ^^");
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}
}
