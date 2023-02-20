public class Eye extends Organ {
    private String color;
    private boolean isOpened;

    public Eye(String name, String medCond, String color, boolean isOpened) {
        super(name, medCond);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color : " + getColor());
    }

    public void open() {
        this.setOpened(true);
        System.out.println(getName() + " is opened");
    }

    public void close() {
        this.setOpened(false);
        System.out.println(getName() + " is closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
