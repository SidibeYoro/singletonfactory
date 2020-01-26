public class FactoryProduct

{
    private static final  FactoryProduct instance = new FactoryProduct();
    private FactoryProduct()
    {

    }
    public  static FactoryProduct getinstance()
    {
        return instance ;
    }
    public static   Product getproduit(ProdEnum pID)
    {
       switch (pID)
       {
          case ID1:
              return new ConcreteProductOne();

           case ID2:
               return new ConcreteProductTwo();

           default:  return null;
       }
    }
}

