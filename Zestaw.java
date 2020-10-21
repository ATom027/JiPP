public enum Zestaw {
    Intel(3500.00)
    ,AMD(4000.00)
    ,IBM(2000.00);

    private final double _cena;

    Zestaw(double cena) {
        this._cena = cena;
    }

    public double getCena(){
        return this._cena;
    }
}
