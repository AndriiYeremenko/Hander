package test;

import main.general.CpuPerfomance.CpuSpecification;
import main.general.OSPerfomance.SystemInfo;

public class Test {
    public static void main(String[] args) {
        System.out.println(CpuSpecification.getLogicalNumberCPUCores());
        System.out.println(CpuSpecification.getPhysycalNumberCPUCores());

    }
}
