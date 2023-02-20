public class Skin extends Organ {
    private String color;
    private int softness;

    public Skin(String name, String medCond, String color, int softness) {
        super(name, medCond);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color : " + this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
