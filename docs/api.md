# API

Endpoints disponibles a traves del API Gateway.

URL base: http://localhost:9000

## GET /api/libros

Devuelve una lista de libros.

Ejemplo de respuesta:

```json
[
  {
    "id": 1,
    "titulo": "Clean Code",
    "autor": "Robert C. Martin",
    "disponible": true
  },
  {
    "id": 2,
    "titulo": "Domain-Driven Design",
    "autor": "Eric Evans",
    "disponible": false
  }
]
```

## GET /api/usuarios

Devuelve una lista de usuarios.

Ejemplo de respuesta:

```json
[
  {
    "id": 1,
    "nombre": "Ana Torres",
    "email": "ana.torres@biblioteca.cl"
  },
  {
    "id": 2,
    "nombre": "Carlos Perez",
    "email": "carlos.perez@biblioteca.cl"
  }
]
```

## GET /api/prestamos

Devuelve una lista de prestamos.

Ejemplo de respuesta:

```json
[
  {
    "id": 1,
    "usuarioId": 1,
    "libroId": 2,
    "estado": "ACTIVO"
  },
  {
    "id": 2,
    "usuarioId": 2,
    "libroId": 1,
    "estado": "DEVUELTO"
  }
]
```
