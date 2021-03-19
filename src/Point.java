public class Point {

    private int type;
    private int vel;


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
        this.vel -= diff;
    }

    public void clicked() {
        setType(1);
        setVel(0);
    }

    public void move(int vel) {
        setVel(vel);
        setType(1);
    }

    public void clear() {
        setType(0);
        setVel(0);
    }

    public void updateVel() {

        if (vel < 5)
            vel++;

        // else
    }
}