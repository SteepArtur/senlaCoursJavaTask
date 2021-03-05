public class Tower implements IProductPart{
    private String serialNumber;
    private String color;

    public Tower(String serialNumber, String color) {
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
