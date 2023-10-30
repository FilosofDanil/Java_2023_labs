package lab;

public class Stats {
    private Integer metresCrossed;
    private Integer kgsPushed;

    public Stats() {
        metresCrossed = 0;
        kgsPushed = 0;
    }

    public Integer getMetresCrossed() {
        return metresCrossed;
    }

    public void setMetresCrossed(Integer metresCrossed) {
        this.metresCrossed = metresCrossed;
    }

    public Integer getKgsPushed() {
        return kgsPushed;
    }

    public void setKgsPushed(Integer kgsPushed) {
        this.kgsPushed = kgsPushed;
    }
}
