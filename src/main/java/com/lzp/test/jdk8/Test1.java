package com.lzp.test.jdk8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {

    public static void main(String[] args) {
/*        System.out.println("lzp");
        FunInterface t = ()->"sdas";
        //System.out.println(t.accept());
        //Map<String,String> hashMap = HashMap::new
        FunInterface ff = HashMap::new;
        Lzp lzp = new Lzp();
        lzp.setAge(12);
        List<Lzp> list = new ArrayList<>();
        list.add(lzp);
        list.forEach(System.out::println);
        //FunInterface f1 = Lzp::setAge;

        Collection<String> set = new HashSet<>();
        set.add("a1");
        set.add("a2");
        set.add("a3");

        Iterator iterator = set.iterator();
        iterator.forEachRemaining(System.out::println);*/

        Predicate p = (e)-> e.equals("null");
        System.out.println(p.test(1));
        Function<Integer,Boolean> function= (e)->e.equals(1);
        System.out.println(function.apply(1));
        Function<Integer,String> function1 = (e)->"ni mei de ";
        System.out.println(function1.apply(1));
    }
}
