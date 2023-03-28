package Phone;

public class Phone {

    private String type;
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    private String color;  
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    private Double size;
    public void setSize(Double size) {
        this.size = size;
    }
    public Double getSize() {
        return size;
    }
    
    private String model;
    
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public Phone()
    {
        this.color = "Gray";
        this.type = "iPhone";
        this.size = 6.8;
        this.model = "12 Pro";
    }

    public Phone(String pType, String pModel)
    {
        this.color = "Gray";
        this.type = pType;
        this.size = 6.8;
        this.model = pModel;
    }

    public Phone(String pType, String pModel, String pColor)
    {
        this.color = pColor;
        this.type = pType;
        this.size = 6.8;
        this.model = pModel;
    }

    
    //This function will check whether if the phone is a iphone
    public Boolean IsThisAIphone()
    {
        if(this.type.equalsIgnoreCase("iPhone"))
        {
            return true;
        }
        else
        {
            return false;
        }    
    }

    //This function will return the type and the model of the phone
    public String getPhoneTypeAndModel()
    {
        String retVal = this.type + " " + this.model;
        return retVal;
    }
    
}
