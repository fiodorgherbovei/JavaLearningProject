package md.tekwillacademy.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("str. Sfintul Gheorghe 10",7,25.7);
        System.out.println(masterLuxObject.address);

        Garage saleapsGarageLux = new Garage ();
        saleapsGarageLux.address = "Stefan cel Mare 7";
        saleapsGarageLux.numberOfBoxes=7;
        saleapsGarageLux.dimensionSqFt=25.7;

        System.out.println("Informatii despre obiectul saleapsGarageLux de pe adresa " + saleapsGarageLux.address+
                " cu numarul de boxe "+saleapsGarageLux.numberOfBoxes+
                " si suprafata "+saleapsGarageLux.dimensionSqFt);

        Tool hummer011 = new Tool("Hummer");
        System.out.println(hummer011.nameOfTheTool);


        Tool key = new Tool("Lucky Key");
        System.out.println(key.nameOfTheTool);

        Worker fedotPatanTalcovii = new Worker(" Fedot ");
        fedotPatanTalcovii.yearOfExperience = 7;
        System.out.println(fedotPatanTalcovii.yearOfExperience);

        Worker adrianPatanTalcovii = new Worker();
        System.out.println(adrianPatanTalcovii.name);

        Car masinaLuiFedot= new Car("Renault", "White", 5,1470 );
        System.out.println(masinaLuiFedot.make);

        Car masinaLuiDaniela = new Car("Lamborgini", "Tiffany",3, 3500);
        System.out.println(masinaLuiDaniela.colorOfTheCar);

    }
}

//suma numerelor pare pina la n.