package ru.geekbrains.gbpatterns.decorator;


// базоый декоратор
public class DataSourceDecorator implements DataSource{
    private DataSource wrapper;

    public DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
