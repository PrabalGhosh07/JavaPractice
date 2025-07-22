package EcomPaymentSystem;

import EmployeePlayrollSystem.PayRoleSystem;

interface PayemntsMethod {
	void pay(double amount);
}

class UPIpayment implements PayemntsMethod{
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+"via UPI");
	}
}

class CreditCardPayment implements PayemntsMethod{
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+"via Your Credit Card");
	}
}

class CashonDelivery implements PayemntsMethod{
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+"via will be collected on delivery.");
	}
}


