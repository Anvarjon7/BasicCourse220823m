package lessons.lesson17.innerClass.typicalWay;

public class Train {
    Vagon vagon1;
    Vagon vagon2;
    Vagon vagon3;

    public Train(Vagon vagon1) {
        this.vagon1 = vagon1;
    }

    public Train(Vagon vagon1, Vagon vagon2, Vagon vagon3) {
        this.vagon1 = vagon1;
        this.vagon2 = vagon2;
        this.vagon3 = vagon3;
    }
}
