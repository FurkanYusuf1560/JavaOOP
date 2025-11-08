public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;


    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit= 180;
        System.out.println("Parametreli kurucu medotu oluştu ! ");
    }

    Car(){
        System.out.println("Boş kurucu medotu oluştu ! ");
    }


    void increaseSpeed(int increment){

         if ((this.speed + increment) < this.speedLimit){
             this.speed += increment;
         }
    }


    void decreaseSpeed(int decrease){
            if (this.speed > 0){
                this.speed -= decrease;
            }
    }

    void printSpeed(){
        System.out.println(this.model + " Hızınız : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model : \t" + this.model);
        System.out.println("color : \t" + this.color);
        System.out.println("type : \t" + this.type);
        System.out.println("speed : \t" + this.speed);


    }

}
