package pt.fabm;

import reactor.core.publisher.Flux;

public class TestReactor {
    public static void main(String[] args) {
        String[] numeros = new String[]{"um","dois","tres"};
        Flux.range(0,3)
                .map(e->numeros[e])
                .subscribe(System.out::println);
    }
}
