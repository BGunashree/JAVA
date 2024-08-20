package com.xworks.engineering1;
import com.xworkz.engineering.Snake;

public class SnakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Snake snake1=new Snake("megha",1000,"Cobra");
    Snake snake2=new Snake("lakshmi",800,"Rattle");
    Snake snake3=new Snake("divya",1000,"python");
    Snake[] snakes=new Snake[3];
    snakes[0]=snake1;
    snakes[1]=snake2;
    snakes[2]=snake3;
    for(Snake s:snakes)
    {
    	s.display();
    }
	}

}
//ctrl+shift+f