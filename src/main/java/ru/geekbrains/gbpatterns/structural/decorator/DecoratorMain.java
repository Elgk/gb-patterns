package ru.geekbrains.gbpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        String salaryRecord = "Name, Salary\nJohn Smith, 1000\nSteave Jobs, 5000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                            new EncryptionDecorator(
                                                  new FileDataSource("out/OutputDemo.txt")));

        encoded.writeData(salaryRecord);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecord);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
