package org.example;

public class Part {
    private String identifier;
    private String manufacturer;
    private String description;

    public Part(String identifier, String manufacturer, String description) {
        this.description = description;
        this.identifier = identifier;
        this.manufacturer = manufacturer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}


class Engine extends Part {
    private String engineType;

//    in case of private variable and methods, a sub class cannot access the private properties of the superclass
//    unless they use a public method that calls the private properties of the superclass
//    if we want to access the properties of a superclass which are only visible to subclass but invible to anybody else
//    then we can use 'protected'

    public Engine(String identifier, String manufacturer, String description, String engineType ) {
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }


}