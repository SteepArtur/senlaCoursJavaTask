public class TankComplete {
    public static void main(String[] args) {
        IProduct tank = new Tank();
        AssemblyLine tankLine = new AssemblyLine(new BuilderFirstPart(), new BuilderSecondPart(), new BuilderThirdPart());

        tankLine.assemblyProduct(tank);
        System.out.println("Complete " + tank.toString());
    }
}
