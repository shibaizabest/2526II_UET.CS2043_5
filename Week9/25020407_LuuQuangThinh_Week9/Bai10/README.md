# Bai 10 - The Broken Pipeline

Day la ban da sua de pipeline xanh. Neu lam tren GitHub that, quy trinh dung la moi lan chi sua mot loi, push lai, doi pipeline chay, roi moi sua loi tiep theo.

## Loi 1 - Workflow khong checkout source

- File: `.github/workflows/ci.yml`
- Dong loi trong ban cu: truoc buoc `Set up JDK 17`, workflow thieu `actions/checkout`.

Log lien quan:

```text
The goal you specified requires a project to execute but there is no POM in this directory
```

Nguyen nhan: GitHub runner la may ao moi. Neu khong checkout repository, thu muc lam viec khong co `pom.xml`, nen `mvn package` khong co project de build.

Sua:

```yaml
- name: Checkout source
  uses: actions/checkout@v4
```

## Loi 2 - Dependency Logback sai version

- File: `pom.xml`
- Dong loi trong ban cu: dependency `logback-classic` version `9.9.9`.

Log lien quan:

```text
Could not find artifact ch.qos.logback:logback-classic:jar:9.9.9 in central
```

Nguyen nhan: `9.9.9` khong ton tai tren Maven Central, Maven khong resolve duoc dependency.

Sua:

```xml
<version>1.4.11</version>
```

## Loi 3 - Surefire qua cu de chay JUnit Jupiter on dinh

- File: `pom.xml`
- Dong loi trong ban cu: `maven-surefire-plugin` version `2.12.4`.

Log lien quan thuong gap:

```text
Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
```

hoac build khong discover duoc test JUnit 5.

Nguyen nhan: JUnit Jupiter can JUnit Platform provider. Surefire `2.12.4` la version cu, khong phu hop voi JUnit 5.

Sua:

```xml
<artifactId>maven-surefire-plugin</artifactId>
<version>3.1.2</version>
```

## Loi 4 tu tao - NullPointerException khi type null

- File: `src/main/java/com/lab/ShippingCalculator.java`
- Dong loi trong ban cu: `type.equals("EXPRESS")`.

Log lien quan khi them test `calc.calculate(5, null)`:

```text
Unexpected exception type thrown, expected: <java.lang.IllegalArgumentException>
but was: <java.lang.NullPointerException>
```

Nguyen nhan: goi `equals` tren bien `type` bi `null` se nem `NullPointerException`, trong khi API nen tra ve `IllegalArgumentException` cho loai van chuyen khong hop le.

Sua:

```java
if ("EXPRESS".equals(type)) {
  return weight * 5000 + 20000;
}
if ("STANDARD".equals(type)) {
  return weight * 3000;
}
```

## Lenh kiem tra

```powershell
mvn clean package
```
