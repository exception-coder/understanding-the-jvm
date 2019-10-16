package cn.exceptioncode.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    static class  OMMObject{

    }


    /**
     *
     * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError
     *
     * @param args
     */
    public static void main(String[] args) {

        List<OMMObject> list = new ArrayList<OMMObject>(100);

        while (true){
            list.add(new OMMObject());
        }

    }
}
