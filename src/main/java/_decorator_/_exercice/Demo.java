package _decorator_._exercice;


public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compresser
        String data = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        // FileDataSourceInterface fileDataSource = new FileDataSource("OutputDemo.txt");

        // Encryptor encryptor = new Encryptor();
        // Compressor compressor = new Compressor();
        // String encrypted = encryptor.encode(data);
        // String encryptedAndCompressed = compressor.compress(encrypted);
        // fileDataSource.writeData(encryptedAndCompressed);

        // String readData = fileDataSource.readData();

        // System.out.println("- Input ----------------");
        // System.out.println(data);
        // System.out.println("- Encoded --------------");
        // System.out.println(readData);
        // System.out.println("- Decoded --------------");
        // System.out.println(encryptor.decode(compressor.decompress(readData)));

        //TODO refactoriser en utilisant le pattern decorator

        FileDataSourceInterface fileDataSource = new FileDataSource("OutputDemo.txt");
        String encodeData = fileDataSource.readData();

        System.out.println("- Input ----------------");
        System.out.println(data);
        System.out.println("- Encoded --------------");
        System.out.println(encodeData);
        System.out.println("- ----------------------");
        System.out.println("- ----------------------");

        FileDataSourceInterface fileDataSource2 = new EncryptorDecorator(new CompressorDecorator(new FileDataSource("OutputDemo.txt")));
        System.out.println("- Decoded --------------");
        System.out.println(fileDataSource2.readData());

    }
}