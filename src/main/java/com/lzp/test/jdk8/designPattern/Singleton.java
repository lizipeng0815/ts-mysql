package com.lzp.test.jdk8.designPattern;

public class Singleton {


//    /**
//     * 饿汉式 自己创建了自己的实例
//     */
//    private static Singleton singleton = new Singleton();
//
//    /**
//     * 单例模式 构造器私有化
//     */
//    private  Singleton(){}
//
//    public  static Singleton getSingleton(){
//        return  singleton;
//    }

//    /**
//     * 懒汉式 等调用方法时再创建实例  会出线线程安全
//     */
//    private static Singleton singleton = null;
//
//    private Singleton(){}
//
//    public  static synchronized Singleton getSingleton(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return  singleton;
//    }

//    /**
//     * 双重验证
//     */
//    private static Singleton singleton = null;
//
//    private Singleton(){}
//
//    public  static synchronized Singleton getSingleton(){
//        if(singleton == null){
//            synchronized (Singleton.class){
//                if(singleton == null){
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return  singleton;
//    }


        private Singleton(){}

    public  static  Singleton getSingleton(){
            return staticInner.singleton;
    }
    /**
     * 静态内部类 的单例模式 比较推荐  理论上最优秀的是枚举 天生就是单例
     */
    private static class staticInner{
       private static Singleton singleton = new Singleton();

    }


}
