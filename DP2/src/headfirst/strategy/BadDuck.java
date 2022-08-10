package headfirst.strategy;

public class BadDuck extends ModelDuck {
	static public int counter = 0; 
	public BadDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	
	public void display() {
		System.out.println("I'm a bad duck");
	}
	
	public void performFly() {
		System.out.println(counter + ":");
		if(counter % 2== 1)	flyBehavior.fly();
		counter++;
	}
 
	public void performQuack() {
		System.out.println(counter + ":");
		if(counter % 2== 1) quackBehavior.quack();
		counter++;
	}
	

}
