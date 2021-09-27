package s191220013.task3;

import s191220013.task3.Matrix.Position;

public interface Linable {
    public void setPosition(Position position);
    public Position getPosition();
    public int getValue();
    public void swapPosition(Goblin another);
}
