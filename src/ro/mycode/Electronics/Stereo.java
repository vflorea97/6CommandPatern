package ro.mycode.Electronics;

public class Stereo extends Electronics{

    private String cd;
    private String dvd;
    private int volume;
    private String radio;

    public Stereo() {
    }

    public Stereo(String location) {
        super(location);
    }

    public void on() {
        System.out.println("Stereo is on");
    }
    public void off() {
        System.out.println("Steeo is off");
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }
}
