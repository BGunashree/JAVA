package com.xworks.engineering1;
import com.xworkz.engineering.Ball;
public class BallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ball ball1 = new Ball("Football", "Nike", 1500.0, 450, 11.0, 22.0, "White", "Leather", "Soccer");
	     Ball ball2 = new Ball("Basketball", "Spalding", 2000.0, 620, 12.5, 25.0, "Orange", "Synthetic", "Basketball");
	     Ball ball3 = new Ball("Tennis Ball", "Wilson", 500.0, 58, 3.3, 6.6, "Green", "Rubber", "Tennis");

	       
	     ball1.setBall(2023, true, "USA", "Smooth", "John Doe", "Sports Store", "Jane Smith", 
	                      85, "High", 10.0, "Grass", "Hand stitched", false, "available", "In Stock", 100);

	     ball2.setBall(2022, true, "China", "Grippy", "Mike Johnson", "Basketball Store", "Chris Evans", 
	                      90, "Premium", 15.0, "Indoor", "Machine stitched", true, "not available", "In stock", 50);

	     ball3.setBall(2021, false, "India", "Textured", "David Lee", "Tennis Shop", "Emma Watson", 
	                      75, "Standard", 5.0, "Hard court", "Hand stitched", false, "available", "Out of stock", 200);

	       
	     Ball[] balls = { ball1, ball2, ball3 }; 
	     for (Ball ball : balls)
	     {
	            ball.display();
	            System.out.println("--------------------------------");
	     }

	}

}
