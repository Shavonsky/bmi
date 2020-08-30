public class BmiService {
    public int calculate (int weight, double growth) {

        double bmi = weight / (growth * growth);
        return (int) bmi;
    }
}
