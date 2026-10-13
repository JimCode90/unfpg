# 8. Usar el skill `flujo-github`

El proyecto trae un **skill** de Claude Code que hace por ti los pasos de Git: crea la rama, los commits y el Pull Request, siguiendo esta guía.

No necesitas instalarlo: viene en el repositorio, en `.claude/skills/flujo-github/`. Al abrir Claude Code dentro del proyecto, ya está disponible.

## Antes de usarlo (una sola vez)

1. **Instala Claude Code** y abre la terminal dentro de la carpeta del proyecto.
2. **Instala la CLI de GitHub (`gh`)**:
   - Mac: `brew install gh`
   - Windows: `winget install --id GitHub.cli`
3. **Inicia sesión en GitHub:**

```bash
gh auth login
```

4. **Comprueba que funciona:**

```bash
gh auth status
```

## Cómo usarlo

Cuando termines tu trabajo de una issue:

1. Abre Claude Code en la carpeta del proyecto:

```bash
claude
```

2. Escribe:

```
/flujo-github
```

   o dilo con tus palabras, por ejemplo: `sube mi trabajo de la issue 12`.

3. Responde lo que te pregunte:
   - El **número de la issue** (por ejemplo `12`).
   - Qué hiciste, si no queda claro por los cambios.

4. **Revisa el plan que te muestra.** Antes de crear los commits te enseña:
   - El nombre de la rama.
   - La lista de commits y los archivos de cada uno.

   Confirma solo si te parece correcto.

5. El skill hace el resto: compila el proyecto, sube la rama y abre el Pull Request hacia `developer`.
6. Al final te da el **enlace del PR**. Pásaselo al líder para que lo revise.

## Qué hace, paso a paso

| Paso | Qué hace |
|---|---|
| 1 | Pregunta el número de issue |
| 2 | Crea la rama `tipo/numero-descripcion` desde `developer` |
| 3 | Agrupa tus cambios en commits pequeños con mensajes `feat:`, `fix:`, etc. |
| 4 | Ejecuta `./mvnw compile`. Si falla, no sube nada |
| 5 | Hace `git push` de tu rama |
| 6 | Abre el PR hacia `developer` con la descripción y `Closes #N` |

## Lo que nunca hace

- Trabajar o hacer commit en `main` o `developer`.
- Hacer merge de tu PR (lo hace el líder).
- Subir archivos como `.DS_Store`, `target/` o contraseñas.
- Agregar atribuciones a los commits o al PR: todo sale a tu nombre.

## Si algo falla

| Problema | Qué hacer |
|---|---|
| `gh: command not found` | Instala la CLI de GitHub (ver "Antes de usarlo") |
| `gh auth status` dice que no hay sesión | Ejecuta `gh auth login` |
| No aparece `/flujo-github` | Abre Claude Code **desde la carpeta del proyecto**. Si sigue sin aparecer, haz `git pull origin developer` para traer el skill |
| El proyecto no compila | Lee el error que muestra, corrígelo y vuelve a ejecutar `/flujo-github` |
| Te pide permisos para ejecutar comandos | Es normal. Léelos y acepta los de Git y `gh` |
| Dudas sobre un archivo que quiere subir | Respóndele que no lo incluya y pregunta al líder |

## Recuerda

El skill no reemplaza entender la guía. Léela completa para saber qué está haciendo en cada paso, porque si algo sale mal tendrás que saber corregirlo (ver [problemas comunes](07-problemas-comunes.md)).
