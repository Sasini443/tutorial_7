import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Q3 extends App{

    printf("Money transfer: ")
    val trans=readInt()
   
    val persona=new Account("966632251V", 12347, 80000)
    val personb=new Account("242312553V", 67898, 35000)

    persona.transfer(personb,trans)
    println("Balance of money sender: "+persona.Balance)
    println("Balance of money receiver: "+personb.Balance)

}

class Account(a:String, b:Int, c:Double){
    val Nic:String=a
    val AcNo:Int=b;
    var Balance:Double=c;
    override def toString ="["+Nic+":"+AcNo +":"+ Balance+"]"

    def withdraw(transfer_amount:Double)=this.Balance-transfer_amount;
    def deposit(transfer_amount:Double)=this.Balance+transfer_amount;

    def transfer(acnt:Account,trans:Double) ={
        this.Balance = this.withdraw(trans)
        acnt.Balance=acnt.deposit(trans)
    }
}