package Bridge;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new Robot());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Testing robot remote and homerobot.");
        RobotRemote robotRemote = new RobotRemote(device);
        robotRemote.power();
        robotRemote.startCleaning();
        device.printStatus();
        robotRemote.startCooking();
        device.printStatus();
        robotRemote.mute();
        robotRemote.power();
        device.setChannel(1);
        device.printStatus();

    }
}

