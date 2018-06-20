package lambda;

import java.util.function.Function;

/**
 * @author: jbwang0106
 * @description: curry-级联表达式和柯里化
 * @create: 2018-06-20 22:02
 **/
public class CurryDemo {

    public static void main(String[] args) {
        //级联表达式
        Function<Integer, Function<Integer, Integer>> function = x -> y -> x + y;
        System.out.println(function.apply(1).apply(2));

        Function<Integer, Function<Integer, Function<Integer, Integer>>> fun1 = x -> y -> z -> x + y + z;

        int[] nums = {2, 3, 4};
        Function f = fun1;
        for (int i = 0; i < nums.length; i++) {
            if (f instanceof Function) {
                Object apply = f.apply(nums[i]);
                if (apply instanceof Function) {
                    f = (Function) apply;
                } else {
                    System.out.println("调用结束， 调用结果为：" + apply);
                }
            }

        }

    }
}
