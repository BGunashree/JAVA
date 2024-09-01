package com.xworkz.inheritthing.Runner;

import com.xworkz.inheritthing.MetroTrain;
import com.xworkz.inheritthing.SubUrbanTrain;
import com.xworkz.inheritthing.Train;

public class TrainRunner {

	public static void main(String[] args) {
	
		Train train=new Train(200,"Bangalore","Hubli");
		train.display();
		System.out.println("----------------------------------------------");
		
		MetroTrain materoTrain=new MetroTrain("Baiyapanahalli","Vijaynagar");
		materoTrain.display();
		System.out.println("----------------------------------------------");
		Train train1=new MetroTrain("Baiyapanahalli","Trinity");
		train1.display();
		System.out.println("----------------------------------------------");
		
		SubUrbanTrain subUrbanTrain=new SubUrbanTrain(101,"kengeri","Whitefield");
		subUrbanTrain.display();
		System.out.println("----------------------------------------------");
		Train train2 = new SubUrbanTrain(102,"ksr bengaluru","yelahanka");
		train2.display();
	}

}
