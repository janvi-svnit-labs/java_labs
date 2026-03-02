package WashingMachine;

public class WashingMachineDemo {
    public static void main(String[] args) {
        WashingMachine wm=new WashingMachine();
        wm.SwitchOn();
        wm.acceptClothes();
        wm.acceptDetergent();
        wm.switchOff();
    }
}
