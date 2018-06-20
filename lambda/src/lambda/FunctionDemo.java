package lambda;

import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * @author: jbwang0106
 * @description: function 函数接口
 * @create: 2018-06-19 22:02
 **/
public class FunctionDemo {

    public static void main(String[] args) {

        Money money = new Money(9999999);

        Function<Integer, String> function = integer -> new DecimalFormat("#,###").format(integer);

        money.print(function.andThen(s -> "美元 " + s));


    }

}


class Money {

    private int price;

    public Money(int price) {
        this.price = price;
    }

    public void print(Function<Integer, String> function) {
        System.out.println("我的身价为：" + function.apply(price));
    }

}
