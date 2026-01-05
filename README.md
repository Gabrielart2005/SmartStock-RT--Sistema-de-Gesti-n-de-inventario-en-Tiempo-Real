# SmartStock RT - Sistema de Gestion de Inventario en Tiempo Real

Sistema de gestion de inventario desarrollado en Java que permite registrar productos, procesar ventas y 
monitorear existencias en tiempo real mediante hilos concurrentes.

## Descripcion

SmartStock RT es una aplicacion de consola que implementa un sistema completo de gestion de inventario. 
Utiliza el patron Singleton para garantizar una unica instancia del inventario y emplea programacion 
concurrente para monitorear niveles de stock en segundo plano.

## Estructura del Proyecto

```
SmartStock-RT/
├── src/
│   ├── Main.java              # Punto de entrada de la aplicacion
│   ├── Menu.java              # Interfaz de usuario y opciones del menu
│   ├── Validador.java         # Validacion de entrada de datos
│   ├── ReporteConsola.java    # Generacion de reportes en consola
│   ├── Producto.java          # Modelo de datos para productos
│   ├── Inventario.java        # Logica de negocio (Singleton)
│   └── MonitorInventario.java # Monitor de stock en tiempo real (Thread)
├── bin/                       # Archivos compilados
└── README.md
```

## Arquitectura

El sistema esta dividido en tres capas:

### Capa de Presentacion (Frontend)
- `Main.java` - Inicializa el sistema y coordina componentes
- `Menu.java` - Muestra opciones y procesa selecciones del usuario
- `Validador.java` - Valida datos ingresados por el usuario
- `ReporteConsola.java` - Formatea y muestra reportes del inventario

### Capa de Logica de Negocio (Backend)
- `Inventario.java` - Gestiona operaciones CRUD sobre productos (patron Singleton)
- `MonitorInventario.java` - Vigila niveles de stock en un hilo separado

### Capa de Datos
- `Producto.java` - Representa la entidad producto con atributos id, nombre, cantidad y precio

## Funcionalidades

- Registro de productos con validacion de datos
- Venta de productos con control de stock disponible
- Busqueda de productos por identificador
- Generacion de reportes de inventario
- Alertas automaticas de bajo stock en tiempo real
- Deteccion de productos por debajo del umbral definido

## Tecnologias y Conceptos Aplicados

### Programacion Orientada a Objetos
- Encapsulamiento mediante modificadores de acceso
- Getters y setters para control de atributos
- Patron Singleton para instancia unica del inventario

### Programacion Concurrente
- Implementacion de interfaz Runnable
- Uso de Thread para monitoreo en segundo plano
- Control de ejecucion mediante variable booleana

### Estructuras de Datos
- ArrayList para almacenamiento dinamico de productos
- List como interfaz para flexibilidad de implementacion

### Patrones de Diseno
- Singleton: garantiza una unica instancia del inventario
- Separation of Concerns: division clara entre capas

## Requisitos

- Java JDK 8 o superior
- Terminal o consola de comandos

## Ejecucion

```bash
cd src
javac *.java
java Main
```

## Autores

Proyecto desarrollado como ejercicio academico de programacion en Java.
