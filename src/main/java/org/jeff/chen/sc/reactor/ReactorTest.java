package org.jeff.chen.sc.reactor;

import reactor.core.publisher.Flux;

/**
 * @author jeff
 * <p>Date 2018/5/8 17:57</p>
 */
public class ReactorTest {

    public static void main(String[] args) {
       Flux.just("Hello world").subscribe(System.out::print);
    }
}
