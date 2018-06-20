package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author: jbwang0106
 * @description: method refrence
 * @create: 2018-06-19 22:24
 **/
public class MethodRefrence {

    public static void main(String[] args) {

        //方法引用
        Consumer<String> consumer = System.out :: println;
        consumer.accept("hello world");

        //1. 静态方法的引用
        Consumer<Dog> consumer1 = Dog::bark;
        consumer1.accept(new Dog());

        //2. 非静态方法，使用对象实例进行引用
        Dog dog = new Dog();
        //Function<Integer, Integer> function = dog::eat;
        //UnaryOperator<Integer> function = dog::eat;
        //System.out.println(function.apply(2));
        IntUnaryOperator function = dog::eat;
        System.out.println(function.applyAsInt(2));

        //3. 使用类名的方式来完成方法的引用
        BiFunction<Dog, Integer, Integer> biFunction = Dog::eat;
        System.out.println(biFunction.apply(dog, 2));

        //4. 构造函数的方法引用，无参构造器没有输入，只有输出
        Supplier<Dog> supplier = Dog::new;
        System.out.println(supplier.get());

        //5. 有参构造函数既有输入又有输出
        Function<String, Dog> function1 = Dog::new;
        System.out.println(function1.apply("旺财"));

        List<String> list = new ArrayList<>();
        test(list);
        System.out.println(list);

    }

    private static void test(List<String> list) {
        list.add("aaa");
        list = null;
    }

}


class Dog {

    private String name = "二哈";

    private int food = 10;

    public Dog() {}

    public Dog(String name) {
        this.name = name;
    }

    public static void bark(Dog dog) {
        System.out.println(dog.name + "汪汪汪");
    }

    public int eat(int num) {
        System.out.println("吃了" + num + "斤狗粮");
        this.food = this.food - num;
        return food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
