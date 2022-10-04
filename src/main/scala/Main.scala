import zio.*


object Main extends ZIOAppDefault {

  override def run: ZIO[Any, Any, Any] =
    Console.printLine("Welcome to Scala 3")

}

