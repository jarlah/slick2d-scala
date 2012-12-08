import org.newdawn.slick._

object Main extends App {

  val app = new AppGameContainer(new SimpleGame)
  app.setDisplayMode(800,600, false)
  app.start()

}


class SimpleGame extends BasicGame("shit son") {

  def init(gc: GameContainer) {}
  def render(gc: GameContainer, g: Graphics) {}

  def update(gc: GameContainer, delta: Int) {}

}
