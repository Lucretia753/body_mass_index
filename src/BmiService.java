public class BmiService {
    public double calculate(double a) {

        double  bodyMassIndex = a / (1.85 * 1.85);
        return bodyMassIndex;
    }
}
