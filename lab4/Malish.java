public class Malish extends AHuman{
    Malish(String name) {
        this.name = name;
        this.place = null;
}
public String hear(){
        return(name + " слышал как ");
}
public String run(Place o){
        return(name + " подбежал к " + o.getName());
}
public String see(){
        return("увидел");
}
public String clean(Objects o, Objects o1, Place place){
        return(name + " стал собирать тряпкой "+o.getName() +" с "+ o1.getName() +" в "+ place.getName() );

}
}
