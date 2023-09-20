package lessons.lesson17.innerClass.typicalWay;

public class TrainDemo {
    public static void main(String[] args) {
        Vagon vagon1 = new Vagon();
        Vagon vagon2 = new Vagon();
        Vagon vagon3 = new Vagon();

        Train myTrain = new Train(vagon1,vagon2,vagon3);

        Train train2 = new Train(vagon1);



    }
}
