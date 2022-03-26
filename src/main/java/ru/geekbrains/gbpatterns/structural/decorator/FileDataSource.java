package ru.geekbrains.gbpatterns.structural.decorator;

import java.io.*;
// базовый класс функциональности, здесь пример: чтение, запись в файл
public class FileDataSource implements DataSource{
    private String name; //  имя файла

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try(OutputStream fos = new FileOutputStream(file)){
            fos.write(data.getBytes(), 0, data.length());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try(FileReader reader = new FileReader(file)){
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return new String(buffer);
    }
}
