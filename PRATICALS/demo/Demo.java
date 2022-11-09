package demo;

public class Demo {
	private final String name;
	public Demo(String name) {
		this.name = name;
		
	}
	 public String getName() {
		 return this.name;
	 }
	 public synchronized void call(Demo caller) {
		 System.out.println(this.getName() + "has asked to call me"+ caller.getName());
	    try {
	    	Thread.sleep(100);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    	
	    }
	    caller.callMe(this);
	 }
	 public synchronized void callMe(Demo caller) {
		 System.out.println(this.getName() + "has called me" + caller.getName());
		 
	 }
	public static void main(String[] args) {
		Demo caller1 = new Demo("caller-1");
		Demo caller2 = new Demo("caller-2");
		
		new Thread(new Runnable(){
			public void run() {
				caller1.call(caller2);}
			}).start();
			
			new Thread(new Runnable() {
				public void run() {
					caller2.call(caller1);}
				}).start();	
		}

	}


