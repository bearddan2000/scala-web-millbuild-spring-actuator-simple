import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object Spring extends ScalaModule {
    def scalaVersion = "2.12.9"

    def ivyDeps = Agg(
ivy    "org.springframework.boot:spring-boot-starter-actuator"  % "1.3.2.RELEASE",
ivy    "org.springframework.boot:spring-boot-starter-web:1.3.2.RELEASE"
    )
}
