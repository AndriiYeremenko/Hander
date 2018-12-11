package main.general.OSPerfomance;

public class Memory {
    static int mb = 1024 * 1024;
    static Runtime instance = Runtime.getRuntime();
    public static int getTotalMemory(){
        return (int) (instance.totalMemory() / mb);
    }
    public static int getFreeMemory(){

        return (int)instance.freeMemory() / mb;
    }
    public static int  getUsedMemory(){
        return (int) (instance.totalMemory() - instance.freeMemory() / mb);
    }
    public static int getMaxMemory(){
        return (int) (instance.maxMemory() / mb);
    }
}
