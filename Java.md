## Introducción a Java y primeros pasos  
Java es un lenguaje de programación orientado a objetos que se ejecuta sobre una máquina virtual, lo que garantiza portabilidad y robustez. Aprenderás a escribir tu primer programa, entender la estructura básica de clases y paquetes, y usar las herramientas de compilación y ejecución desde la línea de comandos.

- Conceptos clave de Java: sintaxis básica, JDK y JVM.  
- Estructura de un programa: declaración de paquete, definición de clase y método `main`.  
- Compilación y ejecución: `javac` para compilar y `java` para ejecutar.



## Fundamentos de la programación orientada a objetos (POO)  
La POO te permite organizar el código en “objetos” que combinan datos y comportamientos. En Java, los cuatro pilares de la POO son:

- **Encapsulación**: proteger datos usando modificadores de acceso y exponer solo lo necesario.  
- **Herencia**: crear clases nuevas a partir de otras existentes para reutilizar y extender funcionalidad.  
- **Polimorfismo**: usar un mismo nombre de método en distintas clases, con comportamientos específicos.  
- **Abstracción**: enfocarse en la interfaz pública y ocultar los detalles internos.



## Clases y objetos en Java  
Una clase es el molde que define atributos (datos) y métodos (funciones) de un tipo de objeto. Cuando creas una instancia de esa clase obtienes un objeto con estado propio.

- Definición de clase: uso de la palabra clave `class`.  
- Instanciación de objetos: operador `new` y llamadas al constructor.  
- Constructores: inicializan atributos y pueden sobrecargarse para ofrecer distintas formas de crear objetos.  
- Modificadores de acceso: `public`, `private`, `protected` y default para controlar visibilidad.



## Introducción a `record` y sealed classes  
Java moderno ofrece formas más concisas y seguras de definir clases de datos.

- **record**: genera automáticamente constructor, getters, `equals()`, `hashCode()` y `toString()` para clases inmutables.  
- **sealed classes**: limitan qué subclases pueden heredar, mejorando el control de la jerarquía de clases.



## Tipos de datos en Java y uso de `var`  
Cada variable en Java tiene un tipo declarado, pero con `var` el compilador infiere el tipo automáticamente.

- Tipos primitivos: `int`, `double`, `boolean`, `char`, etc.  
- Inferencia de tipo con `var` para code cleaner.  
- Conversión y casting entre tipos cuando necesitas transformar valores.



## Operadores y expresiones  
Los operadores te permiten realizar cálculos, comparaciones y control de flujo en tus programas.

- Aritméticos: suma, resta, multiplicación, división y módulo.  
- Relacionales: comparaciones como igual, distinto, mayor o menor.  
- Lógicos: combinaciones de condiciones con AND, OR y NOT.  
- Asignación e incremento: atajos para modificar valores (`=`, `+=`, `++`, `--`).  
- Precedencia de operadores para saber qué se evalúa primero.



## Sentencias condicionales  
Permiten ejecutar bloques de código distintos según se cumpla o no una condición.

- `if` / `else if` / `else` para evaluar distintas ramas.  
- `switch` tradicional y la sintaxis mejorada con `->` en versiones recientes.  
- Evitar anidamientos excesivos para mantener el código legible.



## Ciclos y estructuras de control  
Los bucles repiten tareas hasta que se cumpla una condición o se recorra una colección.

- `while` y `do-while` para repetir mientras una condición sea verdadera.  
- `for` estándar e iterador con `for-each` para colecciones.  
- Uso de `break` y `continue` para controlar el flujo dentro de bucles.


## Métodos, parámetros y retorno de valores  
Los métodos agrupan lógica reutilizable y pueden recibir datos de entrada y devolver resultados.

- Sintaxis de un método: modificador, tipo de retorno, nombre y lista de parámetros.  
- Paso por valor (primitivos) y por referencia (objetos).  
- Sobrecarga de métodos para ofrecer varias firmas con el mismo nombre.



## Modificadores de acceso  
Controlan quién puede ver y usar atributos y métodos dentro de tu código.

- `public` para accesibilidad total.  
- `private` para encapsular datos internos.  
- `protected` y default para compartir dentro del paquete o con subclases.


## Optional y manejo seguro de valores nulos  
La clase `Optional` ayuda a evitar errores comunes por referencias nulas.

- Encapsular posibles valores `null` en un `Optional`.  
- Métodos `isPresent()`, `ifPresent()`, `orElse()` y `orElseThrow()` para manejar ausencia de manera explícita


## Constructores e inicialización de objetos  
Los constructores aseguran que un objeto nazca en un estado válido

- Constructor por defecto sin parámetros  
- Constructor con parámetros para personalizar valores iniciales
- Constructor de copia y sobrecargas para distintas formas de crear instancias



## Métodos especiales: `equals()`, `hashCode()` y `toString()`  
Permiten comparar, organizar y mostrar objetos de manera efectiva.

- `equals()` para comparar contenido en lugar de referencias.  
- `hashCode()` para uso en estructuras como `HashSet` o `HashMap`.  
- `toString()` para obtener una representación legible del objeto.


## Principios de encapsulación e inmutabilidad  
Diseña clases que protejan sus datos y, cuando sea posible, impide cambios tras la creación.

- Uso de atributos `private` y acceso vía getters.  
- Creación de clases inmutables con atributos `final` y sin setters.

---

## Herencia y composición  
La herencia (`extends`) comparte comportamiento, la composición (`has-a`) ensambla objetos dentro de otros.

- Decidir cuándo usar herencia para extender clases existentes.  
- Elegir composición para acoplar funcionalidades de manera más flexible.



## Interfaces y clases abstractas  
Definen contratos y estructuras base sin implementar toda la lógica.

- Interfaces para especificar métodos que las clases deben implementar.  
- Clases abstractas cuando compartes código común y dejas métodos abstractos por definir.



## Polimorfismo y uso de `@Override`  
Permite que un mismo método actúe diferente según la implementación en cada clase.

- **Sobrescritura** de métodos para adaptar comportamiento en subclases.  
- Anotar con `@Override` para mayor claridad y detección de errores.


## Colecciones básicas y concurrentes  
Estructuras para manejar grupos de datos de forma eficiente y segura en entornos multihilo.

- `List`, `Set` y `Map` para almacenar datos con distintas restricciones.  
- `Comparable` y `Comparator` para ordenar colecciones.  
- `CopyOnWriteArrayList` y `ConcurrentHashMap` para acceso concurrente sin bloqueos globales.



## Manejo de archivos con NIO.2  
La API `java.nio.file` ofrece funcionalidades modernas para trabajar con el sistema de archivos.

- Clases `Path` y `Files` para rutas y operaciones básicas.  
- Lectura con `Files.readString()` y escritura con `Files.write()`.  
- Operaciones avanzadas: copiar, mover, crear directorios y verificar permisos.  
- Buenas prácticas: `try-with-resources` y gestión adecuada de excepciones.



## Refactorización, code smells y principios SOLID  
Mantén tu código limpio, modular y fácil de mantener aplicando buenas prácticas de diseño.

- Identificar y eliminar “code smells” como duplicación o métodos muy largos.  
- Aplicar principios SOLID (SRP, OCP, LSP, ISP, DIP) para una arquitectura robusta.



## Rendimiento y manejo de excepciones  
Optimiza tus programas y gestiona errores de forma controlada.

- Elegir la estructura de datos adecuada para cada caso.  
- Reducir complejidad ciclomática y uso eficiente de memoria.  
- Estructura `try-catch-finally`, declaración `throws` y creación de excepciones personalizadas.

