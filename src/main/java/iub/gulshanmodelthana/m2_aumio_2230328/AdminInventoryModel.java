package iub.gulshanmodelthana.m2_aumio_2230328;

import java.time.LocalDate;

public class AdminInventoryModel {
    private String name;
    private String stock;
    private String usage;
    private LocalDate date;

    public AdminInventoryModel(String name, String stock, String usage, LocalDate date) {
        this.name = name;
        this.stock = stock;
        this.usage = usage;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AdminInventoryModel{" +
                "name='" + name + '\'' +
                ", stock='" + stock + '\'' +
                ", usage='" + usage + '\'' +
                ", date=" + date +
                '}';
    }
}
