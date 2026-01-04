# SmartStock RT - Sistema de Gestión de Inventario en Tiempo Real 

SmartStock RT es una aplicación de consola desarrollada en Java diseñada para gestionar inventarios de productos en tiempo real. El sistema permite registrar productos, realizar ventas y cuenta con un un monitor que vigila las existencias en tiempo real.

Este proyecto inntegra tecnologias como Java, POO, hilos y colecciones para ofrecer una solución robusta y eficiente para la gestión de inventarios.

## Características Principales

- **Registro de Productos**: Permite agregar nuevos productos al inventario con detalles como nombre, cantidad y precio.
- **Venta/Salida de Productos**: Procesamiento de datos con validación para asegurar que las ventas no excedan el inventario disponible.
- **Monitor de Existencias en Tiempo Real**: Un hilo separado que vigila continuamente los niveles de inventario y alerta cuando un producto está por debajo del umbral definido.
- **Reporte de Inventario**: Genera informes detallados del estado actual del inventario.
- **Interfaz de Consola**: Interacción sencilla a través de la línea de comandos.

## Temas aplicados

1. Programación Orientada a Objetos (POO): Uso de clases y objetos para modelar productos, encapsulamiento de atributos y acceso mediante métodos getters y setters, herencia y polimorfismo para extender funcionalidades, modularidad para mantener el código organizado.

2. Programacion Estructurada: Uso de estructuras de control como condicionales (if, switch) y bucles (for, while) para gestionar el flujo del programa, funciones/métodos para organizar el código en bloques reutilizables.

3. Ingeniería de Software: Aplicación de principios de diseño de software, uso de patrones de diseño como el patrón Singleton para la gestión del inventario, pruebas unitarias para asegurar la calidad del código, arquitectura modular para facilitar el mantenimiento y la escalabilidad.

4. Sistemas en Tiempo Real: El software implementa un monitor en tiempo real que vigila las existencias del inventario, utilizando hilos para permitir la ejecución concurrente de tareas, asegurando que las alertas de bajo inventario se generen de manera oportuna.
