class Producto:
    def _init_(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def precio_con_iva(self, iva=0.16):
        return self.precio * (1 + iva)

    def mostrar_info(self):
        print(f"Nmobre: {self.nombre}")
        print(f"Precio: {self.precio}")

class Telefono(Producto):
    def _init_(self, nombre, precio, num_sim):
        super()._init_(nombre, precio)
        self.num_sim = num_sim
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Sim: {self.num_sim}")
        print('-' * 30)

class Televisor(Producto):
    def _init_(self, nombre, precio, pulgadas):
        super()._init_(nombre, precio)
        self.pulgadas = pulgadas
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Pulgadas: {self.pulgadas}")

        print('-' * 30)

class Laptop(Producto):
    def _init_(self, nombre, precio, ram):
        super()._init_(nombre, precio)
        self.ram = ram
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Ram: {self.ram}")
        print('-' * 30)

producto = [
    Telefono("iPhone 14", 18000, 1),
    Televisor("Samsung 50", 9500, 50),
    Laptop("Dell Inspiron", 12000, 16)
]

for producto in productos:
    productos.mostrar_info()