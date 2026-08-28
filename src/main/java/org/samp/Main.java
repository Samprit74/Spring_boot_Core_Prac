package org.samp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

    Progect prog = new Progect();

    prog.start();
    int i=0;
    for( i=Integer.MIN_VALUE+10;i<5;i--){
        System.out.println(i);
    }

    System.out.println(i);
    System.out.println(i+Integer.MAX_VALUE);

    System.out.println(i+Integer.MIN_VALUE+Double.MAX_VALUE);



        }

}
