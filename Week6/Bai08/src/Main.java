public class Main {
    public static void main(String[] args) {
        Report report = new Report("New report", "Report title");

        ReportFormatter rp1 = new JsonFormatter();
        ReportFormatter rp2 = new XmlFormatter();

        ReportService rs1 = new ReportService(rp1);
        ReportService rs2 = new ReportService(rp2);

        System.out.println(rs1.export(report));
        System.out.println(rs2.export(report));

    }
}
