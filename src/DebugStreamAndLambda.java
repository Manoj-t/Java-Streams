import java.util.Arrays;

public class DebugStreamAndLambda {

    public static void main(String[] args) {
        String strArray[] = {"x", "y", "z", "xy", "yz", "xz", "abc", "ab", "a", "b", "c"};

        Object[] outputStrArray = Arrays.stream(strArray).map(s -> s.toUpperCase()).filter(s -> s.length() == 1)
                .sorted().toArray();

        System.out.println(Arrays.toString(outputStrArray)); // printing the array
    }
}
