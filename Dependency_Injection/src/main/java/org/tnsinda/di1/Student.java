package org.tnsinda.di1;

public class Student {
	//2.DI in the forms of objects
		MathCheat math;
		
		
		
		
		//MathCheat m=new MathCheat();
		public void cheating()
		{
			math.mathcheat();
		}
		//DI using setters
		public void setMath(MathCheat math) {
			this.math = math;
		}


}
