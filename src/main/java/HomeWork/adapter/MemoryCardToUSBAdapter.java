package HomeWork.adapter;

public class MemoryCardToUSBAdapter implements IUSB {
    private MemoryCard memoryCard;

    public MemoryCardToUSBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        System.out.println("Adapter converts MemoryCard interface to USB...");
        memoryCard.readData();
    }
}
