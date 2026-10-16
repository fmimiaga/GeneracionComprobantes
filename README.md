# GeneracionComprobantes
Aplicación Java Maven para la generación de comprobantes, desarrollada con Java 17.

## Tecnologías utilizadas

- Java 17
- Apache Maven
- Git y GitHub
- Docker

## Compilar el proyecto

Desde la carpeta raíz del proyecto, ejecuta:

```bash
mvn clean package
```

## Construir la imagen Docker

Con Docker Desktop iniciado, ejecuta:

```bash
docker build -t generacion-comprobantes:1.0 .
```

## Verificar el entorno Java en Docker

Ejecuta:

```bash
docker run --rm generacion-comprobantes:1.0
```

El contenedor muestra la versión de Java instalada. Actualmente, esta prueba verifica el entorno de ejecución; **no abre la interfaz gráfica Swing** de la aplicación.

## Repositorio

Código fuente disponible en GitHub:

https://github.com/fmimiaga/GeneracionComprobantes
