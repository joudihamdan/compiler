package ErrorCheck;

import java.util.ArrayList;

public class StoreError {
    public static ArrayList<String> errorList = new ArrayList<>();
    public static boolean haveSemanticError = false;
    public static int counter = 0;
    public static ArrayList<Pair> rangeIsAvailableDefine = new ArrayList<>();

    public static class Pair {
        public int first;
        public int second;

        public Pair(int line, int line1) {
            first = line;
            second = line1;
        }
    }
}

