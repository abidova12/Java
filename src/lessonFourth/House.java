package lessonFourth;

public class House {
    private int length;
    private int width;
    int height;
    private String address;
    String owner;


    public House(int length, int width, int height, String address, String owner) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.address = address;
        this.owner = owner;
    }


    public House(String address, String owner) {
        this.address = address;
        this.owner = owner;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public String getAddress() {
        return this.address;
    }
}