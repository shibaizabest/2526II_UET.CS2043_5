JUNIT="lib/junit-platform-console-standalone-1.10.0.jar"
mkdir -p build
javac -cp "$JUNIT" src/*.java -d build
java -jar "$JUNIT" --class-path build --scan-class-path