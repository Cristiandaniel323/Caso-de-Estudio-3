# Caso-de-Estudio-CompuWork---Actividad-3


---

Documentación del proceso 

**Informe de Integración y Validación — Actividad 3**

- **Objetivo:** Integrar las clases de gestión de RRHH (empleados, departamentos), proveer UI (CLI y Swing) y validar comportamiento mediante pruebas unitarias.
- **Cambios realizados:**
  - Implementado `Departamento.generarReporteDesempeño()` para evitar excepciones y producir reporte legible con nómina y conteos.
  - Añadido `equals`/`hashCode` en `Empleado` (basados en `id`) para operaciones con colecciones.
  - Corregido `GestionEmpleados.verEmpleadosPorDepartamento()` para que muestre los empleados.
  - Mejorada la creación de empleados en GUI para usar `JOptionPane` con `Departamento[]` (JComboBox).
- **Pruebas unitarias:**
  - `EmpleadoTest`: verifica cálculo de salario final y comportamiento de `equals`.
  - `DepartamentoTest`: agrega/emilina empleados y calcula nómina total.
  - `GestionEmpleadosReflectionTest`: valida la integración mínima entre listas estáticas, departamento y empleado (creación y asignación).
- **Herramientas:** Java 11, Maven, JUnit 5.
- **Ejecución de pruebas:** `mvn test` — todos los tests deben pasar.
- **Conclusión:** El sistema es funcional para demostración y para la actividad. Recomendaciones: persistencia, separación de capas (MVC) y exponer API para tests en vez de usar reflection.

---
