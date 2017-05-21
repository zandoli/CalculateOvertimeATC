public class Overtime {
    double ovr(double sal, double hrs, double hrswh, double mls) {
        double x = (sal / 20 / 6) * hrs * 2.5;
        double y = (sal / 20 / 6) * hrswh * 3;
        return x + y + mls * 32;
    }
}
