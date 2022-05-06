public class BmiService {
    public double calculate(double weight) {

        double  bodyMassIndex = weight / (1.85 * 1.85);
        return bodyMassIndex;
    }
}
