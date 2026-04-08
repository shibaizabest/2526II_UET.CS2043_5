class ReportService {
    ReportFormatter formatter;

    public ReportService(ReportFormatter formatter){
        this.formatter = formatter;
    }

    public String export(Report data) {
        return formatter.format(data);
    }
}