public class BmiService {
    public int calculate (int weight, int growth) {
        int bmi = weight / (growth * growth) / 100 / 100;
        return bmi;
    }
}
