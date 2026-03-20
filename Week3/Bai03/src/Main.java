public class Main {
    public static void main(String[] args) {
        MathUtils m = new AdvancedMath();

        System.out.println(m.sum(5,5));

//        System.out.println(m.sum(5.5, 5.5));
        // Dong a ra la 20, vi ham trong AdvancedMath da overide len ham trong MathUtils, sau do lai duoc ep kieu ve MathUtils
        // Dong b se loi vi thuc ra no khong co ham do, chua khoi tao, con ham trong TH A da OVerride len

    }
}
