import java.util.Objects;

public class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return this.year+"年"+this.month+"月"+this.day+"日";
    }

    /*@Override
    public boolean equals(Object o) {
        *//*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year &&
                month == myTime.month &&
                day == myTime.day;*//*
        // 当年相同，月相同，并且日也相同的时候，表示两个日期相同。两个对象相等。
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;
        if(o instanceof MyTime){
            MyTime mt = (MyTime)o;
            if(year1==mt.year&&month1==mt.month&&mt.day==day1){
                return true;
            }else {
                return false;
            }
        }
        // 程序能够执行到此处表示日期不相等。
        return false;
    }*/
    //改良1
    /*@Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof MyTime)){
            return false;
        }
        if(this ==obj){
            return true;
        }
        MyTime mt = (MyTime)obj;
        if(this.year == mt.year&&this.month ==  mt.month&&this.day == mt.day){
            return true;
        }
        return false;



    }
*/
    //改良2

    @Override
    public boolean equals(Object o) {
        if(o==null&&!(o instanceof MyTime)){
            return false;
        }
        if(o == this){
            return true;
        }
        MyTime mt = (MyTime)o;

        return this.year == mt.year&&this.month ==  mt.month&&this.day == mt.day;

    }


    /*@Override
    //官方
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year &&
                month == myTime.month &&
                day == myTime.day;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
