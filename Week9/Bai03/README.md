# Bai 03 - CI/CD Automation

Workflow `.github/workflows/ci.yml` chay khi `push` va `pull_request`.

- Build lifecycle: `mvn clean package`.
- Pha `test` duoc Maven chay truoc `package`.
- Artifact `.jar` trong `target/*.jar` duoc upload bang `actions/upload-artifact`.

De kiem thu pipeline do, co the tam thoi sua expected value trong `MathServiceTest`, push len GitHub, doc log tai tab `Actions`, sau do sua lai test va push lan nua.
