# Tablas Maestras (9)

**Por qué son maestras:** representan entidades principales del negocio (personas, cursos, aulas, libros, usuarios). Tienen datos propios, perduran en el tiempo y apuntan a tablas de catálogo mediante claves foráneas.

| # | Tabla | Por qué |
|---|---|---|
| 1 | alumno | persona principal del sistema; usa distrito, sexo, tipodocumento, estadocivil |
| 2 | docente | persona principal; usa distrito, sexo, tipodocumento, estadocivil |
| 3 | empleado | persona principal; usa areaempleo, cargo, distrito, sexo, tipodocumento, estadocivil |
| 4 | aula | espacio físico; usa tipoaula, ubicacion, estadoaula |
| 5 | programa | carrera; pertenece a una facultad |
| 6 | planestudio | plan de un programa |
| 7 | curso | curso de un programa |
| 8 | libro | libro de la biblioteca; usa categorialibro, editorial |
| 9 | usuario | cuenta de acceso vinculada a un alumno, docente o empleado |
