
public class ApplianceApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet  refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet  smarphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(smarphoneAdapter.plugIn());
        
       
    }
}