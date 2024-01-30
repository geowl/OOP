package OOP;

public class Vector2 {
    int posX, posY;

    public Vector2(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public void moveRight(int distance) {
        posX += distance;
    }

    public void moveLeft(int distance) {
        posX -= distance;
    }

    public void moveDown(int distance) {
        posY += distance;
    }

    public void moveUp(int distance) {
        posY -= distance;
    }
    public float rangeEnemy(Vector2 posEnemy) {
        double distance = Math.sqrt(Math.pow(posEnemy.posY - posY, 2) + Math.pow(posEnemy.posX - posX, 2));
        return (float) distance;
    }
}

