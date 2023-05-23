package objectOrientedProgramming;

public enum GeoPoliticalZone {
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_WEST("Ekiti", "lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    NORTH_WEST("kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara");
    private String[] states;
    GeoPoliticalZone(String...states){
        this.states = states;
    }
    public GeoPoliticalZone getGeoPoliticalZone(){
        GeoPoliticalZone region = SOUTH_SOUTH;
        if (states.equals("Akwa-ibom") || states.equals("Bayelsa") || states.equals("Cross-River") || states.equals("Delta") || states.equals("Edo") || states.equals("Rivers"));
        return region;
        
    }
}
