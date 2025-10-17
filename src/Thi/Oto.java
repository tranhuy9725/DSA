package Thi;

public class Oto {
    private String bienSoXe;
    private String tenXe;
    private String mauXe;

    public Oto(String bienSoXe, String tenXe, String mauXe) {
        this.bienSoXe = bienSoXe;
        this.tenXe = tenXe;
        this.mauXe = mauXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "bienSoXe='" + this.bienSoXe + '\'' +
                ", tenXe='" + this.tenXe + '\'' +
                ", mauXe='" + this.mauXe + '\'' +
                '}';
    }
}
