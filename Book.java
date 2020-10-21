public class Book extends Item {
    public void ToBase(){
        System.out.println(" Book");
        System.out.println("  |");
        System.out.println("  V");
        super.ToBase();
    }

    public void SplashWaterOn() {
        System.out.println("Item \""+this.getClass().getSimpleName()+"\" został zniszczony przez wodę");
    }
}
