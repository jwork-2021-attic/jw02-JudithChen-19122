package s191220013.task3;

class Matrix{
    public Matrix(int length) {
        this.positions = new Position[length][length];  //队列初始化
    }

    private Position[][] positions; //矩阵

    public void put(Linable linable, int m) {
        int i,j;
        i = m / 16;
        j = m % 16;
        if (this.positions[i][j] == null) {
            this.positions[i][j] = new Position(null); 
        }
        this.positions[i][j].setLinable(linable); //设置队列i位置的linable
    }

    public Linable get(int m) {
        int i,j;
        i = m / 16;
        j = m % 16;
        if ((i < 0) || (i > positions.length)||(j < 0) || (j > positions.length)) {
            return null;
        } else {
            return positions[i][j].linable;   //返回队列i位置的linable
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
        for(int i=0;i<16;i++){
           // lineString += "\t";
            for (Position p : positions[i]) {
            lineString += p.linable.toString();
            }
            lineString +='\n';
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[256];
        int i,j;
        for (int m = 0; m < 256; m++) {
            i = m / 16;
            j = m % 16;
            linables[m] = positions[i][j].linable;
        }

        return linables;

    }
}