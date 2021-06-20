

public class EnemyBall {

    int enemysize = 30;
    float enemyBallx = (float)Math.random()*-800;
    float enemyBally = (float)Math.random()*800;
    boolean isAlive = true;


    public void drawEnemy(DodgeBall x){
        x.fill(255,0,0);
        x.circle(enemyBallx,enemyBally,enemysize);
    }

    public void move(){
        enemyBallx = enemyBallx + 10;
        if(enemyBallx>800){
            isAlive = false;
        }
    }
}
