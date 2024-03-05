package quiz_PersonEx;

public class PersonEx {
	public static void main(String[] args) {
		Professor pro = new Professor();
		
		pro.setPhone("010-111-1222");
		System.out.println(pro.getPhone());
		Person p = pro;		//promotion
		System.out.println(p.getPhone());
	}
}
