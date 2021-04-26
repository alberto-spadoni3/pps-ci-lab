import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SperanzaScalaTest {
  @Test
  def testScalaClass(): Unit = {
    assertEquals(1, SperanzaScala.getOne)
  }
}
