import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Trivago {
    @Test

    public void HomeTrivago() throws InterruptedException, ParseException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        //Determinando tempo de espera
        navegador.get(" http://www.trivago.com.br ");
        //Abrir o site Buscar cep
        navegador.findElement(By.id("input-auto-complete")).click();
        navegador.findElement(By.id("input-auto-complete")).sendKeys("m");
        navegador.findElement(By.id("input-auto-complete")).sendKeys("a");
        navegador.findElement(By.id("input-auto-complete")).sendKeys("n");
        navegador.findElement(By.id("input-auto-complete")).sendKeys("a");
        navegador.findElement(By.id("input-auto-complete")).sendKeys("u");
        navegador.findElement(By.id("input-auto-complete")).sendKeys("s");
        Thread.sleep(1000);
       // inserir destino (Manaus)
       WebElement radiobutton1 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/div[3]/button/span/span"));
        radiobutton1.click();
        //pesquisar
        Thread.sleep(2000);
            navegador.findElement(By.xpath("/html/body/div[1]/div/main/div[3]/div[2]/div[1]/div/div[2]/div/button/span/span")).click();
            Thread.sleep(1000);
            Select order1 = new Select(navegador.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[4]/div[1]/div/section/div/select"))); //
            order1.selectByValue("6");
            //Ordenando por Avaliações sujestões
        navegador.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[4]/section/div/ol/li[1]/div/article/div[2]/div[1]/h3/button"));
        //Verificando nome do primeiro da lista
        Thread.sleep(3000);
        WebElement radiobutton3 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/div[1]/main/div[4]/section/div/ol/li[1]/div/article/div[2]/div[1]/div[2]/button/span[2]"));
        radiobutton3.click();
        navegador.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[4]/section/div/ol/li[1]/div/div/div[2]/div/div"));
        //Ver avaliações
        Thread.sleep(3000);
        WebElement radiobutton4 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/div[1]/main/div[4]/section/div/ol/li[1]/div/div/div[2]/div/section/footer/button"));
        radiobutton4.click();
        //Verificando Avaliações
        WebElement radiobutton5 = navegador.findElement(By.xpath("" +
                "/html/body/div[1]/div[1]/main/div[4]/section/div/ol/li[1]/div/footer/button/span"));
        radiobutton5.click();
        //fechar Avaliações
        Thread.sleep(3000);
        navegador.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[4]/section/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div"));
        //Verificar Valor


    }
}
