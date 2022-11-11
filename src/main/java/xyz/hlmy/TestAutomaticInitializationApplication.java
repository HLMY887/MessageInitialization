package xyz.hlmy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.hlmy.mapper")
public class TestAutomaticInitializationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAutomaticInitializationApplication.class, args);
    }

}
