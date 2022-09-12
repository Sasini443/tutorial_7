object Q1 extends App {
    val obj = new Rational(1,3)
    val objj = new Rational(4,8)
    println(obj.neg)
    println(objj.neg)
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    
    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}