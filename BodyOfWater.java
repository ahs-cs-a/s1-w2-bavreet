public class BodyOfWater{
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(string n, double l, double d,boolean s){
        name = n;
        largestDiameter = l;
        avgDepth = d;
        isSaltWater = s;
    }
    public BodyOfWater (string n, double d){
        name = n;
        avgDepth = d;
    }

    //GETTERS

    public void setname( String n){
        name = n;
    }
    public void setlargestDiameter( double l){
        largestDiameter = l;
    }
    public void setavgDepth( String d){
        avgDepth = d;
    }
    public void setisSaltWater( String s){
        isSaltWater = s;
    }


    public String getname(){
        return name;
    }
    public double getlargestDiameter(){
        return largestDiameter;
    }
    public double getavgDepth(){
        return avgDepth;
    }
    public boolean getisSaltWater(){
        return isSaltWater;
    }

}