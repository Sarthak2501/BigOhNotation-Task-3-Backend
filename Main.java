public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        inventoryManager inventoryManager = new inventoryManager();

        System.out.println("---------Wooden Furniture Here---------");
        inventoryManager.woodenInventoryGetter();
        System.out.println("---------Electronic Furniture Here---------");
        inventoryManager.ElectronicInventoryGetter();


    }
}

/*#Problem 3
//Design a System for a shop keeper to keep his/her inventory managed. He have furniture at the beginning , but he may add more items to it. His furniture are wood chair,
wood table, steel chair etc. Each furniture have one property called isChilldSafe.
if the shopkeeper wants to add new type of items, such as phone or may be something else he can add, In future , he might also wants to add two new properties,
such as isFireSafe, isWaterSafe etc.
WoodenFurniture = "Sofa Set", "Dinning Table","Dinning Chair","Dressing Table","Almirah","Rocking Chair"
SteelFurniture = "Steel Chair","Steel Sofa","Steel Bed","Steel Almirah"
ElectronicFurniture =" phone set","Tablet Set"
MedicineFurniture = " "
*/

class inventoryManager{

    public void woodenInventoryGetter() {

        sofaSet sofaSet = new sofaSet();
        sofaSet.setWfId(111);
        System.out.println("Wooden Furniture ID : "+sofaSet.getWfId());
        System.out.println("Furniture Name : " + sofaSet.name());
        sofaSet.setPrice(70000);
        System.out.println("Price : "+sofaSet.getPrice()+" INR");

        System.out.println();

        dinningTable dinningTable = new dinningTable();
        dinningTable.setWfId(112);
        System.out.println("Wooden Furniture ID : "+dinningTable.getWfId());
        System.out.println("Furniture Name : " +dinningTable.name());
        dinningTable.setPrice(30000);
        System.out.println("Price : " +sofaSet.getPrice()+ " INR");

        System.out.println();

    }

    public void ElectronicInventoryGetter(){

        phoneSet phoneSet = new phoneSet();

        phoneSet.setEfId(211);
        System.out.println("Electronic Furniture ID : " + phoneSet.getEfId());
        System.out.println("Furniture Name" + phoneSet.name());
        phoneSet.setPrice(700);
        System.out.println("Price : " + phoneSet.getPrice() + " INR");

    }

}
interface furnitureIsChildSafe {
    public Boolean isChildSafe();
}

interface furnitureIsFireSafe {

    public Boolean isFireSafe();
}

class woodenFurniture{
    private int wfId;
    private int price;


    public int getWfId() {
        return wfId;
    }

    public void setWfId(int wfId) {
        this.wfId = wfId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class steelFurniture{

    private int sfId;
    private int price;


    public int getSfId() {
        return sfId;
    }

    public void setSfId(int sfId) {
        this.sfId = sfId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

class ElectronicFurniture{
    private int efId;
    private int price;


    public int getEfId() {
        return efId;
    }

    public void setEfId(int efId) {
        this.efId = efId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}

class MedicineFurniture{

    private int mfId;
    private int price;


    public int getMfId() {
        return mfId;
    }

    public void setMfId(int mfId) {
        this.mfId = mfId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}


class sofaSet extends woodenFurniture implements furnitureIsChildSafe,furnitureIsFireSafe {

    public String name(){
        return "SofaSet";
    }

    @Override
    public Boolean isChildSafe() {
        return true;
    }

    @Override
    public Boolean isFireSafe() {
        return true;
    }
}

class dinningTable extends woodenFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Dinning Table";
    }

    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class dinningChair extends woodenFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Dinning Chair";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class dressingTable extends woodenFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Dressing Table";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class almirah extends woodenFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Almirah";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class rockingChair extends woodenFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Rocking Chair";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class steelChair extends steelFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Steel Chair";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class steelSofa extends steelFurniture implements furnitureIsChildSafe {
    public String name(){
        return "Steel Sofa";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class steelBed extends steelFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Sofa Bed";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class steelAlmirah extends steelFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Steel Almirah";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class phoneSet extends ElectronicFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Phone Set";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}

class tabletSet extends ElectronicFurniture implements furnitureIsChildSafe {

    public String name(){
        return "Tablet Set";
    }
    @Override
    public Boolean isChildSafe() {
        return true;
    }
}
