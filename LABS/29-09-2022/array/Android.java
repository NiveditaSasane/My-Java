package array;

public class Android {
	public static void main(String[]args) {
		AndroidPhone[] obj = new AndroidPhone[3];
		
		obj[0] = new AndroidPhone(5,"Blue");
		obj[1] = new AndroidPhone(4,"Red");
		obj[2] = new AndroidPhone(8,"yellow");
		
	    System.out.println("Vivo");
	    obj[0].display();
	    System.out.println("OPPO");
	    obj[1].display();
	    System.out.println("Redmi");
	    obj[2].display();
	}
    }
    class AndroidPhone
    {
    int RAM;
    String color;
    
    AndroidPhone(int ram, String c)
    {
    	RAM = ram;
    	color = c;
    }
    public void display()
    {
    	System.out.print("RAM size = "+RAM +" "+"color of AndroidPhone = "+color);
    	System.out.println();
    }
    
    }
	


