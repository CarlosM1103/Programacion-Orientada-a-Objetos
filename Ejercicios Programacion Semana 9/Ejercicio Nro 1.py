class Animal:
    def _init_(self, especie, nombre, edad, tipo_alimentacion):
        self.especie = especie
        self.nombre = nombre
        self.edad = edad
        self.tipo_alimentacion = tipo_alimentacion

    def mostrar_info(self):
        print(f"Especie {self.especie}")
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad}")
        print(f"Tipo de alimentacion: {self.tipo_alimentacion}")


class Aves(Animal):
    def _init_(self, especie, nombre, edad, tipo_alimentacion, accionA):
        super()._init_(especie, nombre, edad, tipo_alimentacion)
        self.accionA = accionA

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Accion del Ave: {self.accionA}")


class Mamiferos(Animal):
    def _init_(self, especie, nombre, edad, tipo_alimentacion, accionM):
        super()._init_(especie, nombre, edad, tipo_alimentacion)
        self.accionM = accionM

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Accion del Mamifero: {self.accionM}")


class Reptiles(Animal):
    def _init_(self, especie, nombre, edad, tipo_alimentacion, accionR):
        super()._init_(especie, nombre, edad, tipo_alimentacion)
        self.accionR = accionR

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Accion del reptil: {self.accionR}")


zoo = [
    Aves("Ave", "Grulla", 5, "Pescado", "Volar"),
    Mamiferos("Mamifero", "Vaca", 10, "Huevo", "Amamantar"),
    Reptiles("Reptil", "Cangrejo", 19, "Travas", "Reptar")
]
print("Informacion de los animales del ZOO")
for zoo in zoo:
    zoo.mostrar_info()