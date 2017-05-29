package xiao.scala.spark;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestLambda {
    private <T> List<T> asList(MyListCreator<List<T>> creator, T... args) {
        List<T> list = creator.create();
        for (T t : args) list.add(t);
        return list;
    }

    public void test1() {
        new Thread(() -> System.out.println("hehe")).start();

//        List<Integer> list = Arrays.asList(1, 4, 5);
        List<Integer> list = this.asList(ArrayList::new, 1, 4, 5);
        list.forEach(System.out::println);
        System.out.println(list.getClass());
    }

    public static void main(String[] args) {
        new TestLambda().test1();
    }
}

