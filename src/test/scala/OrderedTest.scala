import com.knoldus.Ordered.{EmptySet, Number}
import org.scalatest.funsuite.AnyFunSuite

class OrderedTest extends AnyFunSuite{
  val set = new EmptySet[Number].incl(Number(5.0)).incl(Number(2.0))
  test("set should contains that included element"){
    assert(set.contains(Number(5.0)))
  }
  test("set should not contains that included element"){
    assert(!set.contains(Number(9.0)))
  }


}
