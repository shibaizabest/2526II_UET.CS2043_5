public class CreateExcelExport implements CreateExport{

    @Override
    public Export create() {
        return new ExcelExport();
    }
}