# 3. Crear tu rama

Una **rama** es una copia donde trabajas sin afectar a nadie más.

## Cómo nombrarla

Formato: `tipo/numero-issue-descripcion-corta`

| Tipo | Cuándo se usa | Ejemplo |
|---|---|---|
| `feature` | Algo nuevo | `feature/12-crud-alumno` |
| `fix` | Corregir un error | `fix/15-error-autowired` |
| `docs` | Solo documentación | `docs/20-guia-github` |
| `refactor` | Mejorar código sin cambiar lo que hace | `refactor/22-limpiar-servicios` |

**Reglas del nombre:** minúsculas, palabras separadas con guion `-`, sin espacios ni tildes, corto y claro.

## Pasos

Ejecuta estos comandos en la terminal, dentro de la carpeta del proyecto.

```bash
# 1. Ir a developer
git checkout developer

# 2. Traer lo último que hay en GitHub
git pull origin developer

# 3. Crear tu rama y entrar en ella
git checkout -b feature/12-crud-alumno
```

## Cómo comprobar que estás en tu rama

```bash
git branch
```

La rama con `*` es en la que estás. Debe ser la tuya, **nunca `main` ni `developer`**.

## Importante

- Haz el paso 2 **siempre**, así partes del código más reciente.
- Si ya empezaste a escribir código estando en `developer`, avisa antes de seguir. Se puede arreglar (ver [problemas comunes](07-problemas-comunes.md)).
