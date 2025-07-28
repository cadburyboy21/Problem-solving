public class pizza {
    private int price;
    private int addextracheeseprice=100;
    private int addextratoppingprice=150;
    private int addtakeawayprice=20;
    private boolean veg;
    private int Basepizzaprice;

    private boolean isaddextracheese=false;
    private boolean isaddextratopping=false;
    private boolean istakeaway=false;

    public pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            price+=300;
        }
        else{
            price+=400;
        }
        Basepizzaprice=this.price;

    }

    public void addextracheese(){
        isaddextracheese=true;
        this.price+=addextracheeseprice;

    }
    public void addextratopping(){
        isaddextratopping=true;
        this.price+=addextratoppingprice;

    }
    public void takeaway(){
        istakeaway=true;
        this.price+=addtakeawayprice;

    }

    public void  getBill(){
        String bill="";
       System.out.println("Pizza: "+Basepizzaprice);
       if(isaddextracheese){
        bill+="Extra Cheese Addded: "+addextracheeseprice+ "\n";
       }
       if(isaddextratopping){
        bill+="Extra Toppings Added: "+addextratoppingprice+"\n";

       }
       if(istakeaway){
        bill+="Is opting TakeAway: "+addtakeawayprice+"\n";
       }
       bill+="Total Bill: "+this.price+"\n";

       System.out.println(bill);



    }
}
