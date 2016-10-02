package pl.jrola.trainings.interfaces.constants;

/**
 * Created by JrQ- on 2016-10-03.
 */
public class Example {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        System.out.println("Value overridden in class: " + testClass.B);
        System.out.println("Value declared in interface: " + testClass.A);

    }

}
