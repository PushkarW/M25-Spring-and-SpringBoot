package org.tnsindia.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		/*Student s=new Student();
		s.setStudent_Name("Pushkar");
		s.display();*/
		
		//using IOC
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student S1=c.getBean("S1",Student.class);
		Student S2=c.getBean("S2",Student.class);

		S1.display();
		System.out.println();
		S2.display();
	}

}
