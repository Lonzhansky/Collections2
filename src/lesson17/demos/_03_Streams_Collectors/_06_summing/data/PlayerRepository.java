package lesson17.demos._03_Streams_Collectors._06_summing.data;

import java.util.Arrays;
import java.util.List;

public class PlayerRepository {

    public List<Player> getData() {
        return Arrays.asList(
                new Player("Tom", Arrays.asList(9, 8, 4)),
                new Player("Alice", Arrays.asList(7, 5, 10)),
                new Player("Bob", Arrays.asList(6, 8, 5)));
    }
}
