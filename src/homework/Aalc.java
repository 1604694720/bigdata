package homework;

public class Aalc {
    double chang;
    double kuan;
    double gao;

    public Aalc(double chang, double kuan, double gao) {
        this.chang = chang;
        this.kuan = kuan;
        this.gao = gao;
    }

    public double alsVolume(){
        return chang*kuan*gao;
    }
}
