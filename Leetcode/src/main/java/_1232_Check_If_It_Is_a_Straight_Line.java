public class _1232_Check_If_It_Is_a_Straight_Line {
    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) return true;

        int[] prevX = new int[2];
        prevX[0] = coordinates[0][0];
        prevX[1] = coordinates[1][0];
        int[] prevY = new int[2];
        prevY[0] = coordinates[0][1];
        prevY[1] = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int curX = coordinates[i][0];
            int curY = coordinates[i][1];
            double difX1 = curX - prevX[1];
            double difX0 = curX - prevX[0];
            double difY1 = curY - prevY[1];
            double difY0 = curY - prevY[0];
            System.out.println("X");
            System.out.printf("PrevX: [1]: %d, [0]: %d\n", prevX[1], prevX[0]);
            System.out.printf("DifX1: %f, DifX0: %f, kX: %f\n", difX1, difX0, difX1 / difX0);
            System.out.println("Y");
            System.out.printf("PrevY: [1]: %d, [0]: %d\n", prevY[1], prevY[0]);
            System.out.printf("DifY1: %f, DifY0: %f, k: %f\n", difY1, difY0, difY1 / difY0);
            if (difX1 != 0 && difX0 != 0) {
                double k = difX1 / difX0;

                if (difY1 != difY0 * k) return false;
                else {
                    // Gan lai
                    prevX[0] = prevX[1];
                    prevY[0] = prevY[1];
                    prevX[1] = curX;
                    prevY[1] = curY;
                    System.out.println("Reassign");
                    System.out.printf("PrevX: [1]: %d, [0]: %d\n", prevX[1], prevX[0]);
                    System.out.printf("PrevY: [1]: %d, [0]: %d\n", prevY[1], prevY[0]);
                }
            } else if (difY1 != 0 && difY0 != 0) {
                double k = difY1 / difY0;

                if (difX1 != difX0 * k) return false;
                else {
                    prevX[0] = prevX[1];
                    prevY[0] = prevY[1];
                    prevX[1] = curX;
                    prevY[1] = curY;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = new int[7][2];

//            checkStraightLine()
    }
}
