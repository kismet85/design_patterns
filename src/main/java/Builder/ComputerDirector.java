package Builder;

public class ComputerDirector {

    ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRAM();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
}