package Java_programs;

public class Ass93_Encapsulation 
{
	private int OTP = 3266;
	private String name = "bhavani";
	
	public int getOTP() 
	{
		return OTP;
	}

	public void setOTP(int OTP) 
	{
		this.OTP = OTP;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public static void main(String[] args) 
	{
		Ass93_Encapsulation obj = new Ass93_Encapsulation();
		obj.setOTP(6776);
		obj.setName("mrya");
		System.out.println(obj.getOTP());
		System.out.println(obj.getName());

	}
}
