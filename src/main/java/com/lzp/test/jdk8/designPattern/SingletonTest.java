package com.lzp.test.jdk8.designPattern;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton3 = EnumSingleton.INSTANCE;


        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);
        System.out.println(enumSingleton3);
    }

}
