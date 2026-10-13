---
name: flujo-github
description: Crea la rama de trabajo desde developer, hace los commits y abre el Pull Request hacia developer siguiendo la guía del equipo (docs/guia-trabajo). Úsalo cuando el usuario diga que terminó o quiere subir el trabajo de una issue, o pida crear la rama, los commits o el PR.
---

# Flujo de GitHub del equipo

Sigue la guía `docs/guia-trabajo/`. Habla en español y con lenguaje sencillo: la persona que te usa está aprendiendo.

## Reglas que no se rompen

- Nunca trabajes, hagas commit ni push en `main` ni en `developer`.
- Una issue = una rama = un Pull Request.
- El PR siempre apunta a `developer`, nunca a `main`.
- No hagas merge del PR: lo revisa y aprueba el líder.
- **No agregues atribuciones.** Ningún mensaje de commit ni descripción de PR debe incluir `Co-Authored-By`, "Generated with Claude" ni mención a Claude o a una IA. Los commits y el PR salen a nombre de la persona.
- No uses `--force`, `--no-verify`, `reset --hard` ni `git add -A` a ciegas.

## Paso 1: reunir datos

Pregunta lo que no sepas:

1. **Número de la issue** (por ejemplo `12`).
2. **Qué se hizo**, si no se deduce de los cambios.

Luego revisa el estado con `git status` y `git branch --show-current`.

## Paso 2: la rama

Formato: `tipo/numero-descripcion-corta`, en minúsculas, con guiones y sin tildes ni espacios.

| Tipo | Cuándo |
|---|---|
| `feature` | Algo nuevo |
| `fix` | Corregir un error |
| `docs` | Solo documentación |
| `refactor` | Mejorar código sin cambiar lo que hace |

Ejemplo: `feature/12-crud-catalogos`.

- Si ya está en una rama de trabajo (no `main` ni `developer`), úsala y no crees otra.
- Si está en `developer` o `main` con cambios sin guardar, crea la rama nueva desde ahí: los cambios la acompañan.
- Si no hay cambios pendientes, actualiza antes:

```bash
git checkout developer
git pull origin developer
git checkout -b <rama>
```

Si hay cambios pendientes y está en `developer`, haz `git pull origin developer` solo si el árbol está limpio; si no, crea la rama y avisa que conviene actualizarla después.

## Paso 3: los commits

1. Muestra `git status` y decide qué entra. **Excluye siempre** `.DS_Store`, `target/`, `.idea/`, archivos con contraseñas o credenciales, y cualquier cosa fuera de lo que pide la issue. Si dudas de un archivo, pregunta.
2. Agrupa los cambios en commits pequeños, uno por idea (por ejemplo, un commit por tabla o por capa).
3. Prepara solo los archivos de cada commit con `git add <archivos>`.
4. Mensaje: `tipo: descripción corta en minúsculas`.

| Tipo | Cuándo |
|---|---|
| `feat` | Algo nuevo |
| `fix` | Corregir un error |
| `docs` | Documentación |
| `refactor` | Mejorar sin cambiar el comportamiento |
| `test` | Pruebas |
| `chore` | Configuración o dependencias |

Ejemplos: `feat: crear CRUD de sexo`, `fix: agregar @Service a AlumnoServiceImpl`.

5. **Antes de crear los commits, muestra la lista de commits y de archivos de cada uno, y pide confirmación.**

## Paso 4: comprobar y subir

1. Ejecuta `./mvnw compile`. Si falla, **no subas nada**: explica el error y ayuda a corregirlo.
2. Sube la rama:

```bash
git push -u origin <rama>
```

## Paso 5: el Pull Request

Crea el PR con la CLI de GitHub (`gh`). Si `gh` no está instalado o autenticado, dile que ejecute `gh auth login` o que lo cree desde la web con el enlace que muestra `git push`, y entrégale el título y la descripción listos para pegar.

```bash
gh pr create --base developer --head <rama> --title "<título>" --body-file <archivo-temporal>
```

- **Título:** como un mensaje de commit. Ejemplo: `feat: CRUD de catálogos de personas y aulas`.
- **Descripción** (sin atribuciones):

```
## Qué hice
- <resumen en viñetas>

## Issue relacionada
Closes #<número>

## Cómo probarlo
1. <pasos>

## Lista de chequeo
- [x] El proyecto compila
- [x] Probé los endpoints
- [x] No subí contraseñas
```

- Pide como reviewer al líder si se conoce su usuario: `--reviewer <usuario>`.
- Escribe la descripción en un archivo temporal para que se respeten los saltos de línea, y bórralo al terminar.

## Paso 6: cierre

Entrega el enlace del PR y recuérdale:

- Esperar la revisión y no hacer merge.
- Si piden cambios, hacerlos en la misma rama, commit y `git push`.
- Al terminar, volver a actualizar `developer`:

```bash
git checkout developer
git pull origin developer
```
