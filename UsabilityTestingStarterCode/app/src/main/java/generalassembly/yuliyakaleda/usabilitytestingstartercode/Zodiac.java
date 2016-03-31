package generalassembly.yuliyakaleda.usabilitytestingstartercode;

/**
 * Created by adao1 on 3/31/2016.
 */
public class Zodiac {
    private String name;
    private String text;
    private String date;
    private int imageID;
    private int planetID;

    public Zodiac(String name, String text, String date, int imageID) {
        this.name = name;
        this.text = text;
        this.date = date;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

}
