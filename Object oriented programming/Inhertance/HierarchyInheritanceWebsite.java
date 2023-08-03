class UserDetail{
	
	void fatherName(){
	System.out.println("Gulam Ali ");
	}
	
	void name(){
	System.out.println("Wazir");
	}
	
	void mobileNo(){
		System.out.println("021012");
	}
}

class OrderConfirmation extends UserDetail{
	
	void orderNo(){
	System.out.println("a87dac667");
	}
}

class OrderArchive extends UserDetail{
	void orderDate(){
	System.out.println("10/1/2023");
	}
}
class HierarchyInheritanceWebsite{
	public static void main (String args[]){
	
	OrderConfirmation ordConfirm = new OrderConfirmation();
	OrderArchive ordArchive = new OrderArchive();
	
	ordConfirm.fatherName();
	ordConfirm.name();
	ordConfirm.mobileNo();
	ordConfirm.orderNo();
	

	
	ordArchive.fatherName();
	ordArchive.name();
	ordArchive.mobileNo();
	ordArchive.orderDate();
	
	
	
	
	}
}