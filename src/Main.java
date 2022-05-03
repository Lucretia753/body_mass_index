public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 75;
        double height = 1.85;
        double bodyMassIndex = service.calculate(weight / (height * height));

        System.out.println("BMI for weight " + weight + "kg.");
        System.out.println("and height " + height + "m");
        System.out.println("is equivalent to " + bodyMassIndex + ".");
    }
}