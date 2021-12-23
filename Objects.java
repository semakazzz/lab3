public class Objects extends AObjects{

    Objects(String name, Place place){
        this.name = name;
        this.place = place;
    }

    Objects(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public  Place getPlace(){
        return place;
    }

    @Override
    public  String toString(){
        Place  PN = getPlace();
        return "Object{" +
                "name = '" + name + "', " +
                "place = " + PN.getName() +
                "}";
    }
    public String putIn (Objects o){
        return " в " + o.getName();
    }
    public String putOn (Objects o) {
        return " на " + o.getName()+ ". ";
    }
    public String whistle (Objects o) {
        return o.getName() + " засвистел. ";
    }





    }