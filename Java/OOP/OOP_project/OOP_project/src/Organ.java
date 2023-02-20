public class Organ {
    private String name;
    private String medCond;

    public Organ(String name, String medCond) {
        this.name = name;
        this.medCond = medCond;
    }

    public void getDetails() {
        System.out.println("Name : " + this.getName());
        System.out.println("Medical Conditon : " + this.getMedCond());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedCond() {
        return medCond;
    }

    public void setMedCond(String medCond) {
        this.medCond = medCond;
    }
}
