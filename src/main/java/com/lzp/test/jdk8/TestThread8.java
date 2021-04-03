package com.lzp.test.jdk8;

public class TestThread8 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("i am a little thread");
            }
        }).start();

        new Thread(()-> System.out.println("i am lambda thread")).start();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("i am, runnable ove");
            }
        };
        runnable.run();
        Runnable lambda = ()-> System.out.println("i am lambda aaaaaaaa;");
        lambda.run();



    }



}
