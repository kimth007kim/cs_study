package thisex;


class Person{
	String name;
	int age;
	
	public Person() {
//		int i=0; 
//		�����ڿ��� ������ ȣ���Ҷ��� �ٸ� ������ �տ� ��� �͵� �ü�����.
		this("�̸�����",1);
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
	}

}