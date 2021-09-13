package edu.cnm.deepdive;

public class HelloWorld {

  public static void main(String[] args) {
    greet("Hello, " + target(args) + "!");
  }

  private static String target(String[] args) {
    return (args.length > 0) ? args[0] : "world";

  }
 private static void greet(String greeting) {
    System.out.println(greeting);
 }
}
