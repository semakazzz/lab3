public class Objects extends AObjects {

    Objects(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    Objects(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public String toString() {
        Place PN = getPlace();
        return "Object{" +
                "name = '" + name + "', " +
                "place = " + PN.getName() +
                "}";
    }

    public class Air {
        public String whistle() {
            return "Воздух засвистел. ";
        }
    }
}




