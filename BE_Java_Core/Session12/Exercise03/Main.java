package vn.edu.rikkei.session12.ex03;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SO SÁNH GIÁ SẢN PHẨM SAU KHUYẾN MÃI ---");
        System.out.println("SP Điện tử: \"Laptop Dell\", Giá 10,000,000 (Giảm 5%)");
        System.out.println("SP Thời trang: \"Áo khoác Jean\", Giá 1,000,000 (Giảm 20%)\n");

        Product laptop = new ElectronicProduct("E01", "Laptop Dell", 10000000.0);
        Product jacket = new FashionProduct("F01", "Áo khoác Jean", 1000000.0);

        System.out.println("+-------------------------------------------------+");
        System.out.println("|           BẢNG GIÁ SẢN PHẨM KHUYẾN MÃI          |");
        System.out.println("+-------------------------------------------------+");

        System.out.printf("| [%-13s] Niêm yết: %,10.0f | Sau KM: %,9.0f|\n",
                laptop.getName(), laptop.getOriginalPrice(), laptop.getDiscountedPrice());
        System.out.printf("| [%-13s] Niêm yết: %,10.0f | Sau KM: %,9.0f|\n",
                jacket.getName(), jacket.getOriginalPrice(), jacket.getDiscountedPrice());

        System.out.println("+-------------------------------------------------+");
    }
}
