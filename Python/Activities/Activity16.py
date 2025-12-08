class Activity16:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print (f"{self.manufacturer} {self.model} has stopped")

obj1=Activity16("qualis","2014", "India", "engine", "red")

obj1.accelerate()
obj1.stop()

