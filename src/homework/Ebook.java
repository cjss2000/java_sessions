package homework;

public class Ebook {

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

    Ebook(double fileSizeMB, String format){
        this.fileSizeMB = fileSizeMB;
        this.format = format;
    }

    public double calculatePrice(){
        double ebookPrice = 0.0;

        return ebookPrice;
    }


}
