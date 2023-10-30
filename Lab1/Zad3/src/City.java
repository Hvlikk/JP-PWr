public class City {

    private Integer population;
    private String name;

    public City (Integer population, String name){
        this.name = name;
        this.population = population;
    }

    public Integer getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }
}
