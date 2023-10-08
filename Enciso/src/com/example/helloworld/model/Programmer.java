package com.example.helloworld.model;

public class Programmer extends Employee{ // Tinh ke thua

    // Attribute rieng
    private int bonus;

    // Constructor
    public Programmer() {
        this.setName("Programmer");
    }
    public Programmer(float salary, int bonus) {
        super(salary);
        // super.getsalary() : goi ham cua cha ; super(lasjdla) : goi constructor cua cha (employee)
        this.bonus = bonus;
    }

    // Getter & Setter : tinh dong goi
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    // Overriding : chen vao

    @Override
    public void theString() {
        System.out.println("Hello Programmer");
//       super.theString();
    }
}
