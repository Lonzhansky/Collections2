package lesson17.demos._02_Streams_Parallel._02;

import java.util.List;

public class DataHandler {

    public double handleData(List<Product> list, String category) {
        return list.parallelStream()
                .filter(e -> e.getCategory().equals(category))
                .mapToDouble(e -> e.getPrice())
                // або
//                .mapToDouble(Product::getPrice)
                .average().orElseThrow(IllegalStateException::new);
    }

    public String formOutput(String category, double avgPrice) {
        return String.format("Average price for category '%s' is EUR %.2f",
                category, avgPrice);
    }
}
