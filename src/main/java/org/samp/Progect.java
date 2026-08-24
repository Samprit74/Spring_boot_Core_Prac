package org.samp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ComponentScan
public class Progect {
    public void start() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Progect.class);

        Score score = context.getBean(Score.class);
        Game game = context.getBean(Game.class);
        game.play();
        game.play();
        Progect p1= context.getBean(Progect.class);
        Progect p2= new Progect();
        Progect p3= context.getBean(Progect.class);

        System.out.println(score.wins);
        System.out.println(score.losses);
        System.out.println(score.ties);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1==p2);
        System.out.println(p1==p3);
    }
}

@Service
class Score{

    int wins,losses,ties;

}
@Component
class Game{
    @Autowired
    Score score;

    public void  play(){
        score.wins++;
    }
}

