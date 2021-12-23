public class Carlson extends AHuman{
    Carlson (String name) {
        this.name = name;
        this.place = null;
    }
    public String comeBack(){
        return ( name + " возвращался");
    }
    public String see (Malish h) {
        return name + " заметил " + h.getName() + "а. ";
    }
    public String dive () {
        return name + " спикировал вниз и ";
    }
    public String rush(Objects o) {
        return "промчался мимо " + o.getName() + " на такой скорости, что ";
    }


}
