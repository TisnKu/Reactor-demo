import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

class ReactorDemoTest {
    @Test
    void basic() {
        Flux.just("dk", "xxxsss", "yyy").subscribe(System.out::println);
        Mono.just("xxx").subscribe(System.out::println);
    }
}