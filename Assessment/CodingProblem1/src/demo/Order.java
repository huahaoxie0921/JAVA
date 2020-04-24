package demo;

public class Order {
	
	private int id;
	private String state;
	
	Order(int id) {
		this.id = id;
		this.state = "NEW";
		System.out.println("Order " + id + " has been CREATED");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
