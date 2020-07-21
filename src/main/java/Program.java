import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// доработать идею с методом LIst<>

public class Program {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // "musicPlayer" это <bean id>, MusicPlayer.class это основной class где есть ссылка интерфейс

        musicPlayer.playMusic();
        musicPlayer.setName("LINK LINK ONNEA!");
        musicPlayer.setVolume(97);

        System.out.println(musicPlayer.getVolume()); // Выводим значение поля int value ;
        System.out.println(musicPlayer.getName());

        context.close();
    }
}
