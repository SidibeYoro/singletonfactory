public class Main
{
    public static void main (String [] args ) {
        ConcreteProductOne c = new ConcreteProductOne();
        ConcreteProductTwo b = new ConcreteProductTwo();

        Product P1 = FactoryProduct.getproduit(ProdEnum.ID1);
        Product P2 = FactoryProduct.getproduit(ProdEnum.ID2);
        P1.Afficher();
        P2.Afficher();

    }



}
