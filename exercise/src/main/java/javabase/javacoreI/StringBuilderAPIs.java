package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-18 15:52
 *
 * <p>StringBuilder 常用方法
 *
 * <p>在 JDK5.0 中引入 StringBuilder 类。 这个类的前身是 StringBuffer, 其效率稍有些低， 但允许采用多线程的方式执行添加或删除字符的操作
 * 如果所有字符串在一个单线 程中编辑 （通常都是这样) ， 则应该用 StringBuilder 替代它。 这两个类的 API是相同的
 *
 * <p>有些时候， 需要由较短的字符串构建字符串， 例如，采用字 符串连接的方式达到此目的效率比较低。 每次连接字符串，都会构建一个新的 String 对象， 既耗时，又浪费空间。使用
 * StringBuilder 类就可以避免这个问题的发生。
 */
public class StringBuilderAPIs {
  public static void main(String[] args) {
    /*
    StringBuilder()
    构造一个空的字符串构建器。
    */
    StringBuilder stringBuilder = new StringBuilder();

    /*
    StringBuilder append(String str)
    追加一个字符串并返回 this。
    StringBuilder append(char c)
    追加一个代码单元并返回 this。
    */
    stringBuilder.append("hello");
    stringBuilder.append("World");
    System.out.println(stringBuilder); // print helloWorld

    /*
    int length()
    返回构建器或缓冲器中的代码单元数量。
    */
    System.out.println(stringBuilder.length()); // print 10

    /*
    StringBuilder appendCodePoint(int cp)
    追加一个代码点，并将其转换为一个或两个代码单元并返回 this。
    */
    System.out.println(stringBuilder.appendCodePoint(104)); // print helloWorldh h 在ASCII中值是104

    /*
     void setCharAt(int i ,char c)
    		将第 i 个代码单元设置为 c。
    */
    stringBuilder.setCharAt(1, 'a'); // 将e 修改为 a
    System.out.println(stringBuilder); // print halloWorldh

    /*
    StringBuilder insert(int offset,String str)
    在 offset 位置插入一个字符串并返回 this。
    */

    System.out.println(stringBuilder.insert(0, "n")); // print nhalloWorldh

    /*
     StringBuilder insert(int offset,Char c)
    在 offset 位置插入一个代码单元并返回 this。
    */
    System.out.println(stringBuilder.insert(0, 's')); // print shhalloWorldh

    /*
    StringBuilder delete(int startIndex,int endIndex)
    删除偏移量从 startIndex 到 -endIndex-1 的代码单元并返回 this。
    */
    System.out.println(stringBuilder.delete(0, 2));
	
		/*
		 * deleteCharAt(int index)
		 * 删除指定位置char
		 * */
    /*
    String toString()
    返回一个与构建器或缓冲器内容相同的字符串
    */
    System.out.println(stringBuilder.toString());
  }
}
