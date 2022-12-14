//默认继承Object，Object类中有哪些方法呢？
/*
public class Object {
	 
	 // 注意：当源码当中一个方法以“;”结尾，并且修饰符列表中有“native”关键字
	 // 表示底层调用C++写的dll程序（dll动态链接库文件）
    private static native void registerNatives();

	 // 静态代码块
    static {
		  // 调用registerNatives()方法。
        registerNatives();
    }

	 // 无参数构造方法
    @HotSpotIntrinsicCandidate
    public Object() {}

	 // 底层也是调用C++
    @HotSpotIntrinsicCandidate
    public final native Class<?> getClass();

	 // 底层也是调用C++
    @HotSpotIntrinsicCandidate
    public native int hashCode();

	 // equals方法你应该能看懂。
	 // public是公开的
	 // boolean 是方法的返回值类型
	 // equals 是一个方法名：相等
	 // (Object obj) 形参
	 // 只不过目前还不知道这个方法存在的意义。
    public boolean equals(Object obj) {
		 //方法体
       return (this == obj);
    }
    
	 // 已有对象a，想创建一个和a一模一样的对象，你可以调用这个克隆方法。
	 // 底层也是调用C++
    @HotSpotIntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;

	 // 一会我们可以测试一下toString()方法。
	 // public表示公共的
	 // String 是返回值类型，toString()方法执行结束之后返回一个字符串。
	 // toString 这是方法名。
	 // () 表示形参个数为0
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @HotSpotIntrinsicCandidate
    public final native void notify();

    @HotSpotIntrinsicCandidate
    public final native void notifyAll();

    public final void wait() throws InterruptedException {
        wait(0L);
    }

    public final native void wait(long timeoutMillis) throws InterruptedException;

    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }

        wait(timeoutMillis);
    }
    @Deprecated(since="9")
    protected void finalize() throws Throwable { }
}
*/

public class ExtendsTest04{
	//ExtendsTest05默认继承Object
	// ExtendsTest05类当中是有toString()方法
	// 不过toString()方法是一个实例方法，需要创建对象才能调用。
	/*
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	*/
	public static void main(String[] args){
		// 分析这个代码可以执行吗？
		//ExtendsTest04.toString();//不可以 toString是一个实例方法，所以不能使用类名.的方式方问。
		ExtendsTest04 et = new ExtendsTest04();
		System.out.println(et.toString());
		System.out.println(et);

		Product pro = new Product();
		System.out.println(pro);// println方法会自动调用pro的toString()方法。
	}
}

	}
}



class Product{
	/*
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	*/
}