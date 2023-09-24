package class25;

import java.util.ArrayList;

abstract class Insurance {
    //Create a class Insurance that will have an attribute as InsuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    // Create 3 subclasses Car,Pet,Health. Car class has its own attribute as carModel and class Pet has petType attribute.
    // Create 3 objects of the subclasses and store them in Arraylist using for loop/iterator/advance for loop access all methods of the class
        private String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    // public Insurance(String insuranceName){
          //  setInsuranceName(insuranceName);
       // }
       // public void setInsuranceName(String insuranceName) {
         //   this.insuranceName = insuranceName;
        //}
       abstract void getQuote();

       abstract void cancelInsurance();
        }


    class Car extends Insurance {

        private String carModel;

        public Car(String insuranceName, String carModel) {
            super(insuranceName);
            setCarModel(carModel);
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }


        @Override
        public void getQuote(){
            System.out.println("This is premium insurance for your amazing new car mode " + carModel);
        }

        @Override
        public void cancelInsurance(){
            System.out.println("I am not happy with your car insurance for my " + carModel +", hence I am requesting to cancel");
        }


    }

    class Pet extends Insurance {
        private String petType;

        public Pet(String insuranceName, String petType) {
            super(insuranceName);
            setPetType(petType);
        }

        public void setPetType(String petType) {
            this.petType = petType;
        }

        @Override
        public void getQuote(){
            System.out.println("This is premium insurance for your cute new pet " + petType);
        }

        @Override
        public void cancelInsurance(){
            System.out.println("I am not happy with your Pet insurance for my " + petType + " hence I am requesting to cancel");
        }
    }

    class Health extends Insurance {

        public Health(String insuranceName) {
            super(insuranceName);
        }

        @Override
        public void getQuote(){
            System.out.println("This is premium insurance for your health");
        }

        @Override
        public void cancelInsurance(){
            System.out.println("I am not happy with your health  insurance premium, hence I am requesting to cancel");
        }

    }

    class InsuranceTester{
        public static void main(String[] args) {

            ArrayList<Insurance> insurances = new ArrayList<>();

            insurances.add(new Car("MetLife", "Ferrari"));
            insurances.add(new Pet("MetLife", "Labrodor"));
            insurances.add(new Health("MetLife"));

            for(int i = 0; i < insurances.size(); i++){
                System.out.println("----------");
                insurances.get(i).getQuote();
                insurances.get(i).cancelInsurance();
            }
        }
    }



