public class Report {
    private String title, content;

    public Report(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Report{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
