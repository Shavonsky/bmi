public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();

       int BmiService = service.calculate(80, 160);
        System.out.println(BmiService);

        int BmiService1 = service.calculate(100, 180);
        System.out.println(BmiService1);
    }
}
