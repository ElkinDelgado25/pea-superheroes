# PEA Superheroes

Aplicacion Android de practica construida con Kotlin, Jetpack Compose y Material 3. La lista presenta seis heroes con ilustracion, nombre y descripcion; incluye tema claro y oscuro, tipografia Cabin y una barra superior centrada.

## Construir sin Android Studio

Se necesita JDK 17 y Android SDK Platform 35. En Windows, desde la raiz del proyecto:

    .\gradlew.bat assembleDebug

El APK de depuracion se genera en `app/build/outputs/apk/debug/app-debug.apk`. El flujo de GitHub Actions compila el proyecto en cada push. No se requiere Android Studio para ejecutar Gradle desde la terminal.

## Proyecto y recursos

La implementacion sigue los requisitos del codelab oficial Practice: Build Superheroes app. Las ilustraciones, fuentes Cabin y recursos de icono se basan en el repositorio de entrenamiento publicado por Google Developers Training. Se conservan sus licencias y atribuciones en `LICENSE` y `ASSETS_LICENSE.txt`.

- Codelab: https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-superheroes
- Recursos de referencia: https://github.com/google-developer-training/basic-android-kotlin-compose-training-superheroes

## Estructura

- `app/src/main/java/com/example/superheroes/model`: modelo y datos de los heroes.
- `app/src/main/java/com/example/superheroes`: actividad principal y pantalla de lista.
- `app/src/main/java/com/example/superheroes/ui/theme`: colores, formas, tipografia y tema Material 3.
- `app/src/main/res`: textos, ilustraciones, fuentes e icono de la aplicacion.
- `.github/workflows/android.yml`: compilacion automatizada.
## Desarrollo

El registro de etapas y commits está en [docs/paso-a-paso.md](docs/paso-a-paso.md).
