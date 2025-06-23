package oops;

public class Encapsulation {
	private String model;
	private String ResgNo;
	private boolean isAvailable;
	
	public Encapsulation (String model,String ResgNo,boolean isAvailable){
		this.model=model;
		this.ResgNo=ResgNo;
		this.isAvailable=isAvailable;
	}
	public String getModel() {
		return model;
	}
	public String getResgNo() {
		return ResgNo;
	}
	public boolean getisAvailable(){
		return isAvailable;
	}
	public void rentCar() {
		if(isAvailable) {
			System.out.println(model+" "+ ResgNo+ "Car is Available");
		}else {
			System.out.println(model+" "+ ResgNo+ "it has been taken");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj=new Encapsulation("TATA","KA04BH5489", false);
		System.out.println("CarModel:"+obj.getModel());
		System.out.println("Reg No:"+obj.getResgNo());
		System.out.println("Is it Available:"+obj.getisAvailable());

	}

}
