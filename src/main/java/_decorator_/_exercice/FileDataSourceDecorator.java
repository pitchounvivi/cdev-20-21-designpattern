package _decorator_._exercice;

public class FileDataSourceDecorator implements FileDataSourceInterface {

    protected FileDataSourceInterface source;

    public FileDataSourceDecorator(FileDataSourceInterface source) {
        this.source = source;
    }

    @Override
    public String readData() {
        return this.source.readData();
    }

    @Override
    public void writeData(String data) {
        this.source.writeData(data);
    }
}
