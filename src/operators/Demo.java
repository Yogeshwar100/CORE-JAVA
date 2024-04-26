package operators;

class Student {

	int stId;
	String stName;
	String stAddr;

	public Student(int stId, String stName, String stAddr) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stAddr = stAddr;
	}

}

class Customer {
	int custId;
	String custName;
	String custAddr;

	public Customer(int custId, String custName, String custAddr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddr = custAddr;
	}

}

public class Demo {

	public static void main(String[] args) {

		Object[] objArr = new Object[5];
		objArr[0] = new Student(101, "Akash Jadhav", "Pune, Maharashtra");
		objArr[1] = new Customer(20152, "Neha Kulkarni", "Mumbai, Maharashtra");

		Object o = objArr[1];
		if (o instanceof Student) {
			Student student = (Student) o;
			System.out.println("It is an instance of Student"+o);
			System.out.println("Student ID: " + student.stId);
			System.out.println("Student Name: " + student.stName);
			System.out.println("Student Address: " + student.stAddr);
		} else if (o instanceof Customer) {
			Customer customer = (Customer) o;
            System.out.println("It is an instance of Customer"+o);
            System.out.println("Customer ID: " + customer.custId);
            System.out.println("Customer Name: " + customer.custName);
            System.out.println("Customer Address: " + customer.custAddr);
		}
		
	}

}
