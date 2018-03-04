package model;

public class PC extends Computer{
	private String ram, hdd;
	
	public PC(String ram, String hdd)
	{this.ram=ram;
	this.hdd=hdd;
	}
		
	@Override
	public String getRam()
	{return this.ram;
	}
	
	@Override
	public String getHdd()
	{return this.hdd;
	}

}
