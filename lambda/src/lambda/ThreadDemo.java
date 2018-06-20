package lambda;

/**
 * @author: jbwang0106
 * @description: thread
 * @create: 2018-06-19 21:41
 **/
public class ThreadDemo {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("hello lambda")).start();

    }
}
