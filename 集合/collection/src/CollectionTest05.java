import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("Jack");
        c.add(u1);
        User u2 = new User("Jack");

        System.out.println(c.contains(u2));//true,因为重写了 User的equals方法 ，底层调用的就是User
        //方法，不重写的话，是false

    }
}
class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}