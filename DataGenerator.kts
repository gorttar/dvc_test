import java.io.FileOutputStream
import java.io.PrintStream
import kotlin.math.PI
import kotlin.math.sin

FileOutputStream("data/data.csv").let(::PrintStream).use {
    it.run {
        println("x,y")
        (0..180 * 5).asSequence().map { it to sin(it / 180.0 * PI) }.forEach { (x, y) -> println("$x,$y") }
    }
}