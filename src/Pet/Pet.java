package Pet;

public class Pet {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private double age;

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    void Pet()
    {
        this.name = "lucky";
        this.age = 0;
        this.location = "Dallas";
        this.type = "German Shepherd";
    }

    void Pet(String pName, double pAge, String pLoc, String pType)
    {
        this.name = pName;
        this.age = pAge;
        this.location = pLoc;
        this.type = pType;
    }

    
}
