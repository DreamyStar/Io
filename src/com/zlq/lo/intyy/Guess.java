package com.zlq.lo.intyy;

public class Guess {
  private int a = 100;

   public static void main(String[] args) {
      int num;
      Guess g = new Guess();
      num = 101;
      g.game(num);
      num = 99;
      g.game(num);
      num = 100;
      g.game(num);
   }
   public void guess(){
      System.out.println("创建");
   }
   public void game(int num){
      if (num < a){
         System.out.println("有点小");
         System.out.println(num);
      }else if(num > a){
         System.out.println("有点大了");
         System.out.println(num);
      }else {
         System.out.println("对了");
         System.out.println(num);
      }
   }
}
