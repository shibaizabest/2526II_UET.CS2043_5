# Bai 09 - Professional Logging

Da loai bo cach ghi log bang `System.out.println()` trong source chinh.

Logging su dung:

- `INFO`: moc nghiep vu thanh cong, vi du `Order confirmed`.
- `ERROR`: loi dau vao hoac exception.
- Parameterized logging voi `{}` thay vi cong chuoi.
- `FileAppender` ghi log vao `target/logs/application.log`.

Kiem tra:

```powershell
mvn test
Get-Content target/logs/application.log
```
