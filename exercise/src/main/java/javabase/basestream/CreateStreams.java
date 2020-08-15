package javabase.basestream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author luoguanzhong
 * @Data 2020-08-15 18:11
 */
public class CreateStreams {
    public static <T> void show(String title, Stream<T> stream){
        final int size = 10;
        List<T> firstElements = stream.limit(size+1).collect(Collectors.toList());
    System.out.println(title + ": ");
    for (int i = 0;i < firstElements.size(); i++){
      if (i > 0) System.out.println(" ,");
      if (i < size) System.out.println(firstElements.get(i));
      else System.out.println("...");
    }
    System.out.println();
    }

  public static void main(String[] args) throws IOException {
    //
    Path path = Paths.get("F:\\vscode_space\\data.sql");
      String content = new String(Files.readAllBytes(path) , StandardCharsets.UTF_8);
      Stream<String> words = Stream.of(content.split("\\PL+"));
      show("words",words);
      Stream<String> song = Stream.of("gently","down","the","stream");
      show("song",song);
      Stream<String> silence = Stream.empty();
      show("silence",silence);
      Stream<String> echos = Stream.generate(() -> "echo");
      show("echos",echos);
      Stream<Double> randoms = Stream.generate(Math::random);
      show("randoms",randoms);

  }
}
