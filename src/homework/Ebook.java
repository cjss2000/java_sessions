package homework;

public class Ebook extends Publication{

    private double fileSizeMB;
    private String format;

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    Ebook(double fileSizeMB, String format) {
        this.fileSizeMB = fileSizeMB;
        this.format = format;
    }

    public double calculatePrice() {
        // TODO: add a price calculation for an ebook
        return 0.0;
    }

    @Override
    public String toString() {
        return "Ebook information:  format: " + this.getFormat() + " file size in MB: " + this.getFileSizeMB();
    }

}
