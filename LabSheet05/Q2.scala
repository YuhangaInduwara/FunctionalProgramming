object Q2{
    def gcd(a:Int, b:Int): Int = b match {
        case 0 => a
        case b if a<b => gcd(b,a)
        case _ => gcd(b,a%b)
    }

    def prime(a: Int, b:Int = 1): Boolean = b match{
        case x if a==x => true
        case x if gcd(a,x) > 1 => false
        case _ => prime(a, b+1)
    }

    def primeSeq(a: Int, n:Int = 2):Unit = {
    if (a <= n) {
        return
    }
    if (prime(n)) {
        print(n + " ")
    }
    primeSeq(a, n + 1)
}

    def main(args: Array[String] ): Unit = {
        primeSeq(10)
    }
}    