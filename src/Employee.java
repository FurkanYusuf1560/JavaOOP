public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear= 2021;


    Employee(String name, int salary, int workHours, int hireYear){
        this.name= name;
        this.salary= salary;
        this.workHours= workHours;
        this.hireYear= hireYear;
    }

    void tax(){
        double tax = 0.10;
        if(this.salary>1000){
            System.out.print("Maaş: "+ this.salary);
            this.salary = (int) (tax * salary);
            System.out.println("    Vergi Miktarı: " + this.salary);

        } else if (this.salary<1000) {
            this.salary = salary;
        }

    }


    void bonus(){
        System.out.print("Haftalık Çalışma saati: " + this.workHours);
        if (this.workHours >40){
            this.salary = (this.workHours - 40) * 30;
        }
        System.out.println("  Çalışsanın aldığı bonus miktarı: " + this.salary );
    }

    void raiseSalary(){
        int currentYear = 2021;
        if(currentYear - this.hireYear <10){
            System.out.println(this.salary);
            this.salary = (int)((this.salary * 105)/100);
        } else if ((currentYear - this.hireYear)>9 &&  (currentYear - this.hireYear) <20) {
            this.salary = (int) (this.salary * 110 / 100);
        } else if (currentYear - this.hireYear >19) {
            this.salary = (int) (this.salary * 115 / 100);
        }
        System.out.println("Çalışanın zam miktarı: "+ this.salary);
    }

    void print(){
        System.out.print(this.name+ "\t");
        System.out.print(this.salary+ "\t");
        System.out.print(this.workHours+ "\t");
        System.out.println(this.hireYear+ "\t");
    }

}
