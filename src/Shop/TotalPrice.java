package Shop;

public class TotalPrice {
	public static void main(String[] args) {
		ProductDetails items[]= {
				new ProductDetails("Laptop",50000,1),
		
				new ProductDetails("Mouse",1000,3),
		
				new ProductDetails("KeyBoard",3000,2),
		
				new ProductDetails("Bag",500,1),
		};
		
		double grandTotal=0;
		System.out.println("Product\tPrice\tQuantity\tTotal");
		System.out.println("-------------------------------");
		for(ProductDetails item : items) {
			item.display();
			grandTotal+=item.getPrice();
			
		}
		System.out.println("-------------------------------");
		System.out.println("Grand Total is - "+grandTotal);
	}

}
