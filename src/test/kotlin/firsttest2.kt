import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class firsttest2 {

    @Test
    fun test1() {
        WebDriverManager.chromedriver().setup()
        val driver = ChromeDriver()

        driver.get("https://chatgpt.com/auth/login")

        driver.quit()

    }
}