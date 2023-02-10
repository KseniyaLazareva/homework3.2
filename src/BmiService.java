public class BmiService {

    public int calculate(double heightM, double weightKg) {
        int bmi = (int) (weightKg / (heightM * heightM));
        return bmi;
    }
}
