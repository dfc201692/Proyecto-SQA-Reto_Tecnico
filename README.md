# Proyecto de Automatización - San Angel

Este proyecto utiliza Serenity BDD junto con Cucumber y Gradle para automatizar pruebas de aceptación en el sitio web de San Angel.

## Configuración

Asegúrate de tener instalado:
- Java
- Gradle

## Configuración del Proyecto

### Estructura del Proyecto

- `src/main/java`: Contiene las clases de páginas y cualquier lógica de la aplicación.
- `src/test/resources`: Contiene los archivos `.feature` con los escenarios de Cucumber.
- `src/test/java`: Contiene las clases de pasos y configuración de Serenity.

### Dependencias

- Serenity BDD
- Cucumber
- WebDriver (ChromeDriver)
- Otros (ver `build.gradle` para detalles)

## Ejecución de Pruebas

Desde la terminal, ejecuta el siguiente comando:

```bash
./gradlew clean test aggregate
