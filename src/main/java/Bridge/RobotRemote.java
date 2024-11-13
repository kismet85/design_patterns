package Bridge;

public class RobotRemote extends BasicRemote  {
    public RobotRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }

    public void startCleaning() {
        System.out.println("Remote: Starting to clean, setting to channel 2");
        device.enable();
        device.setVolume(80);
        device.setChannel(2);
    }

    public void startCooking() {
        System.out.println("Remote: Starting to cook, setting to channel 3");
        device.enable();
        device.setVolume(30);
        device.setChannel(3);
    }

}
