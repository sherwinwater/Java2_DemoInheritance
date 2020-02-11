package demoinheritance;

import content.AnotherGrand;
import content.GrandChild;
import content.TheChild;
import content.TheParent;

public class Main {

    public static void main(String[] args) {
        TheParent one = new TheParent();
        System.out.println("parent " + one.printStuff());

        TheChild two = new TheChild();
        System.out.println("child " + two.printStuff());

        GrandChild three = new GrandChild();
        System.out.println("Grandchild " + three.printStuff());

        AnotherGrand four = new AnotherGrand();
        System.out.println("AnotherGrandchild " + four.printStuff());

        C c1 = new C();
        System.out.println("c " + c1.printC());

//        System.out.println(one.printChild()); // not access
        System.out.println(two.printChild());
        System.out.println(three.printChild());
        System.out.println(four.printChild());
        
//                System.out.println(one.printGrand()); // not access
//        System.out.println(two.printGrand());
        System.out.println(three.printGrand());
//        System.out.println(four.printGrand()); // not access
        

    }

}
