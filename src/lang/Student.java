package lang;

public class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			if (obj instanceof Student) {
				Student s = (Student) obj;
			
			if ((this.rollNo == s.rollNo) && ((this.name).equals(s.name))) {
				return true;
			} else {
				return false;
			}
			}
			else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "Akash");
		Student s2 = new Student(102, "Sanjana");
		Student s3 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(null));
	}

}