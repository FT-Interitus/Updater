package de.ft.interitusupdater;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> argsList = new ArrayList<>();
        argsList.addAll(Arrays.asList(args));

        if(argsList.contains("-u")) {


        if (new File(System.getProperty("user.dir") + "/interitus.update").exists()) {

            if (new File(System.getProperty("user.dir") + "/interitus.update").canWrite()) {

                new File(System.getProperty("user.dir") + "/interitus.jar").delete();

                new File(System.getProperty("user.dir") + "/interitus.update").renameTo(new File(System.getProperty("user.dir") + "/interitus.jar"));


            }

        }

        }


        if(argsList.contains("-r")) {
String java = "";
            if(OSChecker.isWindows()) {

                java = System.getProperty("java.home")+"/bin/java.exe";

            }else if(OSChecker.isUnix()) {
                java = System.getProperty("java.home")+"/bin/java";

            }else if(OSChecker.isMac()) {

                java = System.getProperty("java.home") + "/bin/java";

            }


            try {
                if(argsList.contains("-u")) {
                    Process proc = Runtime.getRuntime().exec(java+" -jar interitus.jar -up");

                }else{
                    Process proc = Runtime.getRuntime().exec(java+" -jar interitus.jar");

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);


        }
    }
}
