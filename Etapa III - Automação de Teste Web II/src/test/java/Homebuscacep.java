import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Homebuscacep {
    @Test

    public void HomePage() throws InterruptedException, ParseException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        //Determinando tempo de espera
        navegador.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        //Abrir o site Buscar cep
        navegador.findElement(By.id("endereco")).sendKeys("69005-040");
        //Buscar por Cep
        navegador.findElement(By.id("btn_pesquisar")).click();
        //Clicar no botão  buscar
        Thread.sleep(3000);
        navegador.findElement(By.id("btn_voltar")).click();
// fazer nova pesquisa
        Thread.sleep(3000);
        navegador.findElement(By.id("endereco")).sendKeys("Lojas Bemol");
        navegador.findElement(By.id("btn_pesquisar")).click();
        Thread.sleep(3000);
        //Clicar no botão  buscar
    }
}
