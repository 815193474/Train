package javabase.basetype;

/**
 * @Author luoGuanzhong
 * @Date 2020-08-10 14:19
 */
public class Shorttype {
  public static void main(String[] args) {
    //
  int i = 4,j =10,x = 15;
  switch(j-i){
      case 5:
          x++;
      case 6:
          x+=2;
      case 7:
          x+=3;
          default:
              --x;
  }
    System.out.println(x);
  }
}
