public class AssemblyLine implements IAssemblyLine {
    private ILineStep bodyLineStop;
    private ILineStep engineLineStop;
    private ILineStep towerLineStop;

    public AssemblyLine(ILineStep bodyLineStop, ILineStep engineLineStop, ILineStep towerLineStop) {
       this.bodyLineStop = bodyLineStop;
       this.engineLineStop = engineLineStop;
       this.towerLineStop = towerLineStop;
    }

    @Override
    public IProduct assemblyProduct(IProduct product) {
        product.installFistPart(bodyLineStop.buildProductPart());
        System.out.println("Install body");
        product.installSecondPart(engineLineStop.buildProductPart());
        System.out.println("Install engine");
        product.installThirdPart(towerLineStop.buildProductPart());
        System.out.println("Install tower");
        System.out.println("Tank complete");
        return product;
    }
}
