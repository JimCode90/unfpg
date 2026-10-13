# 5. Crear un Pull Request (PR)

Un **Pull Request** es pedir que revisen tu trabajo y lo unan a `developer`.

## Antes de crearlo (lista de chequeo)

- [ ] Hice `git push` de mi rama
- [ ] El proyecto compila: `./mvnw compile`
- [ ] Hice todo lo que pedía la issue
- [ ] No subí contraseñas ni archivos que sobran
- [ ] Mis commits tienen mensajes claros

## Pasos en GitHub

1. Entra al repositorio. Verás un botón **Compare & pull request** para tu rama. Púlsalo.
2. **Muy importante:** revisa los dos selectores de ramas.
   - `base`: **developer** (no `main`)
   - `compare`: tu rama
3. Escribe el **título**: igual que un mensaje de commit.
   Ejemplo: `feat: crear CRUD de alumno`
4. Llena la **descripción** con esta plantilla:

```
## Qué hice
- Creé la entidad, repositorio, servicio y controlador de Alumno

## Issue relacionada
Closes #12

## Cómo probarlo
1. Ejecutar la aplicación
2. Llamar a GET /api/alumno en Postman

## Lista de chequeo
- [x] El proyecto compila
- [x] Probé los endpoints
- [x] No subí contraseñas
```

5. A la derecha, en **Reviewers**, elige al líder.
6. Pulsa **Create pull request**.

## Qué significa `Closes #12`

Cuando el PR se una, GitHub cierra la issue 12 automáticamente. Cambia el número por el de tu issue.

## Después de crearlo

- **Espera la revisión.** No hagas merge tú.
- Si el líder pide cambios: haz los cambios en la **misma rama**, haz commit y `git push`. El PR se actualiza solo.
- Cuando se apruebe y se una, vuelve a `developer` y actualízala:

```bash
git checkout developer
git pull origin developer
```
