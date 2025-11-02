package Tugas5;

public class BelahKetupat_2511532029 {
    public static void run() {
        int a, b; // memori
        for (int i = 1; i <= 10; i++) {
            if (i == 1 || i == 10) {
                for (int j = 1; j <= 18; j++) {
                    if (j == 1 || j == 18) {
                        System.out.print("#");
                    } else {
                        System.out.print("=");
                    }
                }
            }
            if (i == 2 || i == 9) {
                for (int j = 1; j <= 18; j++) {
                    if (j == 1 || j == 18) {
                        System.out.print("|");
                    } else if (j == 8 || j == 10) {
                        System.out.print("<");
                    } else if (j == 9 || j == 11) {
                        System.out.print(">");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (i == 3 || i == 8) {
                a = 7;
                b = 12;
                for (int j = 1; j <= 18; j++) {
                    if (j == 1 || j == 18) {
                        System.out.print("|");
                    } else if (j == 6 || j == 12) {
                        System.out.print("<");
                    } else if (j == 7 || j == 13) {
                        System.out.print(">");
                    } else if (j > a && j < b) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (i == 4 || i == 7) {
                a = 5;
                b = 14;
                for (int j = 1; j <= 18; j++) {
                    if (j == 1 || j == 18) {
                        System.out.print("|");
                    } else if (j == 4 || j == 14) {
                        System.out.print("<");
                    } else if (j == 5 || j == 15) {
                        System.out.print(">");
                    } else if (j > a && j < b) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (i == 5 || i == 6) {
                a = 3;
                b = 16;
                for (int j = 1; j <= 18; j++) {
                    if (j == 1 || j == 18) {
                        System.out.print("|");
                    } else if (j == 2 || j == 16) {
                        System.out.print("<");
                    } else if (j == 3 || j == 17) {
                        System.out.print(">");
                    } else if (j > a && j < b) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        run(); 
    }
}
