class Banco:
    def __init__(self, Numcuenta, Saldo, Tipo):
        self.Numcuenta = Numcuenta
        self.Saldo = Saldo
        self.Tipo = Tipo

    def mostrar_info(self):
        print(f"Tipo de cuenta: {self.Tipo}")
        print(f"Número de cuenta: {self.Numcuenta}")
        print(f"Saldo: {self.Saldo}")

class CuentaAhorro(Banco):
    def __init__(self, Numcuenta, Saldo, Interes, Tipo="Ahorros"):
        super()._init_(Numcuenta, Saldo, Tipo)
        self.Interes = Interes

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Interés: {self.Interes}")

class CuentaCorriente(Banco):
    def __init__(self, Numcuenta, Saldo, Sobregiro, Tipo="Corriente"):
        super()._init_(Numcuenta, Saldo, Tipo)
        self.Sobregiro = Sobregiro

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Sobregiro: {self.Sobregiro}")

class CuentaInversion(Banco):
    def __init__(self, Numcuenta, Saldo, Rendimiento, Tipo="Inversión"):
        super()._init_(Numcuenta, Saldo, Tipo)
        self.Rendimiento = Rendimiento

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Rendimiento: {self.Rendimiento}")

cuentas = [
    CuentaAhorro(Numcuenta=21929219129, Saldo=150, Interes=5),
    CuentaCorriente(Numcuenta=4573788722, Saldo=300, Sobregiro=50),
    CuentaInversion(Numcuenta=4573788722, Saldo=237, Rendimiento=70),
]

print("Información de las cuentas de la plataforma:\n")
for cuenta in cuentas:
    cuenta.mostrar_info()
    print("-" * 30)