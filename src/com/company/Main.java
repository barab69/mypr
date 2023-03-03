package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Comp kkk=new Comp();
      kkk.setMproc("Intel");
      System.out.println(kkk.getMproc());
      kkk.Vivod();
      kkk.Rabota(scan);


     // Comp kkm=new Comp("I8");
  }
}
