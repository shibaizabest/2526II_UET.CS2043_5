public class XmlFormatter implements ReportFormatter{

    @Override
    public String format(Report data) {
        return "XML Format - Data : " + data.toString();
    }
}
