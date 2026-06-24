# Biblioteca Gateway Eureka

Sistema de Biblioteca Online basado en microservicios. El caso de negocio permite consultar libros, usuarios y prestamos mediante servicios separados, registrados en Eureka y expuestos a traves de un API Gateway.

## Componentes

- Eureka Server: registro de servicios donde se inscriben los microservicios y el gateway.
- API Gateway: punto unico de entrada para acceder a los servicios de negocio.
- Libro Service: expone la consulta de libros con informacion de disponibilidad.
- Usuario Service: expone la consulta de usuarios registrados.
- Prestamo Service: expone la consulta de prestamos asociados a usuarios y libros.

## Puertos

- Eureka Server: 8761
- API Gateway: 9000
- Libro Service: 9101
- Usuario Service: 9102
- Prestamo Service: 9103

## Orden de ejecucion

1. eureka-server
2. libro-service
3. usuario-service
4. prestamo-service
5. api-gateway

## URLs de prueba

- http://localhost:8761
- http://localhost:9000/api/libros
- http://localhost:9000/api/usuarios
- http://localhost:9000/api/prestamos
