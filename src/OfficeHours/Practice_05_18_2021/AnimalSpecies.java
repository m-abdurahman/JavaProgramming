package OfficeHours.Practice_05_18_2021;

public class AnimalSpecies {
    String name;
    int population;
    int growthRate;

    public void setInfo(String setName, int setPopulation, int setGrowthRate) {
        name = setName;
        population = setPopulation;
        growthRate = setGrowthRate;
    }

    public String getName() {
        if (name == null) {
            return "No name defined";
        }
        return name;
    }


    public int getPopulation() {
        return population;

    }

    public int getGrowthRate(){
        return growthRate;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population + "million" +
                ", growthRate=" + growthRate + "%" +
                '}';
    }
}

