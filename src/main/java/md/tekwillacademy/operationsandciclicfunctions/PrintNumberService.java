package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        //sum of the odd number from 0 to 1000
        int totalSum = 0;


        for (int iterator  = 0; iterator<= 1000; iterator++){
            System.out.println("Iterator" + iterator);
            if(iterator % 2== 1 ){
                totalSum = totalSum + iterator;
                //total sum = total sum + iterator;

                System.out.println("Total sum"+ totalSum);
                System.out.println("Iterator:"+iterator);
            }
        }
        System.out.println("Total Sum last one" + totalSum);

        for (int i =1; i <= 10; i += 2 ){
            System.out.println("i: " + i);

        }
        int a = 0;
        for (;a < 10; a++);{
        System.out.print(a + " ");
        }
        int b = 0;
        for (;b < a;){
            System.out.print(b + " ");
            b+=2;
        }
    }
}
