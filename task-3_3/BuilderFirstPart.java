public class BuilderFirstPart implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        IProductPart body = new Body("2021", "Green");
        System.out.println("Body made");
        return body;
        }
}
