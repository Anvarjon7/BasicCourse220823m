package lessons.lesson14.classesAndMethods;

public class ShopsInTheTownFrankfurt {

    boolean isEdekaOpen;
    boolean isReweOpen;

    public ShopsInTheTownFrankfurt(boolean isEdekaOpen, boolean isReweOpen) {
        this.isEdekaOpen = isEdekaOpen;
        this.isReweOpen = isReweOpen;
    }

    public boolean canBuy(){

        return (isEdekaOpen || isReweOpen);
    }

}
