package ba.unsa.etf.rpr.p1;

public class DomacaMasina extends Masina{

    private boolean brziRezim;
    public DomacaMasina(String naziv, int serijski) {
        super(naziv, serijski);
    }

    void pocniBrziRad() throws WrongMachineState {
        if (brziRezim) throw new WrongMachineState();
        brziRezim = true;
    }

    void zaustaviRad() throws WrongMachineState {
        if (!brziRezim) throw new WrongMachineState();
        brziRezim = false;
    }



}
