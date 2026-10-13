# 6. Revisar y aprobar (para el líder)

## Qué revisar en un PR

- [ ] La base es `developer`, no `main`
- [ ] Enlaza la issue (`Closes #N`)
- [ ] Hace lo que pedía la issue, ni más ni menos
- [ ] El código compila
- [ ] No hay contraseñas, datos reales ni archivos innecesarios
- [ ] Los nombres son claros y siguen el estilo del proyecto
- [ ] Los commits tienen mensajes claros

## Cómo revisar en GitHub

1. Abre el PR y entra a la pestaña **Files changed**.
2. Comenta líneas puntuales pulsando el `+` junto a la línea.
3. Pulsa **Review changes** y elige una opción:

| Opción | Cuándo |
|---|---|
| **Approve** | Todo está bien |
| **Request changes** | Hay cosas que corregir |
| **Comment** | Solo comentarios o dudas |

## Hacer el merge

1. Con el PR aprobado, pulsa **Squash and merge**. Junta todos los commits en uno limpio.
2. Pulsa **Delete branch** para borrar la rama ya usada.
3. La issue se cierra sola.

## Pasar de `developer` a `main`

Cuando `developer` esté estable, el líder crea un PR de `developer` hacia `main`. Solo el líder hace este paso.

## Configuración recomendada del repositorio (opcional)

En GitHub: `Settings → Branches → Add branch ruleset` para `main` y `developer`:
- Exigir Pull Request antes de unir
- Exigir al menos 1 aprobación
- Bloquear push directo

Así nadie rompe las reglas por accidente.

## Buenas prácticas al revisar

- Sé claro y amable: explica el porqué del cambio que pides.
- Revisa rápido para que nadie se quede bloqueado.
- Si algo es solo una preferencia, dilo como sugerencia.
