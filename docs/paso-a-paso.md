# Construccion paso a paso

Este registro vincula cada etapa del desarrollo con el historial Git para que se pueda revisar el avance commit por commit.

1. **Estructura inicial** â€” `69278a4 chore: bootstrap Android Compose project`. Se prepararon Gradle, el wrapper, el manifiesto, el icono, los recursos de ilustracion y Cabin, las licencias y las instrucciones para compilar desde la terminal.
2. **Modelo y catalogo** â€” `ab3811c feat: add superhero data model and catalog`. Se definio `Hero` y se registraron los seis personajes con sus nombres, descripciones e imagenes en `HeroesRepository` y `strings.xml`.
3. **Tema Material 3** â€” `5ae452e feat: add Material 3 color and typography theme`. Se agregaron la paleta clara/oscura, formas redondeadas, tipografia Cabin y colores de las barras del sistema para el modo edge-to-edge.
4. **Tarjetas y lista** â€” `cfb9e46 feat: render superhero list cards`. Se implemento la lista desplazable con `LazyColumn`, tarjetas con elevacion de 2 dp, ilustraciones de 72 dp con esquinas de 8 dp, separacion de 16 dp y estilos Material para nombre y descripcion.
5. **Barra superior y compilacion automatica** â€” `6a0d990 feat: add centered app bar and automated Android build`. Se integro `Scaffold`, una barra superior centrada y un flujo que compila el APK de depuracion y lo guarda como artefacto.
6. **Wrapper para Linux** â€” `03a2f48 ci: prepare Gradle wrapper for Linux builds`. Se marco `gradlew` como ejecutable y se fijaron finales de linea apropiados para los archivos fuente.
7. **Acciones actuales de GitHub** â€” `ac6e461 ci: update Android build action versions` y `d913e7f ci: use current GitHub runner actions`. Se actualizaron las acciones de configuracion Android, Java, Gradle y artefactos.

## Compilacion

La compilacion local necesita JDK 17 y Android SDK Platform 35. En Windows se ejecuta .\gradlew.bat assembleDebug desde la raiz. En Linux o macOS se ejecuta `./gradlew assembleDebug`. El APK queda en `app/build/outputs/apk/debug/app-debug.apk`.

Este equipo no tiene JDK ni Android SDK instalados, por lo que no se afirma una compilacion local. El flujo de GitHub Actions instala esas herramientas y compila el proyecto cada vez que se publica un cambio en `main`; su resultado aparece en la pestaÃ±a Actions y el APK se conserva como artefacto de la ejecucion.

## Material de referencia

La practica sigue el [codelab oficial de Android](https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-superheroes). Las ilustraciones, fuentes Cabin e icono se tomaron del [repositorio oficial de entrenamiento](https://github.com/google-developer-training/basic-android-kotlin-compose-training-superheroes); se mantienen sus avisos de licencia en la raiz del proyecto.