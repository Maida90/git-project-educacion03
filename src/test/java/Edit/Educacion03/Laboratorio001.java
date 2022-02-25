package Edit.Educacion03;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Laboratorio001 {
		@Test
		public void lab1_E2() {
			//1. Indicar donde esta el ChromeDriver
			System.setProperty("webdriver.gecko.driver","..\\EducacionTi\\Drivers\\geckodriver.exe");
			//2. instanciar el driver segun el navegador a utilizar
			WebDriver driver= new FirefoxDriver();
			//3. abrir el navegador en la pagina de selenium 
			driver.get("http://www.facebook.com");
			//4.cerrar el navegador 
			//driver.close();
					
		}
}
