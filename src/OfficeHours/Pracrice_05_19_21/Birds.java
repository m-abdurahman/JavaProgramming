package OfficeHours.Pracrice_05_19_21;

public class Birds {
    private String species;
    private boolean canFly;
    private double beakLength;

    public String getSpecies(){
        return species;
    }
    public void setSpecies (String species) {
        if (species == null) {

        }
        this.species = species;
    }


    public boolean isCanFly(){
        return canFly;
    }
    public void setCanFly(boolean canFly){
        this.canFly = canFly;
    }

    public double getBeakLength(){
        return beakLength;
    }
    public void setBeakLength(double beakLength){
        this.beakLength = beakLength;
    }
}
