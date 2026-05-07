# Bai 07 - Automated Code Review via Pull Request

Workflow chi trigger khi co `pull_request` vao nhanh `main`.

`mvn clean verify` chay test va Checkstyle. Neu co loi format, job fail va branch protection se chan merge.

Thiet lap Branch Protection tren GitHub:

1. Vao `Settings > Branches > Add branch protection rule`.
2. Branch name pattern: `main`.
3. Bat `Require status checks to pass before merging`.
4. Chon status check cua workflow `Pull Request Review`.
5. Bat `Require pull request reviews before merging` neu muon bat buoc review nguoi that.

De kiem chung, tao PR co loi Checkstyle co y, vi du dat ten method `BAD_name`. Bot se comment inline va merge bi khoa cho den khi sua loi.
