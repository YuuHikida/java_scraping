package com.example.scraping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrapingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrapingApplication.class, args);

		// Chromeブラウザのオプションを設定
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/Applications/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");

		// WebDriverの初期化（Selenium Managerが自動的にドライバを設定）
		WebDriver driver = new ChromeDriver(options);

		final String URL = "http://www.google.com";
		// URL遷移
		driver.get(URL);
	}
}
