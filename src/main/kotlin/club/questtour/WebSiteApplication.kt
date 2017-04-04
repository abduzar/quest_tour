package club.questtour

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WebSiteApplication

fun main(args: Array<String>) {
    SpringApplication.run(WebSiteApplication::class.java, *args)
}
