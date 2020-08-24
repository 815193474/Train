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
    // ����Ϊ��̬����������main�����е��� ����Ϊpublic �������������з���
    public static final int SIZE = 10; // ��������Ҏ�� �������Ʊ���ȫ����д �ҳ���һ������ֵ�������޸�
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
    // Path �ǽӿ��� Paths �ǽӿ�ʵ����
    Path path = Paths.get("F:\\vscode_space\\data.sql");
    // Files.readAllBytes() �ײ�Ҳ��InputStream ʵ�ֵ�
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
