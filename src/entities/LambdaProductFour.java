package entities;

public class LambdaProductFour {
	private String name;
	private Double price;
	
	public LambdaProductFour(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	public static String staticUpperCaseName(LambdaProductFour p) {
		return p.getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
