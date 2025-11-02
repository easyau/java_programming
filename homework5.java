class Monitor{
    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public String getMonitorSize() {return monitorSize;}
    public String getColor() {return color;}
    public String getPower() {return power;}
    public String turnOn(){
        return "Turning on the Monitor";
    }
    public String printInfo() {
        return " Size: " + monitorSize +
                "\n Color: " + color +
                "\n Power: " + power;
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public String getCpu() {return cpu;}
    public String getMemory() {return memory;}
    public String getHd() {return hd;}
    public String getColor() {return color;}
    public String getPower() {return power;}
    public String turnOn() {
        return "Turning on the computer";
    }
    public String printInfo() {
        return " CPU: " + cpu +
                "\n Memory: " + memory +
                "\n HDD: " + hd +
                "\n Color: " + color +
                "\n Power: " + power;

    }
}

class PersonComputer{
    private Computer computer;
    private Monitor monitor;
    PersonComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }
    public String turnOn() {
        return computer.turnOn() + "\n" + monitor.turnOn();
    }
    public String printInfo() {
        return "The spec of the computer\n" + computer.printInfo() +
                "\nThe spec of the monitor\n" + monitor.printInfo();
    }
    public String toString() {
        return printInfo();
    }
}


public class homework5 {
    public static void main(String[] args){
        Monitor monitor = new Monitor("32 inch", "Black", "45W");
        Computer computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        PersonComputer pc = new PersonComputer(computer, monitor);
        System.out.println(pc.turnOn());
        System.out.println(pc);


    }

}
