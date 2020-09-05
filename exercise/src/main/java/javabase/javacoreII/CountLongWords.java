package javabase.javacoreII;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-15 15:12
 */
public class CountLongWords {
  public static void main(String[] args) throws IOException {
    //
    String contents =
        new String(Files.readAllBytes(Paths.get("F:\\vscode_space\\data.sql")), StandardCharsets.UTF_8);
      List<String> words= Arrays.asList(contents.split("\\PL+"));
      long count = 0;
      for (String word:words){
          if (word.length() > 3) count++;
      }
    // () 代表定义一个函数 lambda表达式的简写
    Runnable hh = () -> System.out.println("s");

    System.out.println(count);
    // 以下写法和上面for循环表达的意思一致
      count = words.stream().filter(w -> w.length() > 3).count(); // 串行 先执行过滤器 然后count()
    System.out.println(count);
        count = words.parallelStream().filter(w -> w.length() > 3).count(); // 并行 过滤器和count()同时执行
    System.out.println(count);
    hh.run();
  
  
  }
}
