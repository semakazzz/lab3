public class StoryTeller extends AHuman {
    StoryTeller (String name){
        this.name = name;
        this.place = null;

    }
    public String speakAtBeginning (Objects o, Carlson c){
        return "Нет, это был не " + o.getName() + " а всего-навсего " + c.getName()+ ". ";

    }

}
