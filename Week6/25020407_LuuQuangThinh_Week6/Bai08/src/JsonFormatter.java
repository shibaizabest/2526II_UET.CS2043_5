public class JsonFormatter implements ReportFormatter {

    @Override
    public String format(Report data) {
        return "JSON Format - Data : " + data.toString();
    }
}
