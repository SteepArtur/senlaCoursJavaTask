public class Price {

    private Archidea archidea = new Archidea();
    private Rose rose = new Rose();
    private Liliya liliya = new Liliya();
    private Chamomile chamomile = new Chamomile();

    public Price() {
        initPrice();
    }

    private void initPrice() {
        archidea.setPrice(5);
        rose.setPrice(4);
        liliya.setPrice(3);
        chamomile.setPrice(2);
    }

    public Archidea getArchidea() {
        return archidea;
    }

    public void setArchidea(Archidea archidea) {
        this.archidea = archidea;
    }

    public Rose getRose() {
        return rose;
    }

    public void setRose(Rose rose) {
        this.rose = rose;
    }

    public Liliya getLiliya() {
        return liliya;
    }

    public void setLiliya(Liliya liliya) {
        this.liliya = liliya;
    }

    public Chamomile getChamomile() {
        return chamomile;
    }

    public void setChamomile(Chamomile chamomile) {
        this.chamomile = chamomile;
    }
}








