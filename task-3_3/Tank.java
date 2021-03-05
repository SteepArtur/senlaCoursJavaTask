public class Tank implements IProduct{

    private IProductPart body;
    private IProductPart egnine;
    private IProductPart tower;


    @Override
    public String toString() {
        return "Tank{" +
                "body=" + body +
                ", egnine=" + egnine +
                ", tower=" + tower +
                '}';
    }


    @Override
    public void installFistPart(IProductPart body) {
        if(body instanceof Body){
            setBody(body);
        }
    }

    @Override
    public void installSecondPart(IProductPart egnine) {
        if(egnine instanceof Engine){
            setEgnine(egnine);
        }
    }

    @Override
    public void installThirdPart(IProductPart tower) {
        if(tower instanceof Tower){
            setTower(tower);
        }
    }

    private void setBody(IProductPart body) {
        this.body = body;
    }

    private void setEgnine(IProductPart egnine) {
        this.egnine = egnine;
    }

    private void setTower(IProductPart tower) {
        this.tower = tower;
    }

    public IProductPart getBody() {
        return body;
    }

    public IProductPart getEgnine() {
        return egnine;
    }

    public IProductPart getTower() {
        return tower;

    }
}
