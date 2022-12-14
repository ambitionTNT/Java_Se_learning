/*
	Person表示人类：
		每一个人都有年龄这样的属性。
		年龄age，int类型。
	
	我这里先不使用封装机制，分析程序存在什么缺点？
		Person类的age属性对外暴露，可以在外部程序中随意访问，导致了不安全。
	
	怎么解决这个问题？
		封装。
*/

// 这是没有封装的Person。
/*
public class Person{
	// 实例变量(属性)
	int age;//该属性是暴露的，在外部程序中可以随意访问。导致了不安全。

}
*/
// 尝试封装一下
// 不再对外暴露复杂的数据，封装起来
// 对外只提供简单的操作入口。
// 优点：第一数据安全了。第二调用者也方便了。


public class Person{
	// private 表示私有的，被这个关键字修饰之后，该数据只能在本类中访问。
	// 出了这个类，age属性就无法访问了。私有的。
	private int age;//每个人的年龄不同，对象级别的属性
	/*
		对外提供访问的接口电视机的遥控器就相当于是电视机的访问入口，简单明了。)
		外部程序只能调用一下代码来完成访问。
		思考：你应该对外提供几个访问入口?
		思考：这些操作入口是否应该是方法呢？
		写一个专门用来读的。get
		写一个专门用来改的。set
		get和set方法应该带有static，还是不应该有static,
		get和set方法应该定义为实例方法吗？
		封装第二步，对外提供公开的set方法和get方法作为操作入口。并且都不带static。都是实例方法。
		
		[修饰符列表] 返回值类型 方法名(形式参数列表){
		}


		java开发规范中有要求，set方法和get方法要满足以下格式。
				get方法的要求：
					public 返回值类型 get+属性名首字母大写(无参){
						return xxx;
					}
				set方法的要求：
					public void set+属性名首字母大写(有1个参数){
						xxx = 参数;
					}
			
			大家尽量按照java规范中要求的格式提供set和get方法。
			如果不按照这个规范格式来，那么你的程序将不是一个通用的程序。
	*/
	

	//get 方法
	public int getAge(){
		return age;
	}

	//set 方法
	public void setAge(int _age){
		if(_age<0||_age>140){
			System.out.println("更改的值不合法");
			return ;
		}
		age = _age;
			
	}

}