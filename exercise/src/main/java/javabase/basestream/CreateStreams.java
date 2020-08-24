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
 * @Author luoGuanzhong
 * @Date 2020-08-15 18:11
 */
public class CreateStreams {
    // 声明为静态变量可以在main方法中调用 声明为public 可以在其他类中访问
    public static final int SIZE = 10; // 常量命名規範 常量名称必须全部大写 且常量一旦被赋值不允许被修改
    public static <T> void show(String title, Stream<T> stream){

        List<T> firstElements = stream.limit(SIZE+1).collect(Collectors.toList());
    System.out.println(title + ": ");
    for (int i = 0;i < firstElements.size(); i++){
      if (i > 0) System.out.println(" ,");
      if (i < SIZE) System.out.println(firstElements.get(i));
      else System.out.println("...");
    }
    System.out.println();
    }

  public static void main(String[] args) throws IOException {
    // Path 是接口类 Paths 是接口实现类
    Path path = Paths.get("F:\\vscode_space\\data.sql");
    // Files.readAllBytes() 底层也是InputStream 实现的
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
