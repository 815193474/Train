package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-18 11:50
 *
 * <p>String 常用的方法
 */
public class StringAPIs {
  public static void main(String[] args) {

    String str = "hello";
    /*
    char charAt (int index)
    返回给定位置的代码单元。除非对底层的代码单元感兴趣， 否则不需要调用这个方法
    说白了一个代码点就是一个Unicode字符。代码单元就是代码点的集合。
    */
    System.out.println(str.charAt(0)); // print h

    /*
    int codePointAt(int Index)
    返回从给定位置开始的码点。
    */
    System.out.println(str.codePointAt(0)); // print 104 对应ASCII 码表中的h

    /*
    int offsetByCodePoints(int startIndex, int cpCount)
    返回从 startIndex 代码点开始，位移 cpCount 后的码点索引
    */
    System.out.println(str.offsetByCodePoints(1, 2)); // print 3

    /*
    int compareTo(String other)
    按照字典顺序，如果字符串位于 other 之前， 返回一个负数；如果字符串位于 other 之
    后，返回一个正数；如果两个字符串相等，返回 0。
    */
    System.out.println(str.compareTo("hello")); // print 0

    /*
     boolean equals(object other)
    如果字符串与 other 相等， 返回 true。
    */
    System.out.println(("hello").equals(str)); // print true

    /*
    boolean equalsIgnoreCase(String other )
    如果字符串与 other 相等 （ 忽略大小写，) 返回 true
    */
    System.out.println(("HELLO").equalsIgnoreCase(str)); // print true

    /*
     boolean startsWith(String prefix )
    boolean endsWith(String suffix )
     如果字符串以 prefix/suffix 开头或结尾， 则返回 true。
     */
    System.out.println(str.startsWith("he")); // print true
    System.out.println(str.endsWith("o")); // print true

    /*
    int indexOf(String str)
    int indexOf(String str, int fromIndex )
    int indexOf(int cp)
    int indexOf(int cp, int fromIndex )
    返回与字符串 str 或代码点 cp 匹配的第一个子串的开始位置。这个位置从索引 0 或 fromIndex (包含fromIndex）开始计算。
    如果在原始串中不存在 str，返回 -1
    */
    System.out.println(str.indexOf("l")); // print 2
    System.out.println(str.indexOf("l", 3)); // print 3
    System.out.println(str.indexOf("l", 4)); // print -1 不存在字符串

    /*
    int lastIndexOf(String str)
    int lastIndexOf(String str, int fromIndex )
    int lastIndexOf(int cp)
    int lastIndexOf(int cp, int fromIndex )
    返回与字符串 str 或代码点 cp 匹配的最后一个子串的开始位置。 这个位置从原始串尾端或 fromIndex 开始‘从右往左’计算
    */
    System.out.println(str.lastIndexOf("l")); // print 3
    System.out.println(str.lastIndexOf("l", 3)); // print 3 hello
    System.out.println(str.lastIndexOf("l", 4)); // print 3 hello

    /*
    int length()
     返回字符串的長度
     */
    System.out.println(str.length());

    /*
     String replace( CharSequence oldString,CharSequence newString)
    返回一个新字符串。这个字符串用 newString 代替原始字符串中所有的 oldString。可
    以用 String 或 StringBuilder 对象作为 CharSequence 参数。
     */
    System.out.println(str.replace("lo", "p")); // print help

    /*
    String substring(int beginIndex )
    String substring(int beginIndex, int endIndex )
    返回一个新字符串。这个字符串包含原始字符串中从 beginIndex 到串尾或 endIndex-1
    的所有代码单元
    */
    System.out.println(str.substring(1)); // print ello
    System.out.println(str.substring(1, 3)); // print el

    /*
    String toLowerCase()
    String toUpperCase()
    返回一个新字符串。 这个字符串将原始字符串中的大写字母改为小写，或者将原始字
    符串中的所有小写字母改成了大写字母。
    */
    System.out.println(str.toUpperCase()); // print HELLO

    /*
    String trim()
    返回一个新字符串。这个字符串将删除了原始字符串头部和尾部的空格
    */
    System.out.println((" hello ").trim()); // print hello

    /*
    String join(CharSequence delimiter, CharSequence ... elements )
    返回一个新字符串， 用给定的定界符连接所有元素
    */
    System.out.println(String.join("-","h","e","l","l","o")); // print h-e-l-l-o
  }
}
