import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration // что конфигурацию Bean делаем по этому файлу конфигурации
public class SpringConfig {

    @Bean  // Bean (Объект) ClassMusic
    public ClassMusic classMisicBean(){
        return new ClassMusic(); // Возвращает объект ClassMusic()
    }

    @Bean  // Bean (Объект) RockMusic
    public PoPMusic classPoPMusicBean(){
        return new PoPMusic(); // Возвращает объект PoPMusic()
    }

    @Bean // Bean (Объект) RockMusic
    public RockMusic classRockMusicBean(){
        return new RockMusic(); // Возвращает объект RockMusic()

    }

    @Bean // interface
    public Music music(){
        return classRockMusicBean(); // Возвращает объект classRockMusicBean()
   }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classMisicBean(), classRockMusicBean(), classPoPMusicBean());
    }


    @Bean // Bean (Объект) MusicPlayer
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(music()); // Возвращает объект MusicPlayer(music())
    }


}
