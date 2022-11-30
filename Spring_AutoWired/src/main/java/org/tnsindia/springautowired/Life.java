package org.tnsindia.springautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Driver Class
public class Life {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Human human=c.getBean("human",Human.class);
		human.pumping();
	}

}
