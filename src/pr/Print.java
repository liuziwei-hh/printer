package pr;

public class Print {
    public Print(int number, String producer, boolean isWorking) {
        Number = number;
        Producer = producer;
        IsWorking = isWorking;
    }

    private int Number;
    private String Producer;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public boolean isWorking() {
        return IsWorking;
    }

    public void setWorking(boolean working) {
        IsWorking = working;
    }

    private boolean IsWorking;

    public Print() {
    }
    public static  void main(String[] args){}
    public void printer(){
        System.out.println("print something you need");
    }

}
