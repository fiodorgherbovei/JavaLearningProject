package md.tekwillacademy.accesmodifiers;

import md.tekwillacademy.accesmodifiers.peopleevidence.Person;

public class ChisinauEvidenceService {

    public static void main(String[] args) {
        Person fedotPatanTalcovii = new Person();

        Person marcelBoy = new Person("Marcel Bivol",60960701,25,"male");

        System.out.println(marcelBoy.getAge());
        System.out.println(fedotPatanTalcovii.getAge());

        fedotPatanTalcovii.name = "Fedot";

        marcelBoy.name = "Ignat";

        Person vadimasTalcovii = new Person("Vadim Talcovii","Male");
        System.out.println("Numele obiectului vadimasTalcovii " +vadimasTalcovii.name);
        System.out.println(vadimasTalcovii.getGender());
        System.out.println(vadimasTalcovii.toString());

        System.out.println(Person.nationality);
        Person.nationality="Moldovean Editat";
        System.out.println(Person.nationality);




    }


}
