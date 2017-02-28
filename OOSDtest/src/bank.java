
/**
 * Write a description of class bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bank
{
    public static void main(String[] args) {
         
       System.out.println("จำนวนลูกค้า " + customer.CountCustormer);
       //bank b = new bank();
       customer.interestRate=0.1;
       System.out.println("ปีที่ 1");
       customer c1 = new customer("ชื่อ","นามสกุล",200);
      // c1.setInterestRat(interestRate);
       c1.coputeInterest();
       c1.plusMoney();
       System.out.println("year1 "+c1.getName()+" "+c1.getSurname()+" "+" "+" เงินต้น "+c1.getPrvMoney()+" เงินต้นรวมดอกเบี้ย "+c1.getMoney());
         
       System.out.println("ปีที่ 2");
       //c1.coputeInterest();
       c1.plusMoney();
       System.out.println("year2 "+c1.getName()+" "+c1.getSurname()+" "+" "+" เงินต้น "+c1.getPrvMoney()+" เงินต้นรวมดอกเบี้ย "+c1.getMoney());
          System.out.println("จำนวนลูกค้า    " + customer.CountCustormer);
   }
   

}
