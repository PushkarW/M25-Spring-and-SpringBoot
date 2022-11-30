package org.tnsindia.springautowired;

public class Heart {
	//in Terms of Literals
	private String nameOfAnimal;
	private int noOfHeart;



	public String getNameOfAnimal() {
		return nameOfAnimal;
	}


	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}


	public int getNoOfHeart() {
		return noOfHeart;
	}


	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}


	//Method
	public void pump()
	{
		System.out.println("Your Heart is Pumping");
		System.out.println("you are Alive!");
	}

}
