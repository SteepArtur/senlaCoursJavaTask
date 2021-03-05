public class BuilderSecondPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        IProductPart egnine = new Engine("2021", 30);
        System.out.println("Egnine made");
        return egnine;
    }
}
