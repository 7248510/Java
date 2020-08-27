//Brushing up on Java, It's been a while since I've programmed in it! C++ and python have been my main languages over the summer
import java.io.*;
import java.lang.*; //Caused by: java.lang.ClassNotFoundException: secondClass.class?
//When dealing with multiple classes you cannot call java on the cli, you have to compile both the files. [javac hello.java]!
//Unlike C++'s structures Java has classes, they feel very similar regardless
//javac hello.java
//java hello [Running Java is a lot easier than CPP, you don't have an executable since it's run in the JVM! If your having class errors, hint hint]
class secondClass {
    int a;
    int b;
}
class hello {
    public static void main(String args[]) //Not passing any arguments on the command line.
    {
        secondClass test = new secondClass();
        test.a = 100;
        test.b = 200;
        int compl = test.a + test.b;
        int x = 9000;
        int x2 = 2333;
        double z = 322.455;
        int shift1 = 4;
        int shift2 = 8;
        String y = "Java feels like C++! Fortunately OOP concepts transfer nicely.\n";
        System.out.print(45+"\n");
        System.out.print(x+"\n");
        System.out.print(shift1 << shift2); //8^4/4 = 1024 | in the case of shift1 = 4, shift2 = 8, still working out the logic
        System.out.print("\n" + compl);
    }
}