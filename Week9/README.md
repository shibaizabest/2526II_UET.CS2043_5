# Week 9 - Maven, Quality, CI/CD

Thu muc nay gom cac bai:

- `Bai01`: nang cap Maven dependency legacy cho MathUtils.
- `Bai02`: BankSystem voi Checkstyle va logging.
- `Bai03`: Maven project co GitHub Actions build/package va upload jar.
- `Bai04`: Matrix Strategy tren Ubuntu, Windows, macOS.
- `Bai05`: JaCoCo coverage, fail build neu coverage duoi 80%.
- `Bai06`: GitHub Actions Maven dependency caching.
- `Bai07`: Pull request automated review voi Checkstyle.
- `Bai08`: dong goi executable jar bang `maven-jar-plugin`.
- `Bai09`: logging chuyen nghiep voi SLF4J/Logback va FileAppender.
- `Bai10`: broken pipeline da sua, kem phan tich log va nguyen nhan loi.

## Cach chay chung

Moi bai la mot Maven project doc lap. Vi du:

```powershell
cd C:\Users\ADMIN\Desktop\BaiTap\LTNC\Week9\Bai05
mvn clean verify
```

Neu PowerShell bao `mvn` khong ton tai, can cai Maven va them Maven `bin` vao bien moi truong `PATH`.

## Ghi chu ve GitHub

Nhung bai yeu cau push len GitHub, chup anh pipeline, branch protection hoac comment bot can repository that va quyen cau hinh GitHub. Cac file workflow va README da duoc tao san de day len repository va kiem chung.
