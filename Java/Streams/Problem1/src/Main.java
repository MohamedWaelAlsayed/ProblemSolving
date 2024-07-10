import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11));
        Optional<Integer> secondSmallest = nums.stream().distinct().sorted().skip(1).findFirst();
        System.out.println(secondSmallest.orElse(-555555555));
        Optional<Integer> secondLargest = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
                .findFirst();
        System.out.println(secondLargest.orElse(-555555555));
    }
}
