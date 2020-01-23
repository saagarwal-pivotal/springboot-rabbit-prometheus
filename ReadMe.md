# Spring boot 1.5.X RabbitMQ metrics 
----

Add below properties to application.properties
```
endpoints.enabled=true
endpoints.info.enabled=true
endpoints.sensitive=false
management.health.defaults.enabled=true

```

All the metrics will be exposed onto 

/metrics endpoint
/prometheus endpoint will be scrapped

