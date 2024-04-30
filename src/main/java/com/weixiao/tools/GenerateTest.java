package com.weixiao.tools;

import com.weixiao.Wx;

import java.io.*;
import java.util.function.Function;

/**
 * @Date 2024/4/29 16:17
 * @Created by weixiao
 * path : end with `/`
 * 只需要在files中增加相应的文件，就可以用这个程序生成相应的测试
 */
public class GenerateTest {
    private static final String headerFilePath = "src/main/java/com/weixiao/tools/header.txt";
    private static final String tailFilePath = "src/main/java/com/weixiao/tools/tail.txt";


    public static void main(String[] args) throws IOException {
        String testFilePath = "src/test/java/files";
        String basePackagePath = "com/weixiao/";
        String fileOutputPath = "src/test/java/" + basePackagePath;
        writeTestFile(testFilePath, fileOutputPath);
    }


    public static void writeTestFile(String testFilePath, String fileOutputDirectory) throws IOException {
        createFolder(fileOutputDirectory);
        String className = parseClassName(testFilePath);
        String fileOutputPath = fileOutputDirectory + className + ".java";
        FileWriter fileWriter = new FileWriter(fileOutputPath);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        // header
        writeFileToWriter(headerFilePath, writer, line -> line.replace("${className}", className));

        // content
        File folder = new File(testFilePath);
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                writeTestFile(file.getAbsolutePath(), fileOutputDirectory);
            } else {
                String absolutePath = file.getAbsolutePath();
                String fileName = parseFileName(absolutePath);
                String functionName = parseFunctionName(absolutePath);
                writer.newLine();
                writerLine("    @Test", writer);
                writerLine(String.format("    @DisplayName(\"%s\")", fileName), writer);
                writerLine(String.format("    void %s() throws IOException {", functionName), writer);
                writerLine("    }", writer);
            }
        }


        // tail
        writeFileToWriter(tailFilePath, writer, null);

        writer.close();
        fileWriter.close();
    }

    private static String parseClassName(String filePath) {
        int index = filePath.lastIndexOf("/");
        if (index == -1) index = filePath.lastIndexOf("\\");
        String directoryName = filePath.substring(index + 1);
        String snakeName = directoryName.substring(0, 1).toUpperCase() + directoryName.substring(1);
        return snakeCaseToCamelCase(snakeName) + "Test";
    }

    private static String parseFunctionName(String filePath) {
        int index = filePath.lastIndexOf("/");
        if (index == -1) index = filePath.lastIndexOf("\\");
        int pointIndex = filePath.lastIndexOf('.');
        String fileNameWithoutExtension = filePath.substring(index + 1, pointIndex);
        String snakeName = fileNameWithoutExtension.substring(0, 1).toUpperCase() + fileNameWithoutExtension.substring(1);
        return "test" + snakeCaseToCamelCase(snakeName);
    }

    private static String parseFileName(String filePath) {
        int index = filePath.lastIndexOf("/");
        if (index == -1) index = filePath.lastIndexOf("\\");
        return filePath.substring(index + 1);
    }

    private static void writerLine(String content, BufferedWriter writer) throws IOException {
        writer.write(content);
        writer.newLine();
    }

    private static void writeFileToWriter(String filePath, BufferedWriter writer, Function<String, String> lineProcessor) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            if (lineProcessor != null) line = lineProcessor.apply(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
    }

    public static void createFolder(String filePath) {
        File directory = new File(filePath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    private static String snakeCaseToCamelCase(String snakeName) {
        StringBuilder builder = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : snakeName.toCharArray()) {
            if (c == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    builder.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    builder.append(c);
                }
            }
        }

        return builder.toString();
    }
}
