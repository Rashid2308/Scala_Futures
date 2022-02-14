import org.scalatest.flatspec.AnyFlatSpec

import java.nio.file.FileSystems
import scala.language.postfixOps

class FutureTest extends AnyFlatSpec {

  " ContentOfDirectory(\"./sr\")" should "give List(./sr) because path doesn't exists " in {
    val obj: FutureAssignment = FutureAssignment("./sr") // this path doesn't exists
    assert(obj.result == List("Path doesn't exists !"))
  }

  "ContentOfDirectory(\"./src\")" should "give List(())" in {
    val obj = FutureAssignment("./src")
    assert(obj.result == List("()"))
  }

  "Path Valid or not " should "give" in {
    val path = FileSystems.getDefault.getPath("./src")
    assert(path.toFile.isDirectory && path.toFile.exists())
  }
}
