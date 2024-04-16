public class Computer {
    private int price;
    private String videoCard;
    private String processor;


    public Computer() {
    }

    public Computer(String videoCard, String processor) {
        this.videoCard = videoCard;
        this.processor = processor;
    }

    public Computer(String videoCard, String processor, int price) {
        this(videoCard, processor);
        this.price = price;
    }
}