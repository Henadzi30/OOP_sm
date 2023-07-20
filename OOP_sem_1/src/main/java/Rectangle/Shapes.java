package Rectangle;

class Shapes {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(14, 22);
        Rectangle1 r2 = new Rectangle1(62, 94);

        System.out.println("Информация от R1 ");
        r1.showDim();
        System.out.println("Площадь равна " + r1.calculateArea());
        System.out.println("Периметр равен " + r1.calculatePerimetr());

        System.out.println("Информация от R2 ");
        r2.showDim();
        System.out.println("Площадь равна " + r2.calculateArea());
        System.out.println("Периметр равен " + r2.calculatePerimetr());
    }
}