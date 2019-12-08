package local.tiendavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "local.tiendavirtual")
public class TiendavirtualApplication {

    public static void main(String[] args) {
	SpringApplication.run(TiendavirtualApplication.class, args);
    }
}