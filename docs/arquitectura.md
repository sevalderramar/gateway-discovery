# Arquitectura

La arquitectura del sistema usa un API Gateway como punto de entrada y Eureka Server como registro de servicios.

Flujo principal:

```text
Cliente/Postman -> API Gateway -> Eureka Server -> Microservicios
```

El cliente consume las rutas expuestas por el API Gateway. El API Gateway usa Eureka para resolver los nombres logicos de los microservicios y redirigir las solicitudes hacia el servicio correspondiente.

Microservicios registrados:

- libro-service
- usuario-service
- prestamo-service
