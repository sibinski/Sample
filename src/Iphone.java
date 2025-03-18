public class Iphone implements Phone, iOS{
    @Override
    public String processor()
    {
        return "A15";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }

    @Override
    public String airdrop() {
        return "Copy & paste anywhere!";
    }
}
