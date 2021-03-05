public class Bouquet {

    private Archidea archidea;
    private Rose rose;
    private Liliya liliya;
    private Chamomile chamomile;

    public Bouquet(Archidea archidea, Rose rose, Liliya liliya, Chamomile chamomile) {
        this.archidea = archidea;
        this.rose = rose;
        this.liliya = liliya;
        this.chamomile = chamomile;
    }

    public Bouquet(){

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


