package s191220013.task2;

import s191220013.task2.Line.Position;

public interface Linable {
    public void setPosition(Position position);
    public Position getPosition();
    public int getValue();
    public void swapPosition(Goblin another);
}
