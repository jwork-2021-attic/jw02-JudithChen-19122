package s191220013.task2;

class Snake{
    private static Snake theSnake;

    public static Snake getTheSnake() {
        if (theSnake == null) {
            theSnake = new Snake();
        }
        return theSnake;
    }

    private Snake() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step,line);//按照日志交换
            System.out.println(line.toString());
            log += line.toString();
            log += "\n[frame]\n";
        }

        //System.out.println(line.toString());

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }
    //按照日志交换
    private void execute(String step, Line line) {
        String[] couple = step.split("<->");
        line.get(Integer.parseInt(couple[0]))
                .swapPosition((Goblin)line.get(Integer.parseInt(couple[1])));
    }

}
