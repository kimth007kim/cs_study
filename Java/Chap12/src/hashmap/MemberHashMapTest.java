package hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee =new Member(101,"�̼���");
		Member memberKim =new Member(102,"������");
		Member memberShin =new Member(103,"�Ż��Ӵ�");
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberShin);
		
		memberHashMap.showAllMember();
		Member memberLee2 =new Member(101,"�̸���");
		memberHashMap.addMember(memberLee2);
		memberHashMap.showAllMember();



	}

}
