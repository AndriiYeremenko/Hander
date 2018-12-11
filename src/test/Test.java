package test;

import main.general.CpuPerfomance.CpuSpecification;
import main.general.OSPerfomance.Memory;
import main.general.OSPerfomance.OSValidator;
import main.general.OSPerfomance.SystemInfo;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("<<<<<< Test for CPU Specification >>>>>");
        System.out.println(CpuSpecification.getLogicalNumberCPUCores());
        System.out.println(CpuSpecification.getPhysycalNumberCPUCores());
        System.out.println("<<<<<< Test for OSValidator >>>>>");
        System.out.println(OSValidator.getOS());
        System.out.println("<<<<<< Test for Memory >>>>>");
        System.out.println("Free memory : ");
        System.out.println(Memory.getFreeMemory());
        System.out.println("Total memory : ");
        System.out.println(Memory.getTotalMemory());
        System.out.println("Used memory : ");
        System.out.println(Memory.getUsedMemory());
        System.out.println("Max memory : ");
        System.out.println(Memory.getMaxMemory());
        System.out.println("<<<<<< Test for SystemInfo >>>>>");
        SystemInfo.printSystemInfo();
    }
}
