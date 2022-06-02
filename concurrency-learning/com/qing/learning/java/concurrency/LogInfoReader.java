package com.qing.learning.java.concurrency;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author guoqf
 * @date 2022/2/22 9:44
 */
public class LogInfoReader {
    public static void main(String[] args) {
        String logPath = "D:\\Workspaces\\Asiainfo\\IDEA\\Gerrit\\projects\\ng4a-sec-goldbank\\logs\\info.log";
        String prefix = "[2022-02-22 16:3";
        String prefix1 = "";
        String mid = "[http-nio-8081-exec-469]";
        String postfix = "";
        String outputPath = "D:\\Workspaces\\MySpace\\IDEA\\study\\java-learning\\concurrency-learning\\info.log";


        try (BufferedReader reader = new BufferedReader(new FileReader(logPath)); BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            reader.lines().forEach(inLine->{
                if (inLine.contains(mid)) {
                    System.out.println("inLine: " + inLine);

                    try {
                        writer.write(inLine);
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });


        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
