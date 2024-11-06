package Builder;

public class OfficeComputerBuilder implements ComputerBuilder {


    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponents(new Component("Joku prosessori 2000"));
    }

    @Override
    public void buildRAM() {
        computer.addComponents(new Component("Iso Ram 16GB"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponents(new Component("Iso Drive 200GB"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponents(new Component("Joku geforce RTX PRO 1909RTXD-12345"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponents(new Component("Windows 10"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
