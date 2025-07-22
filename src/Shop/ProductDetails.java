package Shop;

public class ProductDetails {
	private String productName;
	private double productCost;
	private int productQuantity;
	public ProductDetails(String productName,double productCost,int productQuantity) {
		this.productName=productName;
		this.productCost=productCost;
		this.productQuantity=productQuantity;
	}
	
	public double getPrice() {
		return productCost*productQuantity;
	}
	
	public void display() {
		System.out.println(productName+"\t"+productCost+"\t"+productQuantity);
	}
	
}
