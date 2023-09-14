package lessons.lesson14.classesAndMethods;

public class ShopsInTheTownBerlin {

    boolean isEdekaOpen;
    boolean isReweOpen;

    public boolean canBuy(){

        return (isEdekaOpen || isReweOpen);
    }

}
