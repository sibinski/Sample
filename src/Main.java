public class Main {
    public static void main(String[] args){
        Example example = new Example();
        System.out.println(example);
        Phone phone1 = new Iphone();
        String p = phone1.processor();
        Phone phone2 = new Samsung();
        int s = phone2.spaceInGb();
        String m1 = ((Iphone) phone1).airdrop();
        String m2 = ((Samsung) phone2).whatsapp();
        System.out.println("IPhone uses processor " + p + ". " + m1);
        System.out.println("Samsung phone uses " + s + " GB of memory. " + m2);
        Door door = new Door();
        if (door.isLocked(args[1])){
            System.out.println("Door is locked!");
        }
        else {
            System.out.println("Door is open!");
        }
    }
}
