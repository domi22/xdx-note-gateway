package xdx.note.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XdxNoteGatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(XdxNoteGatewayApp.class, args);
    }




}
