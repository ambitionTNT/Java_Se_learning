public class ThisTest03{
	public static void main(String[] args){
		Student s = new Student();
		s.setName("����");
		s.setId("10001");
		System.out.println("������"+s.getName());
		System.out.println("ѧ��:"+s.getId());
	}
}

class Student{
	private String name;
	private String id;

	public Student(){
		
	}

	public Student(String name,String id){
		this.name = name;
		this.name = id;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}



}