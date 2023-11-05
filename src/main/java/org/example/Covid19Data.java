package org.example;

public class Covid19Data {

    private String region;
    private String alderGruppe;
    private int bekræftede;
    private int døde;
    private int indlagt;


    public Covid19Data( String region, String alderGruppe, int bekræftede, int døde, int indlagt) {
        this.region = region;
        this.alderGruppe = alderGruppe;
        this.bekræftede = bekræftede;
        this.døde = døde;
        this.indlagt = indlagt;

    }

    public String getRegion() {
        return region;
    }

    public String getAlderGruppe() {
        return alderGruppe;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", alderGruppe=" + alderGruppe +
                ", bekræftede=" + bekræftede +
                ", døde=" + døde +
                ", indlagt=" + indlagt +
                '}';
    }
}
