//Ĭ�ϼ̳�Object��Object��������Щ�����أ�
/*
public class Object {
	 
	 // ע�⣺��Դ�뵱��һ�������ԡ�;����β���������η��б����С�native���ؼ���
	 // ��ʾ�ײ����C++д��dll����dll��̬���ӿ��ļ���
    private static native void registerNatives();

	 // ��̬�����
    static {
		  // ����registerNatives()������
        registerNatives();
    }

	 // �޲������췽��
    @HotSpotIntrinsicCandidate
    public Object() {}

	 // �ײ�Ҳ�ǵ���C++
    @HotSpotIntrinsicCandidate
    public final native Class<?> getClass();

	 // �ײ�Ҳ�ǵ���C++
    @HotSpotIntrinsicCandidate
    public native int hashCode();

	 // equals������Ӧ���ܿ�����
	 // public�ǹ�����
	 // boolean �Ƿ����ķ���ֵ����
	 // equals ��һ�������������
	 // (Object obj) �β�
	 // ֻ����Ŀǰ����֪������������ڵ����塣
    public boolean equals(Object obj) {
		 //������
       return (this == obj);
    }
    
	 // ���ж���a���봴��һ����aһģһ���Ķ�������Ե��������¡������
	 // �ײ�Ҳ�ǵ���C++
    @HotSpotIntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;

	 // һ�����ǿ��Բ���һ��toString()������
	 // public��ʾ������
	 // String �Ƿ���ֵ���ͣ�toString()����ִ�н���֮�󷵻�һ���ַ�����
	 // toString ���Ƿ�������
	 // () ��ʾ�βθ���Ϊ0
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
	//ExtendsTest05Ĭ�ϼ̳�Object
	// ExtendsTest05�൱������toString()����
	// ����toString()������һ��ʵ����������Ҫ����������ܵ��á�
	/*
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	*/
	public static void main(String[] args){
		// ��������������ִ����
		//ExtendsTest04.toString();//������ toString��һ��ʵ�����������Բ���ʹ������.�ķ�ʽ���ʡ�
		ExtendsTest04 et = new ExtendsTest04();
		System.out.println(et.toString());
		System.out.println(et);

		Product pro = new Product();
		System.out.println(pro);// println�������Զ�����pro��toString()������
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