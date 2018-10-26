package demo;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Fleet Location Updater application.
 */
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
public class FleetLocationUpdaterApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FleetLocationUpdaterApplication.class, args);
    }

}
