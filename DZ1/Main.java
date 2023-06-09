public class Main {
        public static void main(String[] args) {
            try {
                method1();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                method2();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                method3();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void method1() throws NullPointerException {
            String s = null;
            s.length();
        }

        public static void method2() throws ArrayIndexOutOfBoundsException {
            int[] arr = new int[5];
            arr[5] = 10;
        }

        public static void method3() throws IllegalArgumentException {
            throw new IllegalArgumentException("Invalid argument");
        }
    }

