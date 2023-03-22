


    object GradeCalculator {
      def main(num: Array[String]): Unit = {
        def fibonacci(n: Int): List[Int] = {
          var fib = List(1,0)
          for (i <- 2 until n) {
            fib = fib.head + fib.tail.head :: fib
          }
          fib.reverse // Reverse the list before returning it
        }

        println(fibonacci(10))
      }
    }



