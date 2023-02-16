package StreamAPI.optional;

/**
 * @ClassName Man
 * @Description TODO
 * @Author long
 * @Date 2023/1/9 18:51
 * @Version 1.0
 **/
public class Man {
    private Godness godness;

    public Man() {
    }

    public Man(Godness godness) {
        this.godness = godness;
    }

    public Godness getGodness() {
        return godness;
    }


    public void setGodness(Godness godness) {
        this.godness = godness;
    }
}
