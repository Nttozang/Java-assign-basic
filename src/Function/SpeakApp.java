package Function;

public class SpeakApp {

    @FunctionalInterface
    private interface Speakble{
        void speak(Person person);
    }

    public record Person(String name){}


    public static void main(String[] args) {
        var n = new Person("ntt");
        shout(n, (person -> {
            System.out.println("hello" + person.name);
        }));
    }

    private static void shout(Person person, Speakble speakble){
        speakble.speak(person);
    }
}
