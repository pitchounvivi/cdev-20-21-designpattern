package _decorator_._exercice;

public class CompressorDecorator extends FileDataSourceDecorator{

    private Compressor compressor;

    public CompressorDecorator(FileDataSourceInterface source) {
        super(source);
        this.compressor = new Compressor();
    }

    @Override
    public String readData() {
        return compressor.decompress(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(compressor.compress(data));
    }
}
