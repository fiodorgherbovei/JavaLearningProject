package md.tekwillacademy.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        int a= 5;
        int result = a++;
        System.out.println("Result : " + result);
        System.out.println("A : " + a);

        a= 5;
        result= ++a;
        System.out.println("Result : " + result);
        System.out.println("A : " + a);

        a= 5;
        result= --a;
        System.out.println("Result : " + result);
        System.out.println("A : " + a);

        a= 5;
        result= a--;
        System.out.println("Result : " + result);
        System.out.println("A : " + a);

    }
}
