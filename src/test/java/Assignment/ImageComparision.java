package Assignment;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImageComparision {

	@Test

	public void test() throws IOException {
//			WebDriverManager.chromedriver().setup();
//			
//			//chrome
//			WebDriver driver=new ChromeDriver();
//			driver.get("https://mvnrepository.com/");

		BufferedImage ex = ImageIO.read(new File("./logo.png"));
		BufferedImage ac = ImageIO.read(new File("./js-logoNew.png"));

		ImageDiffer diff = new ImageDiffer();
		// ImageDiff d1=diff.makeDiff(i1, i2);
		ImageDiff d = diff.makeDiff(ex, ac);
		if (d.hasDiff()) {
			System.out.println("images are not same");
		} else {
			System.out.println("images are same");
		}

	}
}
