public interface IItem {
    default void SplashWaterOn(){
        System.out.println("Item \""+this.getClass().getSimpleName()+"\" jest mokry");
    }

    void Take();
}
