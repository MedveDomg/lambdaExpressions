import java.io.IOException;

/**
 * Created by Вадим on 08.02.2016.
 */
public class Main {
    interface MyInterface {
        String hi();
    }

    public static void main(String[] args) throws IOException {
        MyInterface test = () -> {

            return "hi";
        };
        System.out.println(test.hi());

    }
}

