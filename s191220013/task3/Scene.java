package s191220013.task3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Scene{
    public static void main(String[] args) throws IOException {
        //初始化队列
        Matrix line = new Matrix(16);
        //生成一个乱序数组
        List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<256;i++){
			list.add(i);
		}
		Collections.shuffle(list);
        //初始颜色位置（注意前面是颜色，后面是位置）
        for(int i=0;i<256;i++){
            Goblin x= new Goblin(i);
            line.put(x,list.get(i));
        }
        //蛇精
        Snake theSnake = Snake.getTheSnake();
        //快速排序器
        Sorter sorter = new QuickSorter();
        //选择排序器
        //Sorter sorter = new SelectSorter();
        theSnake.setSorter(sorter);
        //排序过程日志
        String log = theSnake.lineUp(line);//lineUP中print
        //日志打印
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
    }


    
}