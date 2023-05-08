# Hackaton template

## Installation

This projects needs the Java JDK 11 and Gradle to execute the test scenarios.

### Adoptium JDK1 1

You can download the Adoptium JDK 11 for your system [here](https://adoptium.net/en-GB/temurin/archive/?version=11). Also you can
find the installation steps for your operative system [here](https://adoptium.net/en-GB/installation/).

### Gradle

There is no need to install Gradle, this projects comes with a gradle wrapper in the root folder.

## Getting Started

Once you have to clone the repository, open a terminal and run the following commands in the root project folder:

### MacOS / Linux

```bash
  ./gradlew clean build
```

```bash
  ./gradlew downloadAllure
```

### Windows

```bash
  gradlew.bat clean build
```

```bash
  gradlew.bat downloadAllure
```

## Running Tests

To run tests, run the following command

### MacOS / Linux

```bash
  ./gradlew clean executeScenarios
```

### Windows

```bash
  gradlew.bat clean executeScenarios
```

### Logs

Each test scenario execution will generate a log file inside the folder `logs`

## Reporting

To generate the execution report execute, after running the test, the following command:

### MacOS / Linux

```bash
  ./gradlew allureServe
```

### Windows

```bash
  gradlew.bat allureServe
```

This command will open a report in your system default browser containing a detailed report for the execution, all
failing test will have attached a screenshot under the After step.

In order to end the command simply input `CTRL+C` in your terminal.