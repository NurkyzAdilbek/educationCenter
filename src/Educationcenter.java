import java.time.LocalDate;

public abstract class Educationcenter {
     private String name;
   private String localdateCountry;
    private LocalDate foundationyear;


    public Educationcenter(String name, String localdateCountry, LocalDate foundationyear) {
        this.name = name;
        this.localdateCountry = localdateCountry;
        this.foundationyear = foundationyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocaldateCountry() {
        return localdateCountry;
    }

    public void setLocaldateCountry(String localdateCountry) {
        this.localdateCountry = localdateCountry;
    }

    public LocalDate getFoundationyear() {
        return foundationyear;
    }

    public void setFoundationyear(LocalDate foundationyear) {
        this.foundationyear = foundationyear;
    }

    @Override
    public String toString() {
        return "Educationcenter{" +
                "name='" + name + '\'' +
                ", localdateCountry='" + localdateCountry + '\'' +
                ", foundationyear=" + foundationyear +
                '}';
    }
}
