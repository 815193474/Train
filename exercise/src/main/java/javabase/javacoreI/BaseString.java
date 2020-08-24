package javabase.javacoreI;

/**
 * @Author luoGuanzhong @Date 2020-08-18 09:14
 *
 * <p>java String API练习 1. substring 方法 ; 2. 字符串的拼接 ‘ + ' ; 3. 检测字符串是否相等 ’ equals ’ ; 4. 空串 与 Null串
 * ; 5. 访问静态变量
 */
public class BaseString {

  public static void main(String[] args) {
    // 1. substring 方法使用
    String str = "hello";
    String str2 = str.substring(0, 3); // 截取字符串下标 大于等于0 小于3的字符串
    System.out.println(str2); // print hel

    // 2. 字符串的拼接  ' + ' 以下代码将“ Expletivedeleted” 赋给变量 message
    String expletive = "Expletive";
    String PC13 = "deleted";
    String message = expletive + PC13;
    /*
     *当将一个字符串与一个非字符串的值进行拼接时，后者被转换成字符串
     */
    int age = 13;
    String rating = "PC" + age;
    System.out.println(rating); // print PC13
    // 字符串拼接 join 方法
    String all = String.join("/", "s", "m", "l");
    System.out.println(all); // print " s/m/l"

    /*
    java 中字符串时不可变的 但是字符串的引用可以改变 这就解决了字符串的修改问题
    java 中不可变字符串的优点是 字符串可以在编译器中共享 弥补了提取字符串和拼接字符串的效率
    */
    String str3 = str2 + "p"; // 先提取，再拼接
    System.out.println(str3); // print help

    /*
     * java 中检测两个个字符串是否相等 equals 方法
     * */
    String str4 = null;
    System.out.println("hello".equals(str4)); // print false
    /*
    System.out.println(str4.equals("hello"));
    不规范 当str 是空值的时候，程序会异常 所以必须将字符串放在前面 变量在后
    */

    // java 中空串 与 Null串
    String str5 = ""; // 空串
    String str6 = " "; // 包含一个空格的字符串
    if (str5.length() == 0) System.out.println(true); // print true
    if (str6.length() == 0) System.out.println(true); // no print
    if ("".equals(str4)) System.out.println(true); // "" 与 null 不相等
    if (str4 == null) System.out.println(true); // print true
    /*检查一个字符串既不是 null 也不为空串*/
    if (str != null && "".equals(str)) System.out.println(true);
    // 或者
    if (str != null && str.length() == 0) System.out.println(true);
    System.out.println(true);

    {
      // 访问静态变量
      System.out.println(six);
      System.out.println(BaseString.six);

      // 实例化对象，访问对象的实例变量 也就是属性
      BaseString baseString = new BaseString();
      System.out.println(baseString.ss);
      // 以下方法也可以访问静态变量
			System.out.println(baseString.six); // 不推荐 其实static变量six 与baseString 没有任何关系 他只属于BaseString类
    }
  }

  static int six = 3; // 静态变量直接可以访问
  int ss = 2; // 实例变量 必须在类对象被实例化以后才可以访问
}
