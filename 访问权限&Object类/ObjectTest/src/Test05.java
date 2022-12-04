import java.util.Objects;

public class Test05 {
    public static void main(String[] args) {
        Object o1 = new String("hello world!");
        Object o2 = new User();
        Object o3 = new Address();
        User u1 = new User("zhangsan",new Address("北京","大兴区","11111"));
        User u2 = new User("zhangsan", new Address("北京","大兴区","11111"));
        System.out.println(u1.equals(u2));
        User u3 = new User("zhangsan", new Address("北京","朝阳区","11112"));
        System.out.println(u1.equals(u3)); // false
    }
}

class User{
    String name;
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return
                "name:'" + name + '\n' +
                "city:"+getAddr().city+"\n" + "street:"+getAddr().street+"\n"+
                        "zipcode:"+getAddr().zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null&&!(o instanceof User)) return false;
        User user = (User)o;
        return this.name.equals(user.name)&&this.getAddr().equals(user.getAddr());

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr);
    }
}
class Address{
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode;
    }

    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null&&!(o instanceof Address))  return false;
        Address address = (Address)o;
        return this.city==address.city&&this.street==address.street&&
                this.zipcode==address.zipcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcode);
    }
}