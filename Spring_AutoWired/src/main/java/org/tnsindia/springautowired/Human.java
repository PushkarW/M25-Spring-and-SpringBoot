package org.tnsindia.springautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	//Human is dependant on the Heart Class
	//Dependency in terms of object
	private Heart heart;
	public void pumping()
	{
		heart.pump();
		System.out.println("Name of the animal: "+heart.getNameOfAnimal());
		System.out.println("No.of Heart: "+heart.getNoOfHeart());
	}
	
	//Achiving DI Using Setters
	@Autowired
	@Qualifier("Octopusheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	//Achieving using constructor

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public Human() {
		super();
		this.heart=heart;
	}
		

}
