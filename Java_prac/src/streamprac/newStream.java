package streamprac;

import java.util.stream.Stream;

public class newStream {

    public static void main(String[] args) {
        newStream();
    }

    static void newStream(){

        Stream<String> stream = Stream.of("A", "B", "C", "D");

        stream.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
