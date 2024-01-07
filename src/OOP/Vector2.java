package OOP;

public class Vector2 {

    int posX, posY;
    public Vector2(int posX, int poxY) {
        this.posX = posX;
        this.posY = poxY;
    }
    public float rangeEnemy(Vector2 posEnemy){
        double distance = Math.sqrt(Math.pow(posEnemy.posY-posY,2)+Math.pow(posEnemy.posX-posX,2));
        return (float) distance;
        }
    }

