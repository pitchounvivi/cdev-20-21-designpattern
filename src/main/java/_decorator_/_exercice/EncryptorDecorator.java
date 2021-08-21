package _decorator_._exercice;

public class EncryptorDecorator extends FileDataSourceDecorator {

    private Encryptor encryptor;

    public EncryptorDecorator(FileDataSourceInterface source) {
        super(source);
        this.encryptor = new Encryptor();
    }

    @Override
    public String readData() {
        return encryptor.decode(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(encryptor.encode(data));
    }
}
