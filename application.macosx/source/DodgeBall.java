import processing.core.*;

import java.util.ArrayList;
//Author: Louis T, 5/23/2021
public class DodgeBall extends PApplet {

    public void setup() {


    }


    public void draw() {
        background(102, 145, 255);





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
