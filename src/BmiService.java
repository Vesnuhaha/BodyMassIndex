public class BmiService {
    public int calculate(int weight, double growth) {
        double index = weight / (growth * growth);
        return (int) index;
    }
}
