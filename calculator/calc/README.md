# How to use calculator
your **pwd** need to be inside ../calc this means the folder behind the calc folder.
## Compile
- Method 1: 
```java
javac calc/*.java
```

- Method 2: 
```java
javac -d build calc/*.java
```

## Run
- Method 1: 
```java
java calc.Main
```
- Method 2: 
```java
java -cp build calc.Main
```

## Create a Jar executable
Use method 2: 
```java
jar --create --file math.jar --main-class calc.Main -C build .
```
