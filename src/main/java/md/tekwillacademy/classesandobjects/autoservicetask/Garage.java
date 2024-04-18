package md.tekwillacademy.classesandobjects.autoservicetask;

public class Garage {

    String address;

    int numberOfBoxes;

    Double dimensionSqFt;

    public Garage(String addressUsedForInitialization, int numberOfBoxes, double dimensionSqFt){
        address = addressUsedForInitialization;
        this.numberOfBoxes = numberOfBoxes;
        this.dimensionSqFt = dimensionSqFt;

    }
    public Garage(){
        System.out.println(" A fost creat un obiect care insa nu are nici un parametru populat cu date concrete, acesta" +
                " este constructor definit fara parametri");
    }
}
