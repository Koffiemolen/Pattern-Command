public class HomeHeatingSystemAutomation {

    public static void main(String[] args) {

        Controller controller = new Controller();
        HeatingSystem heatingSystem = new HeatingSystem();

        Command heatOn = new HeatingOnCommand(heatingSystem);
        Command heatOff = new HeatingOffCommand(heatingSystem);

        controller.setCommand(heatOn);
        controller.executeCommand();

        controller.setCommand(heatOff);
        controller.executeCommand();
    }
}