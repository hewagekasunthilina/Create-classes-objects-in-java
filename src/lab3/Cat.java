package lab3;

public class Cat extends Pet{
	
	private int livesLeft;
	public Cat(String n, String o, int a, int i){
		
		super(n,o,a);
		this.livesLeft = 1;
	}
	
	public Cat(String n, String o){
		super(n,o,a);
		this.livesLeft = 7;
	}
	
	public void showCatDetails(){
		super.showDetails();
		
		System.out.println("livesLeft :"+livesLeft);
	}
}