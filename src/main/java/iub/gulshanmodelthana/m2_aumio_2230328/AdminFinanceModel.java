package iub.gulshanmodelthana.m2_aumio_2230328;

import java.time.LocalDate;

public class AdminFinanceModel {

    private String name;
    private LocalDate date;
    private String ammount;
    private String category;
    private String officer;

    public AdminFinanceModel(String name, LocalDate date, String ammount, String category, String officer) {
        this.name = name;
        this.date = date;
        this.ammount = ammount;
        this.category = category;
        this.officer = officer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    @Override
    public String toString() {
        return "AdminFinanceModel{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", ammount='" + ammount + '\'' +
                ", category='" + category + '\'' +
                ", officer='" + officer + '\'' +
                '}';
    }
}
