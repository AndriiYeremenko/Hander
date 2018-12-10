package main.general.OSPerfomance;

public class Memory {
    int mb = 1024 * 1024;
    Runtime instance = Runtime.getRuntime();
    public int getTotalMemory(){
        return (int) (instance.totalMemory() / mb);
    }
    public int getFreeMemory(){
        return (int)instance.freeMemory() / mb;
    }
    public int getUsedMemory(){
        return (int) (instance.totalMemory() - instance.freeMemory() / mb);
    }
    public int getMaxMemory(){
        return (int) (instance.maxMemory() / mb);
    }
}
