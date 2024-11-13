package HomeWork.adapter;

public class TestClass {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();

        IUSB memoryCardAdapter = new MemoryCardToUSBAdapter(memoryCard);

        Computer computer = new Computer();

        computer.connectUSB(memoryCardAdapter);
    }
}

