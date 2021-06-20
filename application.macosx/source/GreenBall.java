import processing.core.PApplet;

public class GreenBall {
    int playersize = 50;
    boolean urDead = false;
    int Greenballx;
    int Greenbally;

    public void draw(DodgeBall x) {
        moveByMouse(x);
        x.fill(0, 255, 0);
        x.circle(Greenballx, Greenbally, playersize);
    }

    public void moveByMouse(DodgeBall dgb) {
        Greenballx = dgb.mouseX;
        Greenbally = dgb.mouseY;
    }

    public boolean checkDeath(EnemyBall x) {
        float d = PApplet.dist(Greenballx, Greenbally, x.enemyBallx, x.enemyBally);
        if (d < (playersize + x.enemysize) / 2) {
            //hit
            urDead = true;
            return true;
        }
        return false;
    }
}
