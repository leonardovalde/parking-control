# API de Control de Parking de Condominio

Esta API proporciona funcionalidades para el control de un parking de un condominio. Está desarrollada utilizando el framework Spring Boot y la base de datos PostgreSQL.

## Modelo de Datos

El modelo de datos utilizado en esta API incluye las siguientes entidades:

### Parking

- `id`: identificador único del parking (UUID)
- `parkingSpotNumber`: número de la plaza de aparcamiento (String)
- `licensePlateCar`: matrícula del coche (String)
- `brandCar`: marca del coche (String)
- `modelCar`: modelo del coche (String)
- `colorCar`: color del coche (String)
- `registrationDate`: fecha de registro del coche en el parking (LocalDateTime)
- `ownerName`: nombre del propietario del coche (String)
- `apartment`: apartamento del propietario (String)
- `apartmentBlock`: bloque de apartamentos del propietario (String)

## Configuración de la Base de Datos
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_basedatos
spring.datasource.username=nombre_usuario
spring.datasource.password=contraseña

spring.jpa.properties.hibernate.jdbc.lab.non_contextual_creation=true
```
## Endpoints

La API proporciona los siguientes endpoints para realizar operaciones CRUD en el sistema:

### POST /parking-spot

Crea un nuevo parking spot.

Este endpoint se utiliza para crear un nuevo registro de parking spot en el sistema.

### GET /parking-spot

Recupera todos los parking spots registrados.

Este endpoint se utiliza para obtener todos los registros de parking spots existentes en el sistema.

### GET /parking-spot/{id}

Recupera un parking spot específico por su identificador.

Este endpoint se utiliza para obtener un parking spot específico en función de su identificador único.

### PUT /parking-spot/{id}

Actualiza un parking spot existente por su identificador.

Este endpoint se utiliza para actualizar un parking spot existente en el sistema.

### DELETE /parking-spot/{id}

Elimina un parking spot existente por su identificador.

Este endpoint se utiliza para eliminar un parking spot existente en el sistema.


## Ejecución

Para ejecutar la API, siga los siguientes pasos:

1. Clone el repositorio en su máquina local: `git clone https://github.com/leonardovalde/parking-control.git`
2. Actualice la configuración de la base de datos en el archivo `application.properties`.
3. Ejecute la aplicación

¡La API debería estar ahora en funcionamiento en `http://localhost:8080`!
