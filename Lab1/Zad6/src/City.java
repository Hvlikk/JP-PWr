public class City {

    private Integer population;
    private String name;

    public City(String name, Integer population){
        this.population = population;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
