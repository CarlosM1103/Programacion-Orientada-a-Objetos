class Universidad:
    def __init__(self, nombre, Id, Correo):
        self.nombre = nombre
        self.Id = Id
        self.Correo = Correo

    def Mostrar_info(self):
        print("\n--- Información Universidad ---")
        print(f'Nombre: {self.nombre}')
        print(f'Id: {self.Id}')
        print(f'Correo: {self.Correo}')

class Estudiantes(Universidad):
    def __init__(self, nombre, Id, Correo, Carrera, Promedio):
        super()._init_(nombre, Id, Correo)
        self.Carrera = Carrera
        self.Promedio = Promedio

    def Mostrar_info(self):
        super().Mostrar_info()
        print(f'Carrera: {self.Carrera}')
        print(f'Promedio: {self.Promedio}')

class Docentes(Universidad):
    def __init__(self, nombre, Id, Correo, Materias):
        super()._init_(nombre, Id, Correo)
        self.Materias = Materias

    def Mostrar_info(self):
        super().Mostrar_info()
        print(f'Materias: {self.Materias}')

class Administracion(Universidad):
    def __init__(self, nombre, Id, Correo, Departamento):
        super()._init_(nombre, Id, Correo)
        self.Departamento = Departamento

    def Mostrar_info(self):
        super().Mostrar_info()
        print(f'Departamento: {self.Departamento}')


print("=== REGISTRO DE ESTUDIANTE ===")
nombre_est = input("Ingresa el nombre del estudiante: ")
id_est = input("Ingresa el ID del estudiante: ")
correo_est = input("Ingresa el correo del estudiante: ")
carrera_est = input("Ingresa la carrera: ")
promedio_est = float(input("Ingresa el promedio: "))
estudiante = Estudiantes(nombre_est, id_est, correo_est, carrera_est, promedio_est)

print("\n=== REGISTRO DE DOCENTE ===")
nombre_doc = input("Ingresa el nombre del docente: ")
id_doc = input("Ingresa el ID del docente: ")
correo_doc = input("Ingresa el correo del docente: ")
materias_doc = input("Ingresa las materias que enseña: ")
docente = Docentes(nombre_doc, id_doc, correo_doc, materias_doc)

print("\n=== REGISTRO DE ADMINISTRACIÓN ===")
nombre_adm = input("Ingresa el nombre del administrativo: ")
id_adm = input("Ingresa el ID del administrativo: ")
correo_adm = input("Ingresa el correo del administrativo: ")
departamento_adm = input("Ingresa el departamento: ")
administrativo = Administracion(nombre_adm, id_adm, correo_adm, departamento_adm)


print("\n========================")
print(" INFORMACIÓN REGISTRADA")
print("========================")

print("\n Estudiante:")
estudiante.Mostrar_info()

print("\n Docente:")
docente.Mostrar_info()

print("\n Administrativo:")
administrativo.Mostrar_info()
