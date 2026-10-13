# 4. Commits

Un **commit** es una foto de tus cambios con un mensaje que explica qué hiciste.

## Cómo guardar tus cambios

```bash
# Ver qué archivos cambiaste
git status

# Preparar los archivos
git add .

# Guardar con un mensaje
git commit -m "feat: crear entidad Alumno"
```

## Cómo escribir el mensaje

Formato: `tipo: descripción corta en minúsculas`

| Tipo | Cuándo | Ejemplo |
|---|---|---|
| `feat` | Agregaste algo nuevo | `feat: agregar endpoint de alumnos` |
| `fix` | Corregiste un error | `fix: agregar @Service a AlumnoServiceImpl` |
| `docs` | Solo documentación | `docs: agregar lista de tablas` |
| `refactor` | Mejoraste el código sin cambiar su función | `refactor: simplificar AlumnoService` |
| `test` | Pruebas | `test: probar servicio de alumno` |
| `chore` | Configuración, dependencias | `chore: actualizar pom.xml` |

## Buenas prácticas

- **Commits pequeños y frecuentes**, no uno gigante al final.
- **Un commit = una idea.** No mezcles cosas distintas.
- El mensaje dice **qué hiciste**, no "cambios" ni "arreglos" ni "asdf".
- Antes de `git add .`, revisa con `git status` que no estés subiendo archivos que no corresponden (por ejemplo `target/` o contraseñas).

## Subir tu rama a GitHub

La primera vez:

```bash
git push -u origin feature/12-crud-alumno
```

Las siguientes veces basta con:

```bash
git push
```
