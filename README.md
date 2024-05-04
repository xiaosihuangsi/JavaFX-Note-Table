# JavaFX Note Table

The Note Table Application is a JavaFX-based program that generates and displays a table of musical notes based on user-defined parameters. It utilizes the Job and Note classes to generate notes with various properties and then presents them in a table format using JavaFX's TableView component.

## Features

- Generates a table of musical notes based on a sampling job configuration.
- Allows customization of job parameters such as note range, interval, duration, decay, and velocities.
- Displays the table using a JavaFX TableView component.

## Files Overview

### Job.java

Defines a `Job` class representing a sampling job with musical notes. Handles parameters such as note range, interval, duration, decay, and velocities.

### Note.java

Defines a `Note` class representing a musical note within a sampling job. Includes properties for note number, velocity, start time, and end time.

### NoteTable.java

Contains the main JavaFX application code. Creates a graphical user interface to display a table of musical notes generated based on Job parameters.



## Usage

1. Compile the NoteTable.java file:

 ```bash
javac --module-path "--check from javafx-sdk-21.0.2 % pwd---then paste to here" --add-modules javafx.controls NoteTable.java

```
2. Run the application:
   
```bash
java --module-path "--check from javafx-sdk-21.0.2 % pwd---then paste to here" --add-modules javafx.controls NoteTable

```
## Demo
<!-- Image 1 -->
<p align="center">
  <img src="https://raw.githubusercontent.com/xiaosihuangsi/JavaFX-Note-Table/main/Demo_1.png?token=GHSAT0AAAAAACRFU4YHKDWZTICEOHMJGHQ2ZRV3HJQ" alt="Image 1" width="600" />
  <br />
  <em>Image 1</em>
</p>

<!-- Image 2 -->
<p align="center">
  <img src="https://raw.githubusercontent.com/xiaosihuangsi/JavaFX-Note-Table/main/Demo_2.png?token=GHSAT0AAAAAACRFU4YGB3JIJUZ77T4KT3I2ZRV3HUQ" alt="Image 2" width="600" />
  <br />
  <em>Image 2</em>
</p>

<!-- Image 3 -->
<p align="center">
  <img src="https://raw.githubusercontent.com/xiaosihuangsi/JavaFX-Note-Table/main/Demo_3.png?token=GHSAT0AAAAAACRFU4YHJJRV66QO4OCRZAKCZRV3H6Q" alt="Image 3" width="600" />
  <br />
  <em>Image 3</em>
</p>

<!-- Image 4 -->
<p align="center">
  <img src="https://raw.githubusercontent.com/xiaosihuangsi/JavaFX-Note-Table/main/Demo_4_console.png?token=GHSAT0AAAAAACRFU4YHVCDCQUTSRO6CTOW4ZRV3IWQ" alt="Image 4" width="600" />
  <br />
  <em>Image 4</em>
</p>
