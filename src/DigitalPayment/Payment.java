package DigitalPayment;

abstract class Payment {
	
	private String transactionId;
	private double amount;
	private String customerName;
	private String paymentStatus;
	
	public Payment(String transactionId, double amount, String customerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
	}
	
	abstract public boolean validatePayment();
	abstract public boolean processPayment();
	
	public void executeTransaction(){
		
		if (validatePayment()) { 
			if (processPayment()) { 
				setPaymentStatus("Success");
				System.out.println("Payment success.");
			} 
			else {
				setPaymentStatus("Failed");
				System.out.println("Payment failed.");
			} 
		}
		else { 
			setPaymentStatus("Validation Failed");
			System.out.println("Validation Failed");
		} 
		
		generateReceipt();
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	
	public void generateReceipt() {
	    System.out.println("\n========== PAYMENT RECEIPT ==========");
	    System.out.println("Transaction ID : " + transactionId);
	    System.out.println("Customer Name  : " + customerName);
	    System.out.println("Amount         : ₹" + amount);
	    System.out.println("Payment Status : " + paymentStatus);
	    System.out.println("=====================================");
	}
	
	
}

