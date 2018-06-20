package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author: jbwang0106
 * @description: function
 * @create: 2018-06-19 22:10
 **/
public class FunctionDemo2 {

    public static void main(String[] args) {

        //1. 断言函数接口，接受一个参数，返回一个boolean类型的结果
        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(10));

        //2. 消费接口，接受一个参数，没有返回值
        Consumer<String> consumer = s -> System.out.println("hello " + s);
        consumer.accept("world");

        //3. apply方法的接口，接受一个参数，返回另一个类型的参数
        Function<Integer, String> function = integer -> {
            if (null != integer) {
                return integer + "00000";
            }

            return integer + "";
        };

        String result = function.apply(10);
        System.out.println(result);
    }
}
