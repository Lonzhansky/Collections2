package lesson17.demos._03_Streams_Collectors._06_summing.demos;


import lesson17.demos._03_Streams_Collectors._06_summing.data.PlayerRepository;

import java.util.stream.Collectors;

public class Main03 {

    public static void main(String[] args) {

        PlayerRepository repository = new PlayerRepository();

        repository.getData().forEach(player -> {
            System.out.print("Player " + player.getName());
            int pointsSum = player.getPoints().stream()
                    // WARNING: 'collect(summingInt())' can be replaced with 'mapToInt().sum()'
                    .collect(Collectors.summingInt(Integer::intValue));
            System.out.println(", points sum is " + pointsSum);
        });

//        repository.getData().forEach(player -> {
//            System.out.print("Player " + player.getName());
//            int pointsSum = player.getPoints().stream()
//                    .mapToInt(Integer::intValue).sum();
//            System.out.println(", points sum is " + pointsSum);
//        });
    }
}
