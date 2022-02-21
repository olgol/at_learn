public class Task21 {

    public static void main(String[] args) {

        //
        double a, b, c, D;
        double x1, x2;
        a = 6; // a не равно 0
        b = 20;
        c = 12;

        D = b * b - 4 * a * c;

        if (D == 0) {
            x1 = (-b) / (2 * a);
            x2 = x1;
            System.out.printf("X1 = X2 = %s", x1);
        } else if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("X1 = %s, X2 = %s", x1, x2);

        } else if (D < 0) {
            System.out.println("Нет целого решения потом что дискриминант меньше нуля");
        }
    }

}
