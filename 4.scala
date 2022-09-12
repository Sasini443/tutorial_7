object Q4 extends App{
    val acc1=new account("01V",128,21000)
    val acc2=new account("02V",356,-4000)
    val acc3=new account("03V",689,60000)
    val acc4=new account("04V",168,-350)

    var Bank:List[account]=List(acc1,acc2,acc3,acc4)

    def checkNeg(List:List[account])={
        List.filter(x=>x.Balanace<0)
    }
    println("\nNegative balance account: "+checkNeg(Bank)+"\n")

    SumAccount(Bank)
    Interest(Bank)

    def SumAccount(List:List[account])={
        var sum=List.foldLeft(0.0)((sum,y)=>sum+y.Balanace) 
        println("Sum of all account balances: "+sum+"\n")
    }

    def Interest(List:List[account])={
        List.map(x=>{
            if(x.Balanace>0){
                x.Balanace=x.Balanace+x.Balanace*0.05
                println("Final balance of account "+x.AcNo+"="+(x.Balanace))
            }
            else{
                x.Balanace=x.Balanace+x.Balanace*0.1     
                println("Final balance of account "+x.AcNo+"="+(x.Balanace))           
            }
        })
    }
}

class account(a:String, b:Int, c:Double){
    val Nic:String=a;
    val AcNo:Int=b;
    var Balanace:Double=c

    override def toString ="["+Nic+":"+AcNo +":"+ Balanace+"]"

}