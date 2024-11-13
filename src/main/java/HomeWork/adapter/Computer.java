package HomeWork.adapter;

public class Computer {
    public void connectUSB(IUSB usbDevice) {
        System.out.println("Computer connects to USB device.");
        usbDevice.connectWithUsbCable();
    }
}
