package com.xworks.engineering1;
import com.xworkz.engineering.Plant;
public class PlantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Plant plant1 = new Plant("Rose", "Flowering", 150.0, 60, 5);
	     Plant plant2 = new Plant("Basil", "Herb", 80.0, 40, 2);
	     Plant plant3 = new Plant("Mango Tree", "Fruit", 500.0, 500, 30);

	    
	     plant1.getPlant(true, true, 2, "Asia", "Red");
	     plant2.getPlant(true, false, 1, "Tropical", "Green");
	     plant3.getPlant(false, true, 10, "India", "Green");
	     Plant[] plants = { plant1, plant2, plant3 };
	     for (Plant plant : plants)
	     {
	            plant.display();
	            System.out.println("--------------------------------");
	     }
	}

}
