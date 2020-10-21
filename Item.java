abstract class Item implements IItem {

    void ToBase(){
        System.out.println(" Item");
    }

    @Override
    public void Take() {
        System.out.println("Item \""+this.getClass().getSimpleName()+"\" został podniesiony");
    }
}
