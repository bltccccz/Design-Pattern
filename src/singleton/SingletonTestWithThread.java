package singleton;

import singleton.obj.Machine;
import singleton.patten.*;

import java.util.stream.IntStream;

/**
 * @author Ccccz
 * @date 2020/6/28
 * @description
 */
public class SingletonTestWithThread {
    public static void main(String[] args) throws InterruptedException {
        singleton01();
        Thread.sleep(10);
        System.out.println();

        singleton02();
        Thread.sleep(10);
        System.out.println();

        singleton03();
        Thread.sleep(10);
        System.out.println();

        singleton04();
        Thread.sleep(10);
        System.out.println();

        singleton05();
        Thread.sleep(10);
        System.out.println();

        singleton06();
    }

    private static void singleton01() {
        IntStream.rangeClosed(0, 5).forEach(i -> new Thread(() -> {
            Machine instance = Singleton01.instance();
            System.out.println("多线程下第一种单例模式: " + Thread.currentThread().getName() + "获取对象" + instance);
        }).start());
    }

    private static void singleton02() {
        IntStream.rangeClosed(0, 5).forEach(i -> new Thread(() -> {
            Machine instance = Singleton02.instance();
            System.out.println("多线程下第二种单例模式: " + Thread.currentThread().getName() + "获取对象" + instance);
        }).start());
    }

    private static void singleton03() {
        IntStream.rangeClosed(0, 5).forEach(i -> new Thread(() -> {
            Machine instance = Singleton03.instance();
            System.out.println("多线程下第三种单例模式: " + Thread.currentThread().getName() + "获取对象" + instance);
        }).start());
    }

    private static void singleton04() {
        IntStream.rangeClosed(0, 5).forEach(i -> new Thread(() -> {
            Machine instance = Singleton04.instance();
            System.out.println("多线程下第四种单例模式: " + Thread.currentThread().getName() + "获取对象" + instance);
        }).start());
    }

    private static void singleton05() {
        IntStream.rangeClosed(0, 5).forEach(i -> new Thread(() -> {
            Machine instance = Singleton05.instance();
            System.out.println("多线程下第五种单例模式: " + Thread.currentThread().getName() + "获取对象" + instance);
        }).start());
    }

    private static void singleton06() {
        IntStream.rangeClosed(0, 5).forEach(i -> new Thread(() -> {
            Machine instance = Singleton06.instance();
            System.out.println("多线程下第六种单例模式: " + Thread.currentThread().getName() + "获取对象" + instance);
        }).start());
    }

}
