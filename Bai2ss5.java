public class Bai2ss5 {


        public static void main(String[] args) {
            int iterations = 10_000;

            // --- Test 1: String ---
            long start1 = System.currentTimeMillis();
            String s = "Hello";
            for (int i = 0; i < iterations; i++) {
                s += " World"; // tạo object mới mỗi lần
            }
            long end1 = System.currentTimeMillis();

            // --- Test 2: StringBuilder ---
            long start2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("Hello");
            for (int i = 0; i < iterations; i++) {
                sb.append(" World"); // mutable, không tạo object mới
            }
            long end2 = System.currentTimeMillis();

            // --- Test 3: StringBuffer ---
            long start3 = System.currentTimeMillis();
            StringBuffer sbuf = new StringBuffer("Hello");
            for (int i = 0; i < iterations; i++) {
                sbuf.append(" World"); // thread-safe (synchronized)
            }
            long end3 = System.currentTimeMillis();

            // --- Xuất kết quả ---
            System.out.println("String:        " + (end1 - start1) + " ms");
            System.out.println("StringBuilder: " + (end2 - start2) + " ms");
            System.out.println("StringBuffer:  " + (end3 - start3) + " ms");
        }
    }


