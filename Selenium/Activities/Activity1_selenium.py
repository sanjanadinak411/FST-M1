from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
  
  # Open the browser to the URL
 driver.get("https://training-support.net")
  
 driver.find_element(By.LINK_TEXT, "About Us").click()
 print(driver.title)

 driver.quit()