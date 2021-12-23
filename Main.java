public class Main {

    public static void main(String[] args) {
        Place home = new Place("Дом");
        Malish Malish = new Malish("Малыш");
        Carlson Carlson = new Carlson("Карлсон");
        StoryTeller Storyteller = new StoryTeller("Рассказчик");

        Objects Barrel = new Objects ("Бочонок");
        Objects House = new Objects ("Зеленый домик");
        Objects Roof = new Objects("Крыша");
        Objects Window = new Objects("Окно");
        Objects Air = new Objects("Воздух");

        Malish.setTypeOfHand(TypeOfHands.BUSY);
        Carlson.setTypeOfHand(TypeOfHands.CHUBBY);
        System.out.print(Storyteller.speakAtBeginning(Barrel,Carlson));
        System.out.println(Carlson.comeBack() + House.putIn(House)+ Roof.putOn(Roof));
        System.out.print(Carlson.see(Malish)+ Carlson.dive() + Carlson.rush(Window));
        System.out.print(Air.whistle(Air));
        System.out.println(Malish.wave());
        System.out.println(Carlson.wave());


    }
}
