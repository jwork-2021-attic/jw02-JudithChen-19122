package s191220013.task3;

import javax.lang.model.util.ElementScanner6;

import s191220013.task3.Matrix.Position;

public class Goblin implements Linable{

    private final int r;
    private final int g;
    private final int b;
    private final int rk;

    private Position position;

    Goblin(int trk) {
        this.rk = trk;
        if(trk<=50){
            this.r = 255;
            this.g = trk*5;
            this.b = 0;
        }
        else if(trk<=100){
            this.r = 255-(trk-50)*5;
            this.g = 255;
            this.b = 0;
        }
        else if(trk<=150){
            this.r = 0;
            this.g = 255;
            this.b = (trk-100)*5;
        }
        else if(trk<=200){
            this.r = 0;
            this.g = 255-(trk-150)*5;
            this.b = 255;
        }
        else if(trk<=250){
            this.r = (trk-200)*5;
            this.g = 0;
            this.b = trk;
        }
        else{
            this.r = trk;
            this.g = 0;
            this.b = 255;
        }
    }

    public int rank() {
        return  this.rk + 1;  
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    "+  "\033[0m";
    } //颜色输出

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public void swapPosition(Goblin another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }
}