import java.util.Scanner;
public class StoryTeller extends AHuman {
    StoryTeller (String name){
        this.name = name;
        this.place = null;

    }
    private enum Agree {
        YES,
        NO;
    }

    protected Agree typeAgree = Agree.NO;
    public void giveAgree() {
        System.out.println("Привет! Хочешь, я покажу тебе жабу перед началом истории? :)");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        try {
            if (a.equals("да") || a.equals("Да") || a.equals("yes") || a.equals("Yes") || a.equals("ага") || a.equals("конечно") || a.equals("пизда")) {
                typeAgree = Agree.YES;
                System.out.println("████████████████████████████████████████\n" +
                        "███████████████▀░░░▀█▀░░░▀██████████████\n" +
                        "███████████████░▄█▄░█░▄█▄░██████████████\n" +
                        "██████████████▀▀██▀░░▀███▀▀█████████████\n" +
                        "███████████▀▀░░░░░░░░░░░░░░▀████████████\n" +
                        "██████████░░░░░░░░░░░░░░░░░░░▀██████████\n" +
                        "████████▀░░░░░░░░░░░░▄░░░░░░░░░█████████\n" +
                        "█▀▀█████░░░░░░▄░░░░░░░░░░░▄░░░░░████▀▀██\n" +
                        "█░░░░▀▀█░░░░░░▀▄▄░░░░░░░▄▀░░░░░░█▀░░░░░█\n" +
                        "█░█░░░▀█░░░░░░░░░▀▀▄▄▄▄▀░░░░░░░░█░░░▄░░█\n" +
                        "█░░█░░░░▄░░░░░░░░░░░░░░░░░░░░░░▄▀░░▄█░░█\n" +
                        "█▄░░█░▀▄▀█░░░░░░░░░░░░░░░░░░░░▄▀▀░▄█▄░██\n" +
                        "██▄░░▀▄░░░▀▄█░░░░█░░░░█░░░░▀▄▀░░░▄▀░░███\n" +
                        "████▄░░▀▄▄░░▀░░░░█░░░░█░░░█▀░▄▄▄▀░░▄████\n" +
                        "█████▀▀░▄▄█░░▄░░░█▄▄▄▄█░░░█░▀█▄▄░▀▀█████\n" +
                        "██▄▄▄▄▀▀░░░░▀█░░░█░░░░█░░░█░░░░▀▀▀▄▄▄▄██\n" +
                        "█████░░▄▄▄█▀▄█░░░█░░░▄█░░░▄▄▀█▄▄░░▄█████\n" +
                        "███████████▀░▄█░█░▀▄█▀██░█▄░████████████\n" +
                        "████████████▄█▀░█▄▄██▄██░▀█▄████████████\n" +
                        "████████████████████████████████████████");
            }
            else {
                for (int i = 0; i < a.length(); i++) {
                    if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'а' && a.charAt(i) <= 'я') || (a.charAt(i) >= 'А' && a.charAt(i) <= 'Я')) {

                    } else {
                        throw new ArgException("Ваш ответ не должен содержать цифры и иные посторонние символы, только буквы.");
                    }
                }
                //typeAgree = Agree.NO;
               System.out.println("Извини, я не совсем понимаю, что ты хочешь мне сказать... Упс. жаба уже убежала, поэтому приступим к истории. ");
            }
        } catch (ArgException e) {
            System.out.println(e.getMessage());
            this.giveAgree();
        }
    }
    public String speak (String text){
        return (text);

    }

}
