public class Main{
    public static void main(String[] args) {
        Person p = new Person("Thang");
        p.setMe(p);
        System.out.println(p.getMe().getName());
        p = null;
        /*
        +) Sau khi setMe co dung 1 doi tuong Person trong bo nho Heap.
        +) Doi tuong Person co bi xoa khoi bo nho, vi khong con Bien nao gan dia chi cua no trong Stack nua. Nhung chi khi Bo nho Heap dat den gioi han thuat toan. Va no duoc danh dau san la rac
        +) Garbage Collection thu thap cac Object trong bo nho Heap khi no unreachable boi Stack.
        +) Doi tuong Person bi, va khong the truy cap lai. Vi lien ket giua doi tuong toi bo nho Stack da bi dut khi p = null.
        +) TF
         */
    }
}