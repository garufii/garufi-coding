var len = random(25, 100)
var g = random(0, 256)

class square(x: Int, y: Int) {
  val sqr = Picture.rectangle(len, len)
  sqr.setFillColor(cm.rgb(30, g, 256).fadeOut(0.5))
  sqr.setPenColor(randomColor.fadeOut(1.0))
  sqr.setPosition(x, y)
  
  def draw() {
    sqr.draw
  }
}

cleari()
drawStage(cm.rgb(0, 0, 0))

val quadrato = new square (random(-300, 0), random(0, 300))
quadrato.draw()
