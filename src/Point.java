import java.util.Random;

public class Point {

    private int type;
    private int vel;
    public static int maxVel = 5;


    public Point(){
        type = 0;
        vel = 0;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMaxVel() {
        return maxVel;
    }

    public int getVel() {
        return vel;
    }

    public int getType() {
        return type;
    }

    public void incVel() {
        this.vel +=1;
    }

    public void slowDown(int diff) {
        this.vel = diff;
    }

    public void randomizeVel() {
        // Slow down, p = 50%
        if(vel > 0 && (new Random().nextInt(2) == 1))
            vel -=1;
    }

    public void clicked() {
        if(type == 0) {
            setType(1);
            setVel(0);
        }
    }

    public void move(int vel) {
        setVel(vel);
        setType(1);
    }

    public void clear() {
        setType(0);
        setVel(0);
    }

    public void updateVel(int dist) {

        if(getVel() < dist)
            incVel();

        if(getVel() >= dist)
            slowDown(dist-1);
    }
}