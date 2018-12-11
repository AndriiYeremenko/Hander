package main.general.OSPerfomance;

public class SystemInfo {

    public static String getJavaHome(){
        /*Installation directory for Java Runtime Environment (JRE)
        * returns String with java home installation directory*/
        return System.getProperty("path.separator");
    }
    public static String getJavaVendor(){
        /*	JRE vendor name
        * returns String with JRE vendor name*/
        return System.getProperty("java.vendor");
    }
    public static String getJavaVendorUrl(){
        /*JRE vendor URL
        * returns String with JRE vendor URL*/
        return System.getProperty("java.vendor.url");
    }
    public static String getJavaVersion(){
        /*JRE version number
        * returns String with JRE version number*/
        return System.getProperty("java.version");
    }
    public static String getLineSeparator(){
        /*Sequence used by operating system to separate lines in text files
        returns String with sequence */
        return System.getProperty("line.separator");
    }
    public static String getOSArchitecture(){
        /*Operating system architecture
        returns String with kind operating system architecture*/
        return System.getProperty("os.arch");
    }
    public static String getOSName(){
        /*	Operating system name
        returns String with  system name*/
        return System.getProperty("os.name");
    }
    public static String getOSVersion(){
        /*Operating system version
        returns String with system name*/
        return System.getProperty("os.version");
    }
    public static String getWorkingDirectory(){
        /*User working directory
        * returns String with working directory*/
        return System.getProperty("user.dir");
    }
    public static String getUserHomeDirectory(){
        /*	User home directory
        returns String with	user home directory */
        return System.getProperty("user.home");
    }
    public static String getFileSeparator(){
        /*Character that separates components of a file path.
        This is "/" on UNIX and "\" on Windows.
        returns String with file separator
        * */
        return System.getProperty("file.separator");
    }
    public static String getJavaClassPath(){
        /*Path used to find directories and JAR archives containing class files.
        Elements of the class path are separated by a
        platform-specific character specified in the path.separator property.
        returns String with java class path*/
        return System.getProperty("java.class.path");
    }
    public static String getUserName(){
        /*	User account name
        *  returns String with user account name*/
        return System.getProperty("user.name");
    }
    public static void printSystemInfo(){
        System.out.println("System name : ");
        System.out.println(SystemInfo.getOSName());
        System.out.println("JRE vendor : ");
        System.out.println(SystemInfo.getJavaVendor());
        System.out.println("JRE vendor URI : ");
        System.out.println(SystemInfo.getJavaVendorUrl());
        System.out.println("Java version : ");
        System.out.println(SystemInfo.getJavaVersion());
        System.out.println("Line separator : ");
        System.out.println(SystemInfo.getLineSeparator());
        System.out.println("OS Architecture : ");
        System.out.println(SystemInfo.getOSArchitecture());
        System.out.println("Working directory : ");
        System.out.println(SystemInfo.getWorkingDirectory());
        System.out.println("User home directory : ");
        System.out.println(SystemInfo.getUserHomeDirectory());
        System.out.println("File separator : ");
        System.out.println(SystemInfo.getFileSeparator());
        System.out.println("Java class path : ");
        System.out.println(SystemInfo.getJavaClassPath());
        System.out.println("User name : ");
        System.out.println(SystemInfo.getUserName());
    }

}
