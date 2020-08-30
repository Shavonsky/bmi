public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();

       double bmiService = service.calculate(80, 160);
        System.out.println(bmiService);

        double bmiService1 = service.calculate(100, 180);
        System.out.println(bmiService1);
    }
}
