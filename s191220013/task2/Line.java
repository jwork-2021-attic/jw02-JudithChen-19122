package s191220013.task2;

class Line{
    public Line(int length) {
        this.positions = new Position[length];  //队列初始化
    }

    private Position[] positions; //队列

    public void put(Linable linable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null); 
        }
        this.positions[i].setLinable(linable); //设置队列i位置的linable
    }

    public Linable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].linable;   //返回队列i位置的linable
        }
    }
    //内部类
    class Position {
        private Linable linable; //位置上的内容linable
        Position(Linable linable) {
            this.linable = linable;  //初始化构造
        }
        public void setLinable(Linable linable) {
            this.linable = linable;     //设置position对应linable
            linable.setPosition(this);  //linable 对应位置this
        }

    }
    @Override
    public String toString() {
        String lineString = "";
        for (Position p : positions) {
            lineString += p.linable.toString();
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;

    }
}