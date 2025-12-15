from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
  
  # Open the browser to the URL
 driver.get("https://training-support.net/webelements/login-form/")
 print(driver.title)

 driver.find_element(By.ID, "username").send_keys("admin")
 driver.find_element(By.ID, "password").send_keys("password")
 driver.find_element(By.XPATH, "//button[text()='Submit']").click()
 print(driver.title)

 driver.quit()