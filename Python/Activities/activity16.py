class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.trasmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")
	
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

bmw = Car("Tata","M",2024,"Petrol","Black")
rr = Car("Jaguar","A",2023,"Petrol","White")

bmw.accelerate()
rr.stop()