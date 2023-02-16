package StreamAPI.optional;

import java.util.Optional;

/**
 * @ClassName NewMan
 * @Description TODO
 * @Author long
 * @Date 2023/1/9 18:59
 * @Version 1.0
 **/
public class NewMan {
    private Optional<Godness> godness = Optional.empty();

    public NewMan(Optional<Godness> godness) {

        this.godness = godness;
    }

    public NewMan() {
    }

    public Optional<Godness> getGodness() {
        return godness;
    }

    public void setGodness(Optional<Godness> godness) {
        this.godness = godness;
    }
}
