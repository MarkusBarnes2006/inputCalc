import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        int avg = 0;
        Scanner input = new Scanner(System.in);

        while (true) {

            try{
                String line = input.nextLine();
                int num = Integer.parseInt(line);
                sum = sum + num;
                count = count + 1;
            }catch (Exception e){
                break;
            }


        }



        if(count == 0){
            avg = 0;
        }else{
            avg = sum / count;
        }
        System.out.println("SUM = " + sum + " AVG = " + avg );
    }


}
