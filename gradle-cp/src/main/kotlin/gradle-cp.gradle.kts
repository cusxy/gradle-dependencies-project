import ru.cusxy.gradle.library.Sample
import java.util.UUID

val sample = Sample(
    id = UUID.randomUUID().toString(),
    text = "Hello, World!"
)