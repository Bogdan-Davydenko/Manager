import java.util.Objects;

public class Smartphone extends Product {
    private String brand;
    private int memory;
    private int processor_number;

    public Smartphone(){
        super();
    }

    public Smartphone(int id, String name, int price, String brand, int memory, int processor_number){
        super(id,name,price);
        this.brand = brand;
        this.memory = memory;
        this.processor_number = processor_number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getProcessor_number() {
        return processor_number;
    }

    public void setProcessor_number(int processor_number) {
        this.processor_number = processor_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone smart = (Smartphone) o;
        return processor_number == smart.processor_number &&
                memory == smart.memory &&
                Objects.equals(brand, smart.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, memory, processor_number);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory +
                ", processor_number=" + processor_number +
                '}';
    }
}
