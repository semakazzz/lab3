import java.util.Objects;
import java.util.Scanner;
public class Carlson extends AHuman{
    Carlson (String name) {
        this.name = name;
        this.place = null;
    }
    protected float count;
    public String comeBack(){

        return ( name + " возвращался");
    }
    public String see (Malish h) {
        return name + " заметил " + h.getName() + "а. ";
    }
    public String dive () {
        return name + " спикировал вниз и ";
    }
   // public String rush(Objects o) {
       // return "промчался мимо " + o.getName() + " на такой скорости, что ";
    //}
    public String comeBack(Place place) {
        class House {
            private String name;
            House(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }
        House loc = new House("зеленый домик");
        return name + " возвращался в свой " + loc.getName() + " на " + place.getName() + ". ";
    }

    public class NumException extends Exception {
    }
    public void rush (Place place) {
        System.out.println('\n' + "Как думаете, с какой скоростью летает Карлсон? Ответ дайте в км/ч");
        Scanner sc = new Scanner(System.in);
        try {
            int x = Integer.parseInt(sc.next());
            if (x == 0 || x < 0) {
                try {
                    throw new NumException();
                } catch (Exception e) {
                    System.out.println("Пожалуйста, введите положительное значение.");
                    this.rush(place);
                }
            } else {
                count = x;
                System.out.println(name +" промчался мимо "+ place.getName() + " со скоростью " + x + " км/ч , что аж ");
            }
        } catch (NumberFormatException e) {
            System.out.println("пожалуйста, введите число");
            this.rush(place);
        }
    }
    public String fly(){
        return name + " улетел";
    }
    public String recall(){
        return name +" вспоминает что у него день рождения";
    }

}
