package kr.doo.toy01testonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Toy01TestonlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Toy01TestonlyApplication.class, args);
    }

    @RequestMapping("/app")
    public String app() {
        return "app";
    }
}
