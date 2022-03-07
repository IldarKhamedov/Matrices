import java.util.Random;

public class Number implements Elements<Integer>{
    @Override
    public Integer createElement() {
        return new Random().nextInt(10);
    }
}
