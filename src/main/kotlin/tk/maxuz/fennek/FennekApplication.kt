package tk.maxuz.fennek

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FennekApplication

fun main(args: Array<String>) {
	runApplication<FennekApplication>(*args)
}
