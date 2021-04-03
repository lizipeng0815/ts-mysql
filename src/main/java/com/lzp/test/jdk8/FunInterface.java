package com.lzp.test.jdk8;

@FunctionalInterface
public interface FunInterface<T> {

    public static int aa(){return  100;}
    T accept();
//default int a();
    default int A(){return 0;}

}
