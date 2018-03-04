package test;

import factory.ComputerFactory;
import model.Computer;

public class TestFactory {
	
	public static void main(String [] args)
	{
		Computer pc = ComputerFactory.getComputer("PC",  "2 gb", "500 gb");
		Computer server = ComputerFactory.getComputer("Server",  "16 gb", "4  tb");
		
		System.out.println("Factory configurations of PC is: " + pc);
		System.out.println("Factory configurations of Server is: " + server);
	}

}
