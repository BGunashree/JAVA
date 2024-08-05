class RocketRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker("Bose");
		speaker.size='M';
		speaker.setcost(10000);
		speaker.display();
		Speaker speaker1=new Speaker("Sony");
		speaker1.size='M';
		speaker1.setcost(4000);
		speaker1.display();
		
		Speaker speaker2=new Speaker("JBL");
		speaker2.size='M';
		speaker2.setcost(5000);
		speaker2.display();
		
		
		
		Rocket rocket=new Rocket(1500);
		rocket.setfuelCapacity(3200.0);
		rocket.noOfThrusters=1000;
		rocket.display();
		Rocket rocket1=new Rocket(1500);
		rocket1.noOfThrusters=500;
		rocket1.setfuelCapacity(2100.0);
		rocket.display();
		Rocket rocket2=new Rocket(1500);
		rocket2.noOfThrusters=1200;
		rocket2.setfuelCapacity(3800.0);
		rocket.display();
		
		Chocolate chocolate=new Chocolate("sweet");
		chocolate.setprice(100);
		chocolate.size='L';
		chocolate.display();
		Chocolate chocolate1=new Chocolate("bitter");
		chocolate1.setprice(110);
		chocolate1.size='M';
		chocolate1.display();
		Chocolate chocolate2=new Chocolate("sweet");
		chocolate2.setprice(200);
		chocolate2.size='M';
		chocolate2.display();
		
		Projector projector=new Projector("LCD");
		projector.setcolor("black");
		projector.weight=1;
		projector.display();
		Projector projector1=new Projector("LED");
		projector1.setcolor("white");
		projector1.weight=2;
		projector1.display();
		Projector projector2=new Projector("DLP");
		projector2.setcolor("black");
		projector2.weight=1;
		projector2.display();
		
		
		Paper paper=new Paper("good");
		paper.color="white";
		paper.setsize('M');
		paper.display();
		Paper paper1=new Paper("average");
		paper1.color="red";
		paper1.setsize('S');
		paper1.display();
		Paper paper2=new Paper("good");
		paper2.color="yellow";
		paper2.setsize('L');
		paper2.display();
		
		
	}
}
