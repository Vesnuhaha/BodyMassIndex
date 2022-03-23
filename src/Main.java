public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int result = service.calculate(59, 1.73);
        System.out.println("Индекс массы тела составляет:" + result);
    }
}

