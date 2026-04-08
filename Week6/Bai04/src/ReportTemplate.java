import java.util.ArrayList;
import java.util.List;

public class ReportTemplate{
    private String title, footer;
    private List<String> sections;

    public ReportTemplate(){
        this.sections = new ArrayList<>();
    }

    public ReportTemplate(ReportTemplate obj){
        this.title = obj.title;
        this.footer = obj.footer;
        this.sections = new ArrayList<>(obj.sections);
    }

    @Override
    public ReportTemplate clone(){
//        ReportTemplate reportTemplate = (ReportTemplate) super.clone();
        return new ReportTemplate(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ReportTemplate{" +
                "footer='" + footer + '\'' +
                ", title='" + title + '\'' +
                ", sections=" + sections +
                '}';
    }

    public List<String> getSections() {
        return sections;
    }

    public void setSections(List<String> sections) {
        this.sections = sections;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }


    public static void main(String[] args) {
        ReportTemplate temp1 = new ReportTemplate();
        temp1.setFooter("Hehehe1");
        temp1.setTitle("Report1");
        temp1.setSections(new ArrayList<>(List.of(new String[]{"Str1", "Str2"})));

        ReportTemplate temp2  = temp1.clone();
        temp2.setTitle("report2");

        ReportTemplate temp3 = temp1.clone();
        temp3.setFooter("Hehehe3");

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
    }
}
