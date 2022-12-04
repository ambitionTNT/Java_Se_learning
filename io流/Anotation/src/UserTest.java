import java.lang.reflect.Field;
import java.util.IdentityHashMap;

public class UserTest {
    public static void main(String[] args) {
        try {
            Class userClass = Class.forName("User");
            if (userClass.isAnnotationPresent(Id.class)){
                //当一个类上面有@Id注解的时候，要求类中必须存在Int类型的id属性
                //如果没有int类型的id属性则报异常.
                //获取类的属性
                Field[] fields = userClass.getDeclaredFields();
                boolean isOk = false;
                for(Field field :fields){
                    if ("id".equals(field.getName())&&"int".equals(field.getType().getSimpleName())){
                        //表示这个类是合法的类。有@Id注解，则这个类中必须有Int类型的id.
                        isOk = true;
                        break;
                    }
                }
                if (!isOk){
                    throw new HasNotPropertyException("被@Id注解标注的类中，必须要有一个int类型的id属性");
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
