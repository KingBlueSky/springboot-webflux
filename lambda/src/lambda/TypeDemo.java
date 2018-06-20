package lambda;

/**
 * @author: jbwang0106
 * @description: type
 * @create: 2018-06-20 21:38
 **/
public class TypeDemo {

    public static void main(String[] args) {
        //变量类型定义
        IMath lambda = (x, y) -> x + y;

        //定义在数组中
        IMath[] lambdas = {(x, y) -> x + y};

        //强转
        Object lambda1 = (IMath) (x, y) -> x + y;

        //返回值类型
        IMath math = create();
    }

    private static IMath create() {
        return (x, y) -> x + y;
    }
}

@FunctionalInterface
interface IMath {

    int add(int x, int y);

}
