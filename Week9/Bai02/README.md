# Bai 02 - Code Quality, Checkstyle, Logging

Project `BankSystem` da duoc refactor theo Google Java Style va tich hop Maven Checkstyle Plugin.

## Chay kiem tra

```powershell
mvn clean verify
mvn checkstyle:check
```

## Logging

Su dung SLF4J API va Logback Classic.

- `INFO`: ghi cac moc nghiep vu thanh cong nhu tao tai khoan, nap tien, rut tien.
- `ERROR`: ghi truong hop thao tac bi tu choi, vi du rut tien vuot so du.
- Du lieu log: `accountNumber`, `amount`, `balance`; day la cac truong du de trace giao dich ma khong ghi thong tin nhay cam nhu mat khau/PIN.
