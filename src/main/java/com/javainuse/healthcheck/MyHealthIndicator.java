package com.javainuse.healthcheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
      //  int errorCode = check(); // perform some specific health check

        int errorCode =1;
        if (errorCode != 0) {
            return Health.down().withDetail("Customer Error Code", errorCode).build();
        }
        return Health.up().build();
    }

}