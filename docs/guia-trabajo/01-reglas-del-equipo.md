# 1. Reglas del equipo

## Ramas del proyecto

| Rama | Para qué sirve | ¿Se trabaja directo aquí? |
|---|---|---|
| `main` | Versión estable y final | **NO, nunca** |
| `developer` | Donde se juntan los trabajos del equipo | **NO** (solo por Pull Request) |
| `feature/...`, `fix/...` | Tu rama personal para una issue | **SÍ** |

## Las reglas

1. **Nadie hace push directo a `main` ni a `developer`.** Todo entra por Pull Request.
2. **Una issue = una rama = un Pull Request.**
3. **Cada rama sale de `developer`**, siempre actualizada.
4. **Nadie aprueba su propio Pull Request.** Lo revisa el líder.
5. **No se suben contraseñas ni datos reales.** Nada de claves de MySQL en el código.
6. **Antes de pedir revisión, el proyecto debe compilar** (`./mvnw compile`).
7. **Si tienes una duda, pregunta en la issue.** Es mejor preguntar que adivinar.
8. **No te salgas de lo que pide la issue.** Si ves otra cosa por mejorar, crea una issue nueva.

## Roles

- **Líder:** crea y asigna issues, revisa y aprueba Pull Requests, hace el merge.
- **Compañeros:** trabajan sus issues y abren Pull Requests.
