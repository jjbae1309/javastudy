package dad01.datastructure02;

public class Person implements Comparable<Person> {
	// �ʵ�
	private String name;
	private int age;
	private String gender;
	private String address;
	private String phone;
	
	// ������. �����ڴ� �������� �ɼ� ����
	public Person() {
	}
	
	public Person(String name, int age, String gender, String address, String phone) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}
	
	// �޼ҵ�
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "�̸�=" + name + ", ����=" + age + ", ����=" + gender + ", �ּ�=" + address + ", ��ȭ��ȣ=" + phone;
	}

	@Override
	public int compareTo(Person o) {	
		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;
		else 
			return this.phone.compareTo(o.phone);
	}
}
