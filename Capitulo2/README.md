# Simulador_Gestion_Memoria
  El simulador incluye funciones para la administración de memoria dinámica
 y estática.

# Simulador de Gestión de Memoria

## Descripción
Este proyecto implementa un simulador de gestión de memoria que permite la administración de la memoria en esquemas fijos y dinámicos. Incluye una interfaz gráfica de usuario (GUI) para facilitar la interacción y visualización de los resultados.


## Características

- **Particionamiento Fijo**: La memoria se divide en bloques de tamaño fijo, lo cual permite asignar cada bloque a un proceso individual.
- **Particionamiento Dinámico**: La memoria se asigna de forma dinámica, adaptándose al tamaño del proceso.
- **Interfaz Gráfica**: Una interfaz sencilla que permite al usuario seleccionar el tipo de particionamiento, especificar el tamaño de cada proceso y observar cómo se gestiona la memoria.
- **Simulación de Procesos**: Posibilidad de agregar procesos con un tamaño específico y ver cómo se asignan o rechazan en función de la memoria disponible y el esquema de particionamiento.

## Captura de Pantalla

![Simulador de Gestión de Memoria](![imagen de la interfaz](image.png).png)



## Uso

1. **Selecciona el tipo de particionamiento**: Elige entre *Fijo* o *Dinámico*.
   - **Fijo**: Define el tamaño de cada partición en el campo "Tamaño de Partición (Fijo)".
   - **Dinámico**: No es necesario especificar un tamaño fijo para cada partición; el tamaño será ajustado automáticamente según los requerimientos de cada proceso.

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

- Python 3.x


## Estructura del Proyecto


simulador-gestion-memoria
├── main.py               # Archivo principal para ejecutar el simulador
├── interfaz.py           # Archivo que contiene la lógica de la interfaz gráfica
├── gestion_memoria.py    # Archivo que implementa la lógica de gestión de memoria
├── README.md             # Este archivo de documentación




## Archivos del Proyecto
- **`gui.py`**: Contiene el código relacionado con la interfaz gráfica de usuario del simulador.
- **`memory_simulator.py`**: Contiene la lógica principal del simulador, incluyendo los algoritmos de gestión de memoria para esquemas fijos y dinámicos.



## Instalación
1. Clona este repositorio: `git clone https://github.com/usuario/simulador-memoria.git`
2. Navega al directorio del proyecto: `cd simulador-memoria`
3. Instala los requisitos necesarios: `pip install -r requirements.txt`

## Uso
1. Ejecuta el archivo `gui.py` para iniciar la interfaz gráfica: `python gui.py`
2. Interactúa con la GUI para simular la gestión de memoria en esquemas fijos y dinámicos.


