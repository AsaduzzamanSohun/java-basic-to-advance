public class java_loop {
    public static void main(String[] args) {

//        ------------------ while loop -------------------

//        Table
        int n = 2;
        int i = 1;

        while (i <= 10){
            System.out.println(n + " x " + i + " = " + n*i);
            i++;
        }

//        even and odd in 1-30
        int num = 0;
        int num1 = 0;

//        even
        while (num <= 30){
            if (num % 2 == 0){
                System.out.println("Even: " + num);
            }
            num++;
        }

//        odd and square it
        while (num1 <= 30){
            if (num1 % 2 != 0){
                System.out.println("odd: " + (Math.pow(num1, 2)));
            }
            num1++;
        }

//        =================================================================================


//        ------------------------- for loop ---------------------------

//        table
        for (int x = 1; x <= 10; x++){

            int val = 3;
            System.out.println(val + " x " + x + " = " + x*val);

        }

//        even and to the power 3
        for (int y = 0; y <= 10; y++){
            if (y % 2 == 0){
                System.out.println("result: " + (Math.pow(y, 3)));
            }
        }

//        odd, break, continue, nested conditions
        for (int z = 0; z <= 100; z++){

            if (z % 2 != 0){

                if (z >= 30 && z <= 50){
                    continue;
                } else if (z > 75) {
                    break;
                }

                System.out.println("z: " + z);
            }
        }


//        even, break, continue, nested condition
        for (int m = 0; m <= 100; m++){

            if (m % 2 == 0){
                if (m > 36 && m < 60){
                    continue;
                } else if ( m > 88) {
                    break;
                }
                System.out.println("m: " + m);
            }
        }
    }
}
