import processing.core.*;

import java.util.ArrayList;
//Author: Louis T, 5/23/2021
public class DodgeBall extends PApplet {

    GreenBall x = new GreenBall();
    ArrayList <EnemyBall> allEnemy = new ArrayList <EnemyBall>();


    public void setup() {

        for(int i=1; i<=20; i++){
            EnemyBall e1 = new EnemyBall();
            allEnemy.add(e1);
        }
    }


    public void draw() {
        background(102, 145, 255);
        fill(100);
        if(x.urDead == false){
            x.draw(this);
        }

        //---
        for(int i=0;i<allEnemy.size();i++){
            EnemyBall enemies = allEnemy.get(i);
            x.checkDeath(enemies);
            enemies.drawEnemy(this);
            enemies.move();

        }

        // remove death
        for(int i=0;i<allEnemy.size();i++){
            EnemyBall enemies = allEnemy.get(i);
            if( enemies.isAlive==false ){
                allEnemy.remove(i) ;
                i--;
                EnemyBall e1 = new EnemyBall();
                allEnemy.add(e1);
            }
        }

    }

    public void settings() {
        size(800, 800);
    }

    static public void main(String[] passedArgs) {
        String[] appletArgs = new String[]{"DodgeBall"};
        if (passedArgs != null) {
            PApplet.main(concat(appletArgs, passedArgs));
        } else {
            PApplet.main(appletArgs);
        }
    }


}








