public class BuilderThirdPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        IProductPart tower = new Tower("2021","Red");
        System.out.println("Tower made");
        return tower;
    }
}
