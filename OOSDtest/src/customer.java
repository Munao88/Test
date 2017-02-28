
public class customer
{
    private String name;
    private String surname;
    private double prvMoney;
    private double money;
   // private double interest=0.1;
    public static int CountCustormer ;
    public static double interestRate;// ในกรณีทุกคนมีค่า ดอกเบื่้ย เท่ากัน แต่่ในกรณีของการที่กำหนดว่า
    //ทุกคนได้ดอกเบี้ยไม่เท่ากันให้นักศึกษา สร้าง solution ใหม่
    
    public customer()
    {
        CountCustormer++;
    }
    public customer(String n,String sn)
    {
        name = n;
        surname = sn;
        prvMoney =0;
        money = 0;
        CountCustormer++;
    }
    
    public customer(String n,String sn,double prv)
    {
        name = n;
        surname = sn;
        prvMoney =prv;
        money = prv;
        CountCustormer++;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public double getPrvMoney()
    {
        return prvMoney;
    }
    
    public double getMoney()
    {
        return money;
    }
    
    public void setMoney(double m)
    {
        money = m;
    }
    public double coputeInterest(){
     return prvMoney *interestRate;
    }
    public void plusMoney()
    {
        prvMoney = money;
        money  = prvMoney + coputeInterest() ;
    }
    
    public void setPrvMoney(double pm)
    {
        prvMoney=pm;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setSurname(String n)
    {
        surname = n;
    }
   /* public void setInterestRat(double i)
    {
       interest = i;
    }
    public double getInterestRat()
    {
       return interest;
    }*/
}
