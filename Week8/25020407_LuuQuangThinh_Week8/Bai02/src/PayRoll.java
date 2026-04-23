public class PayRoll {
    private static final double SOCIAL_INSURANCE_RATE = 0.08;
    private static final double HEALTH_INSURANCE_RATE = 0.015;
    private static final double PERSONAL_DEDUCTION = 11000000;

    private static final double TAX_LEVEL_1_CAP = 5000000;
    private static final double TAX_LEVEL_2_CAP = 10000000;
    private static final double TAX_RATE_L1 = 0.05;
    private static final double TAX_RATE_L2 = 0.10;
    private static final double TAX_BASE_L2 = 250000;
    private static final double TAX_BASE_L3 = 750000;

    private double calculateActualSalary(double baseSalary, int workDays, int totalDays) {
        return baseSalary * workDays / totalDays;
    }

    private double calculateInsurance(double actualSalary) {
        double socialInsurance = actualSalary * SOCIAL_INSURANCE_RATE;
        double healthInsurance = actualSalary * HEALTH_INSURANCE_RATE;
        return socialInsurance + healthInsurance;
    }

    private double calculateTax(double actualSalary, double insurance, double taxRate) {
        double taxableIncome = actualSalary - insurance - PERSONAL_DEDUCTION;
        if (taxableIncome <= 0) return 0;

        if (taxableIncome <= TAX_LEVEL_1_CAP) {
            return taxableIncome * TAX_RATE_L1;
        } else if (taxableIncome <= TAX_LEVEL_2_CAP) {
            return TAX_BASE_L2 + (taxableIncome - TAX_LEVEL_1_CAP) * TAX_RATE_L2;
        } else {
            return TAX_BASE_L3 + (taxableIncome - TAX_LEVEL_2_CAP) * taxRate;
        }
    }

    public void printPayroll(String name, double baseSalary, int workDays, int totalDays, double taxRate, double bonus) {
        double actualSalary = calculateActualSalary(baseSalary, workDays, totalDays);
        double insurance = calculateInsurance(actualSalary);
        double tax = calculateTax(actualSalary, insurance, taxRate);
        double netSalary = actualSalary - insurance - tax + bonus;

        System.out.println("=== BẢNG LƯƠNG (REFACTORED) ===");
        System.out.println("Nhân viên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
        System.out.println("Ngày công: " + workDays + "/" + totalDays);
        System.out.println("Lương thực tế: " + actualSalary);
        System.out.println("Bảo hiểm: " + insurance);
        System.out.println("Thuế TNCN: " + tax);
        System.out.println("Thưởng: " + bonus);
        System.out.println("Thực nhận: " + netSalary);
    }


}
