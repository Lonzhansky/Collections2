package lesson17.demos._03_Streams_Collectors._06_summing.data;

import java.util.List;

public class Player {

    private final String name;
    private final List<Integer> points;

    public Player(String name, List<Integer> points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getPoints() {
        return points;
    }

}
