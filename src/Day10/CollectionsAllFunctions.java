package Day10;

import java.util.ArrayList;

public class CollectionsAllFunctions {
	class Departments{
		private String name;
		private double sales;
		private double expenses;
		
		public Departments(String name,double sales,double expenses) {
			this.expenses=expenses;
			this.name=name;
			this.sales=sales;
		}
		public double getProfit() {
			return sales-expenses;
		}
		
		public String getName() {
			return name;
		}
	}
	public static void main(String[] args) {
		ArrayList<Departments>dept = new ArrayList<CollectionsAllFunctions.Departments>();
		dept.add(new CollectionsAllFunctions().new Departments("Sales", 20000, 15000));
		dept.add(new CollectionsAllFunctions().new Departments("Marketing", 30000, 15000));
		dept.add(new CollectionsAllFunctions().new Departments("Reserch", 20000, 10000));
		dept.add(new CollectionsAllFunctions().new Departments("Producion", 25000, 22000));
		
		for(Departments d : dept) {
			System.out.println(d.getName() + " Profit: " + d.getProfit());
		}
		dept.sort((d1,d2)-> Double.compare(d1.getProfit(),d2.getProfit()));
		System.out.println("----------------Sorting Done------------------");
		
		for( Departments d : dept) {
			System.out.println(d.getName() + " Profit: " + d.getProfit());
		}
	}
}
