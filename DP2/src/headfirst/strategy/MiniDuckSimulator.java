package headfirst.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
		
		ModelDuck	model = new ModelDuck();
		BadDuck		bad = new BadDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		model.performQuack();
		model.setQuackBehavior(new DoubleQuack());
		model.performQuack();
		
		bad.performQuack();
		bad.performQuack();
		bad.performQuack();
		bad.performQuack();		
		
		mallard.setEggBehavior(new SpawnEgg());
		Duck ducks[] = {mallard, rubberDuckie, decoy, model};
		
		
		for(int i=0;i<4;i++)
		{
			
			model.CopyBehavior(ducks[i]);
			ducks[i].display();
			ducks[i].performEgg();
			model.display();
			model.performEgg();
			
		}
		
	}
}
