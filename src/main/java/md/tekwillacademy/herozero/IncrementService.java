package md.tekwillacademy.herozero;

public class IncrementService {
    public static void main(String[] args) {

        int a=  1;

        a = a +1;

        System.out.println(a);

        a += 1;
        System.out.println(a);

        a++;
        System.out.println(a);

        int b = a;
        System.out.println(b);

        b=++a;
        System.out.println(a);

        a=2;
        b=--a;
        System.out.println("b=" + b + "a="+a );

        a=7;
        b=6;
        a=--b;
        System.out.println("a=" + b + "a="+ a);


        for (int i = 0; i< a; i+=1){
            System.out.println(" Iteratie noua ");
            System.out.println(" Valoarea lui i este " + i);
            System.out.println(" Finish iteratie ");


        }
        int i=10;
        int sum = 0;

        while (i> 0){
            System.out.println("iteratie de i :" + i);
            sum = sum + i;
            System.out.println("i = " + i +" sum = " + sum);
            i--;
        }


        System.out.println(sum(5));
    }
static int  sum(int limit) {
    if (limit == 0) {
        return 1;
    } else {
        System.out.println("Iteratie : " + limit);
        return sum(limit - 1);
    }
}
}
