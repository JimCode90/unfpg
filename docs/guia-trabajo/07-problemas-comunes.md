# 7. Problemas comunes

## Escribí código estando en `developer` o `main`

Todavía no hagas commit. Crea tu rama y los cambios te acompañan:

```bash
git checkout -b feature/12-crud-alumno
```

## Ya hice commit en la rama equivocada

Avisa al líder antes de hacer push. Se corrige, pero depende del caso.

## Mi rama está desactualizada

```bash
git checkout developer
git pull origin developer
git checkout feature/12-crud-alumno
git merge developer
```

## Hay conflictos al hacer merge

Git marca el archivo así:

```
<<<<<<< HEAD
tu código
=======
código del otro
>>>>>>> developer
```

1. Abre el archivo y deja solo el código correcto.
2. Borra las líneas `<<<<<<<`, `=======` y `>>>>>>>`.
3. Luego:

```bash
git add .
git commit -m "fix: resolver conflicto con developer"
```

Si no sabes cuál versión es la correcta, pregunta antes de decidir.

## Subí algo por error (una contraseña, por ejemplo)

Avisa **de inmediato** al líder. Cambiar la contraseña es lo primero, porque borrar el archivo después no la elimina del historial.

## Comandos útiles

| Comando | Qué hace |
|---|---|
| `git status` | Muestra qué cambió |
| `git branch` | Muestra en qué rama estás |
| `git log --oneline` | Muestra los últimos commits |
| `git diff` | Muestra los cambios sin guardar |
| `git checkout nombre-rama` | Cambia de rama |
