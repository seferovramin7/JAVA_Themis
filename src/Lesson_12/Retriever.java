package Lesson_12;

public class Retriever extends Wolf {


    boolean domestic;


    public Retriever(String name, int age, String colorOfFur, boolean domestic) {
        super(name, age, colorOfFur);
        this.domestic = domestic;
    }


    @Override
    public void eating() {
        System.out.println("Eating at home");
    }


    //


    // Overloading
    public void eating(String food) {
        System.out.println("Eating at home " + food);
    }




    public void eating(String food, String asdfg) {
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
        System.out.println("Eating at homasdfasfaffcADDSFSDFe " + food);
    }

}
