package com.weixiao.tools;

import java.io.*;

/**
 * @Date 2024/4/30 10:33
 * @Created by weixiao
 * 将测试目录下的所有换行符 换为 System.lineSeparator()
 */
public class ProcessTestFiles {

    public static void main(String[] args) throws IOException {
        String path = "src/test/java/files";
        File folder = new File(path);
        processDirectory(folder);
    }

    public static void processDirectory(File folder) throws IOException {
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                processDirectory(file);
            } else {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringWriter writer = new StringWriter();
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.write(System.lineSeparator());
                }

                reader.close();
                writer.close();

                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(writer.toString());
                fileWriter.close();
            }
        }
    }
}
