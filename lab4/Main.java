public class Main {

    public static void main(String[] args) {
        Place home = new Place("Дом");
        Malish Malish = new Malish("Малыш");
        Carlson Carlson = new Carlson("Карлсон");
        StoryTeller Storyteller = new StoryTeller("Рассказчик");

        Objects Barrel = new Objects ("Бочонок");
        Objects Sausage = new Objects("Сарделька");
        Objects Water = new Objects("Вода");
        Objects Floor = new Objects("Пол");
        Place Roof = new Place("Крыша");
        Place Window = new Place("Окно");
        Place Bathroom = new Place("Ванная");
        Place Hallway = new Place("Прихожая");
        Objects.Air Air = Barrel.new Air();

        Text textBut;
        textBut = () -> "но ";
        Text textIn;
        textIn = () -> "в ";
        Text textNot;
        textNot = () -> " не ";
        Text textAnd;
        textAnd = () -> " и ";
        Text textWhat;
        textWhat = () -> " что ";
        Text textA;
        textA = () -> "А ";
        IMechanism motor = new IMechanism() {
            public String makeNoise() {
                return " шумит моторчик";
            }//метод возвращающий шум мотора Карлсона
        };

        Malish.setTypeOfHand(TypeOfHands.BUSY);
        Carlson.setTypeOfHand(TypeOfHands.CHUBBY);
        Storyteller.giveAgree();
        System.out.print(Storyteller.speak("Его не было") + textNot.addText() + textIn.addText() + Hallway.getName()+ textNot.addText() + textIn.addText() + Bathroom.getName()+". ");
        System.out.print(textBut.addText() + Malish.hear() + motor.makeNoise()+ ". ");
        System.out.print(Malish.run(Window)+ textAnd.addText() + Malish.see()+ textWhat.addText());
        System.out.print(Storyteller.speak("ввысь взмыло нечто, напоминающее ")+Sausage.getName()+". " );
        System.out.print(Storyteller.speak("Нет, это был не ")+ Barrel.getName()+" "+ Storyteller.speak("а всего-навсего ")+ Carlson.getName()+ ". ");
        System.out.println(Carlson.comeBack(Roof));
        System.out.print(textBut.addText());
        System.out.print(Carlson.see(Malish)+ Carlson.dive());
        Carlson.rush(Window);
        System.out.print(Air.whistle());
        System.out.println(Malish.wave());
        System.out.println(Carlson.wave()+" "+ Carlson.fly()+". ");
        System.out.println(textA.addText() + Malish.clean(Water,Floor,Hallway));
        System.out.println(Carlson.recall());



    }
}
