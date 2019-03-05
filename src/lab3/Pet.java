package lab3;

public class Pet {
	
	private String name;
	private String owner;
	private int age;
	
	
	public Pet(String n, String o, int a){
		
		this.name = n;
		this.owner = o;
		this.age = a;
		
	}
		public void showDetails(){
			System.out.println("I am a pet. My name is" +this.name + " .My Owner is "+this.owner + ".My age is " +this.age);
		}
		
		public Pet(String n, String o){
			this.name = o;
			this.age = a;
		}
}
