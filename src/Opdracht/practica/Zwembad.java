package Opdracht.practica;

public class Zwembad{
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad (double br, double lt, double dp) {
        breedte = br;
        lengte = lt;
        diepte = dp;
    }

    public Zwembad () {}

    public double getBreedte() {
        return breedte;
    }
    public double getLengte () {
        return lengte;
    }
    public double getDiepte () {
        return diepte;
    }

    public void setBreedte (double br) {
        breedte = br;
    }

    public void setLengte (double lt) {
        lengte = lt;
    }
    public void setDiepte (double dp) {
        diepte = dp;
    }

    public double inhoud () {
        return breedte * lengte * diepte;
    }
    public String toString (){
        return " Dit Zwembad is" + breedte + "hoog," + lengte + "lang en" + diepte + "diep";
    }
}
