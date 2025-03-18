public class Samsung implements Phone, Android {

    @Override
    public String processor() {
        return "SD1000";
    }

    @Override
    public int spaceInGb() {
        return 128;
    }

    @Override
    public String whatsapp() {
        return "Sends messages free of charge!";
    }
}
