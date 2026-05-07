# Bai 06 - Maven Dependency Caching

Workflow su dung:

```yaml
cache: 'maven'
```

trong `actions/setup-java@v4`.

Sau 2 lan push lien tiep, vao GitHub Actions log va tim cac dong dang:

```text
Cache restored from key: setup-java-Linux-maven-...
```

Lan dau thuong cham hon vi phai tai dependency tu Maven Central. Lan sau nhanh hon vi dependency nam trong cache.
