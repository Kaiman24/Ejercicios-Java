
# Simulador_Gestion_Memoria
  El simulador incluye funciones para la administracion de memoria dinamica
 y estatica.



## Descripcion
Este proyecto implementa un simulador de gestion de memoria que permite la administracion de la memoria en esquemas fijos y dinamicos. Incluye una interfaz grafica de usuario (GUI) para facilitar la interacción y visualización de los resultados.


## Caracteristicas

- **Particionamiento Fijo**: La memoria se divide en bloques de tamaño fijo, lo cual permite asignar cada bloque a un proceso individual.

- **Particionamiento Dinamico**: La memoria se asigna de forma dinamica, adaptandose al tamaño del proceso.

- **Interfaz Grafica**: Una interfaz sencilla que permite al usuario seleccionar el tipo de particionamiento, especificar el tamaño de cada proceso y observar como se gestiona la memoria.

- **Simulacion de Procesos**: Posibilidad de agregar procesos con un tamaño especifico y ver como se asignan o rechazan en funcion de la memoria disponible y el esquema de particionamiento.


## Captura de Pantalla


![Imagen de la interfaz](image.png)

## Uso

1. **Selecciona el tipo de particionamiento**: Elige entre *Fijo* o *Dinamico*.
   - **Fijo**: Define el tamaño de cada particion en el campo "Tamaño de Partición (Fijo)".
   - **Dinamico**: No es necesario especificar un tamaño fijo para cada particion; el tamaño sera ajustado automáticamente según los requerimientos de cada proceso.

2. **Configura los detalles del proceso**:
   - Ingresa un **ID del Proceso** único.
   - Especifica el **Tamaño del Proceso** en unidades de memoria.

3. **Inicializa el sistema**:
   - Presiona **Inicializar Fijo** o **Inicializar Dinámico** según el esquema seleccionado.

4. **Agregar Procesos**: Utiliza el botón **Agregar Proceso** para añadir procesos al simulador. El programa intentará asignar memoria al proceso, siguiendo las reglas del esquema seleccionado.

5. Observa cómo se administra la memoria:
   - En el esquema de **particionamiento fijo**, cada proceso ocupará una partición de tamaño fijo.
   - En el esquema de **particionamiento dinámico**, el tamaño de las particiones se adapta a los requisitos del proceso, pero puede generar fragmentación externa.

## Ejemplo de Uso

1. Selecciona el tipo de particionamiento **Fijo**.
2. Ingresa el **Tamaño de Partición** como `100`.
3. Presiona **Inicializar Fijo**.
4. Ingresa los siguientes datos para un proceso:
   - **ID del Proceso**: `1`
   - **Tamaño del Proceso**: `80`
5. Presiona **Agregar Proceso** y observa cómo se asigna la memoria.


## Requisitos

- Python 3.13


## Estructura del Proyecto


main.py               # Archivo principal para ejecutar el simulador
interfaz.py           # Archivo que contiene la lógica de la interfaz gráfica
gestion_memoria.py    # Archivo que implementa la lógica de gestión de memoria
README.md             # Este archivo de documentación




## Archivos del Proyecto
- **`gui.py`**: Contiene el código relacionado con la interfaz gráfica de usuario del simulador.
- **`memory_simulator.py`**: Contiene la lógica principal del simulador, incluyendo los algoritmos de gestión de memoria para esquemas fijos y dinámicos.




## Uso
1. Ejecuta el archivo `gui.py` para iniciar la interfaz gráfica: `python gui.py`
2. Interactúa con la GUI para simular la gestión de memoria en esquemas fijos y dinámicos.


