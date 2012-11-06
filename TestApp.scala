import scala.reflect.runtime.{universe => ru}
import ru._
import quasiquotes._

object TestApp extends App {
  implicit val universe: ru.type = ru

  print(showRaw(q"x + y"))
}