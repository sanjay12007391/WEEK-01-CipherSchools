// Dynamic Polymorphism
abstract  class Doctor{
    abstract void treatPatient();
}

class Physician extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Physician \nI Treat Patients using Medicines");

    }
}

class Surgeon extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Surgeon \nI Treat Patients using Surgery");

    }
}

class Dentist extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Dentist \nI Treat Patients using Teeth");

    }
}
public class DynamicPoly {
    public static void main(String[] args) {
        System.out.println("HI! I am Lucy! Receptionist at Max Care");
        System.out.println("Who you are looking for?");
        System.out.println("Press 1. Physician\n2. Surgeon \n3. Dentist");

        int choice = new java.util.Scanner(System.in).nextInt();

        Doctor doc = null;

        //Polymorphism is the ability/implementation of the base class object
        //i.e Doctor's doc to get intialized/change form using any of the
        // derived class i.e physician/surgeon/dentist.

        switch(choice){
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            case 3:
                doc = new Dentist();
                break;
            default:
                System.out.println("Uh Oh! Invalid Choice");
                break;
        }
        if (choice<0 || choice>3) {
            System.exit(0);
        }
        else {
            doc.treatPatient();
        }
    }
}
