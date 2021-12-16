package RETO2_CICLO4;

import RETO2_CICLO4.interfaz.InterfaceFootwear;
import RETO2_CICLO4.interfaz.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
@EnableConfigurationProperties
public class Reto2Application implements CommandLineRunner {

    @Autowired
    private InterfaceFootwear interfaceFootwear;
    @Autowired
    private InterfaceUser interfaceUser;

    public static void main(String[] args) {
        SpringApplication.run(Reto2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        interfaceFootwear.deleteAll();
        interfaceUser.deleteAll();
    }
}
