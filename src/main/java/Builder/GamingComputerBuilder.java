package Builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponents(new Component("Joku prosessori 9000"));
    }

    @Override
    public void buildRAM() {
        computer.addComponents(new Component("Iso Ram 64GB"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponents(new Component("Iso Drive 1TB"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponents(new Component("Joku geforce RTX PRO 9909RTXD-12345"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponents(new Component("Windows 11"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
